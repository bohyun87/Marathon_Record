package grade;

public class GradeFull implements Grade {

	@Override
	public String getGrade(String time) {
		String grade = null;
		
		String[] timeArray = time.split(":");
		int HH = Integer.parseInt(timeArray[0]);
		int mm = Integer.parseInt(timeArray[1]);
		int ss = Integer.parseInt(timeArray[2]);
		
		if( (HH < 2 && mm <= 59) || ( HH == 2 && mm ==00 )) {
			grade = "S";
		} else if (HH == 2 && mm > 00  && mm <= 30 ) {
			grade = "A";
		} else if((HH == 2 && mm > 30  && mm <= 59) || (HH == 3 && mm == 00)) {
			grade = "B";
		} else if( (HH == 3 && mm > 00 && mm <= 59) || (HH == 4 && mm == 00)) {
			grade = "C";
		} else if( (HH == 4 && mm > 00 && mm <= 59) || (HH == 5 && mm == 00)) {
			grade = "D";
		} else if( HH == 6 && mm > 00) {
			grade = "DNF";
		}
		
		return grade;
	}
	
}
