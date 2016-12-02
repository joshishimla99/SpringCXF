package timecounter.controller;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicLong;

import timecounter.service.api.vo.HitCounterInfo;
/**
 * 
 * @author Dinesh.Joshi
 * This class deals with the bussiness logic regarding timeCounterService
 */
public class TimeCounterController {

	private static final String ISO_8601_FMT = "yyyy-MM-dd'T'HH:mm:ss X";
	/**
	 * callCounts - long variable which can be read and written atomically
	 */
	AtomicLong callCounts = new AtomicLong(0);
	
	/**
	 * 
	 * @return - Value object related to HitCounterService
	 */
	public HitCounterInfo getHitCount() {
		callCounts.incrementAndGet();
		String currentDate = DateTimeFormatter.ofPattern(ISO_8601_FMT).withZone(ZoneOffset.UTC).format(Instant.now());
		HitCounterInfo hitCounterInfo = new HitCounterInfo(callCounts.get(),currentDate);
		return hitCounterInfo;
	}
	
}
