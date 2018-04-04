
public class TimeSpan {
	private int totalMinutes;
	public TimeSpan(int hours, int minutes) {
		totalMinutes = 0;
		add(hours, minutes);
	}
	//mutator/setter: mutates the totalMinutes to the new added time
	public void add(int hours, int minutes) {
		if (hours < 0 || minutes < 0) {
			throw new IllegalArgumentException();
		} else {
			totalMinutes += hours*60 + minutes;
		}
	}
	public int getHour() {
		return totalMinutes/60;
	}
	public int getMinutes() {
		return totalMinutes%60;
	}
	public void add(TimeSpan span) {
		
	}
	public String toString() {
		return "hours: " + totalMinutes/60 + "minutes: " + totalMinutes%60;
	}

}
