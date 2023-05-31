package application;

import marathon.*;
import marathon.Record;
import marathon.report.*;
import utils.Define;

public class PlayerInfoApplication {

	Marathon ezenMarathon = Marathon.getInstance();	//대회
	Course tenK;
	Course half;
	Course full;
	GradeReport gradeReport = new GradeReport();
	
	public static void main(String[] args) {
		PlayerInfoApplication test = new PlayerInfoApplication();
		test.createCourse();
		test.createPlayer();
		
		String report = test.gradeReport.getReport();
		System.out.println(report);	
		
	}
	
	
	//코스 생성 메소드
	public void createCourse() {
		tenK = new Course("10km", Define.TEN_K_COURSE);
		half = new Course("하프코스", Define.HALF_COURSE);
		full = new Course("풀코스", Define.FULL_COURSE);		
		
		//대회에 코스 등록하기
		ezenMarathon.addCourse(tenK);
		ezenMarathon.addCourse(half);
		ezenMarathon.addCourse(full);		
	} 	
	
		//선수 생성 메소드
	public void createPlayer() {
		//선수생성
		Player player1 = new Player("최보현", 1001, half);
		Player player2 = new Player("김혜미", 1002, half);
		Player player3 = new Player("유재송", 1003, tenK);
		Player player4 = new Player("박성오", 1004, full);
		Player player5 = new Player("이병호", 1005, full);
		Player player6 = new Player("이광호", 1006, tenK);
		Player player7 = new Player("한지영", 1007, tenK);
		Player player8 = new Player("최가영", 1008, half);
		Player player9 = new Player("황정미", 1009, half);
		Player player10 = new Player("한대웅", 1010, full);
		Player player11 = new Player("전창호", 1011, full);
		Player player12 = new Player("채유진", 1012, tenK);
		Player player13 = new Player("오윤주", 1013, tenK);
		Player player14 = new Player("곽운도", 1014, full);
		
		
			//대회에 선수 등록
			ezenMarathon.addPlayer(player1);
			ezenMarathon.addPlayer(player2);
			ezenMarathon.addPlayer(player3);
			ezenMarathon.addPlayer(player4);
			ezenMarathon.addPlayer(player5);
			ezenMarathon.addPlayer(player6);
			ezenMarathon.addPlayer(player7);
			ezenMarathon.addPlayer(player8);
			ezenMarathon.addPlayer(player9);
			ezenMarathon.addPlayer(player10);
			ezenMarathon.addPlayer(player11);
			ezenMarathon.addPlayer(player12);
			ezenMarathon.addPlayer(player13);
			ezenMarathon.addPlayer(player14);
		
			
			//코스별 등록 선수
			//10K코스
			tenK.register(player3);
			tenK.register(player6);
			tenK.register(player7);
			tenK.register(player12);
			tenK.register(player13);
		
			//하프코스
			half.register(player1);
			half.register(player2);
			half.register(player8);
			half.register(player9);
		
			//풀코스
			full.register(player4);
			full.register(player5);
			full.register(player10);
			full.register(player11);
			full.register(player14);		
		
			//선수별 완주기록 등록
			addRecordForPlayer(player1, half, "01:22:58");
			addRecordForPlayer(player2, half, "01:26:20");
			addRecordForPlayer(player3, tenK, "01:03:22");
			addRecordForPlayer(player4, full, "04:16:07");
			addRecordForPlayer(player5, full, "04:11:45");
			addRecordForPlayer(player6, tenK, "00:52:36");
			addRecordForPlayer(player7, tenK, "01:06:17");
			addRecordForPlayer(player8, half, "02:09:42");
			addRecordForPlayer(player9, half, "01:59:18");
			addRecordForPlayer(player10, full, "03:32:48");
			addRecordForPlayer(player11, full, "04:02:20");
			addRecordForPlayer(player12, tenK, "01:05:32");
			addRecordForPlayer(player13, tenK, "01:02:11");
			addRecordForPlayer(player14, full, "04:05:37");
	}

	
	//선수 완주기록 등록하는 메소드
	private void addRecordForPlayer(Player player, Course course, String time) {
		Record record = new Record(player.getBibNumber(), course, time);
		player.addCourseRecord(record);
		
		
		
	}	
	
	
}
