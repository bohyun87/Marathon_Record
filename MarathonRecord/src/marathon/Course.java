package marathon;

import java.util.ArrayList;

import utils.Define;

public class Course {
	private String courseName;
	private int courseId;
	private int gradeType;
	
	private ArrayList<Player> playerList = new ArrayList<>();
	

	public Course(String courseName, int courseId) {
		this.courseName = courseName;
		this.courseId = courseId;
		this.gradeType = Define.TEN_K_COURSE;
	}
	
	public void register(Player player) {
		playerList.add(player);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(ArrayList<Player> playerList) {
		this.playerList = playerList;
	}
	
	
}
