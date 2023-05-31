package marathon;

import java.util.*;

public class Marathon {

	private static Marathon instance = null;
	private static String COMPETITION_NAME = "제1회 E-ZEN 마라톤대회"; // 행사명
	private ArrayList<Player> playerList = new ArrayList<>(); // 행사에 참여한 선수
	private ArrayList<Course> courseList = new ArrayList<>(); // 행사에서 개설한 마라톤 코스

	// 싱글톤 생성자
	private Marathon() {
	}

	public static Marathon getInstance() {
		if (instance == null) {
			instance = new Marathon();
		}
		return instance;
	}

	// 참가 선수등록
	public void addPlayer(Player player) {
		playerList.add(player);
	}

	// 코스개설
	public void addCourse(Course course) {
		courseList.add(course);
	}

	// 대회에 등록한 선수리스트 출력
	public ArrayList<Player> getPlayerList() {
		return playerList;
	}

	// 대회에 개설된 코스리스트 출력
	public ArrayList<Course> getCourseList() {
		return courseList;
	}

}
