package grade;

public class Grade10K implements Grade {

	@Override
	public String getGrade(String time) {
		String grade = null;
		
		String[] timeArray = time.split(":");
		int HH = Integer.parseInt(timeArray[0]);
		int mm = Integer.parseInt(timeArray[1]);
		int ss = Integer.parseInt(timeArray[2]);
		
		if( HH == 0 && mm <= 40 ) {
			grade = "S";
		} else if (HH == 0 && mm < 50 ) {
			grade = "A";
		} else if( (HH == 0 && mm <= 59 ) || (HH == 1 && mm == 00)) {
			grade = "B";
		} else if( HH == 1 && mm > 00 && mm <= 10) {
			grade = "C";
		}  else if( HH == 1 && mm > 10 && mm <= 30) {
			grade = "D";
		} else if( HH == 1 && mm > 30) {
			grade = "DNF";
		}
		
		return grade;
	}

}
