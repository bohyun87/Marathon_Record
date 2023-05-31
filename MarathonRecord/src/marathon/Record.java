package marathon;

public class Record {
	private int bibNumber;	//배번호
	private Course course;	//코스
	private String time = "HH:mm:ss";	//기록
	

	//생성자
	public Record(int bibNumber, Course course, String time) {
		this.bibNumber = bibNumber;
		this.course = course;
		this.time = time;
	}

	@Override
	public String toString() {
		return "배번호: " + this.bibNumber + ", " + course.getCourseName() + ":" + time;
	}

	public int getBibNumber() {
		return bibNumber;
	}

	public void setBibNumber(int bibNumber) {
		this.bibNumber = bibNumber;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	
	
	
	
}
