package marathon.report;

import java.util.ArrayList;

import marathon.*;
import marathon.Record;
import utils.Define;
import grade.*;


public class GradeReport {
	Marathon marathon = Marathon.getInstance();
	
	public static final String TITLE = "   [제 1회 E-ZEN 마라톤 대회]";
	public static final String MINI_TITLE = " Course \t\t\n";
	public static final String HEADER = " 이름 | 배번호 | 코스 | 기록(grade)          \n";
	public static final String LINE = "---------------------------------------\n";
	
	
	
	private StringBuffer buffer = new StringBuffer();
	
	//헤더, 바디, 푸터 합쳐주는메소드
	public String getReport() {
		ArrayList<Course> courseList = marathon.getCourseList();
		
		System.out.println(GradeReport.TITLE);
		
		for(Course course : courseList) {
			makeHeader(course);
			makeBody(course);
			makeFooter();
		}
		
		return buffer.toString();		
	}
	
	
	//헤더
	public void makeHeader(Course course) {
		buffer.append(GradeReport.LINE);
		buffer.append("\t" + course.getCourseName());
		buffer.append(GradeReport.MINI_TITLE);
		buffer.append(GradeReport.HEADER);
		buffer.append(GradeReport.LINE);		
	}
		
	//바디
	public void makeBody(Course course) {
		ArrayList<Player> playerList = course.getPlayerList();
		
		for(Player player : playerList) {
			buffer.append(player.getPlayerName());
			buffer.append(" | ");
			buffer.append(player.getBibNumber());
			buffer.append(" | ");
			buffer.append(player.getCoures().getCourseName());
			buffer.append(" | ");			
			
			getRecordGrade(player, course.getCourseId());
			buffer.append("\n");			
		}
	}
	
	//완주자 별 등급 부여하기
	public void getRecordGrade(Player player, int courseId) {
		ArrayList<Record> scoreList = player.getRecordList();
		
		int mycourseId = player.getCoures().getCourseId();
		
		Grade[] courseGrade = {new Grade10K(), new GradeHalf(), new GradeFull()};
		
		for(Record record : scoreList) {
			
			if(record.getCourse().getCourseId() == mycourseId) {
				String grade = null;
				
				if(mycourseId == Define.TEN_K_COURSE) {
					grade = courseGrade[Define.TENK_TYPE].getGrade(record.getTime());
				} else if (mycourseId == Define.HALF_COURSE) {
					grade = courseGrade[Define.HALF_TYPE].getGrade(record.getTime());
				} else if (mycourseId == Define.FULL_COURSE) {
					grade = courseGrade[Define.FULL_TYPE].getGrade(record.getTime());
				}
				
				buffer.append(record.getTime());
				buffer.append("(");
				buffer.append(grade);
				buffer.append(")");
				
			}
		}		
	}	
	
	//푸터
	public void makeFooter() {
		buffer.append("\n");
	}
	
	
	
	
}