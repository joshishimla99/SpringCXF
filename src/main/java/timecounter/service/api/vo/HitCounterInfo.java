
package timecounter.service.api.vo;

/**
 * 
 * @author Dinesh.Joshi This class is the data model for HitCounterService
 */
public class HitCounterInfo {

	/**
	 * timeStamp - time stamp when the user hit this service
	 */
	private String timeStamp;

	/**
	 * calls - counter to track the number of hits on this service
	 */
	private Long calls;

	public HitCounterInfo(long calls, String timeStamp) {
		this.calls = calls;
		this.timeStamp = timeStamp;
	}

	/**
	 * 
	 * @return time stamp when the user hit this service
	 */
	public String getTimeStamp() {
		return timeStamp;
	}

	/**
	 * 
	 * @param timeStamp - time stamp when the user hit this service
	 */
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	/**
	 * 
	 * @return counter to track the number of hits on this service
	 */
	public Long getCalls() {
		return calls;
	}

	/**
	 * @param calls - counter to track the number of hits on this service
	 */
	public void setCalls(Long calls) {
		this.calls = calls;
	}

	@Override
	public String toString() {
		return "timestamp=" + timeStamp + ", calls=" + calls;
	}

}
