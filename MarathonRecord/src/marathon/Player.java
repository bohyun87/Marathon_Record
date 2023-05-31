package marathon;

import java.util.ArrayList;

public class Player {
	private String playerName;
	private int bibNumber;
	private Course coures;
	
	private ArrayList<Record> recordList = new ArrayList<>();
	
	
	public Player(String playerName, int bibNumber, Course coures) {
		this.playerName = playerName;
		this.bibNumber = bibNumber;
		this.coures = coures;
	}
	
	public void addCourseRecord(Record record) {
		recordList.add(record);
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getBibNumber() {
		return bibNumber;
	}

	public void setBibNumber(int bibNumber) {
		this.bibNumber = bibNumber;
	}

	public Course getCoures() {
		return coures;
	}

	public void setCoures(Course coures) {
		this.coures = coures;
	}

	public ArrayList<Record> getRecordList() {
		return recordList;
	}

	public void setRecordList(ArrayList<Record> recordList) {
		this.recordList = recordList;
	}
	
	
}
