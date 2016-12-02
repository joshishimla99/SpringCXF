package timecounter.service.impl;

import timecounter.controller.TimeCounterController;
import timecounter.service.api.HitCounterService;
import timecounter.service.api.vo.HitCounterInfo;

/**
 * 
 * @author Dinesh.Joshi
 *
 */
public class HitCounterServiceImpl  implements HitCounterService{

	/**
	 * controller - controls the value object and send back result to client
	 */
	private TimeCounterController timeCountController;
	
	@Override
	public HitCounterInfo getHitCount() {
		return timeCountController.getHitCount();
	}

	
	public TimeCounterController getTimeCountController() {
		return timeCountController;
	}

	
	public void setTimeCountController(TimeCounterController timeCountController) {
		this.timeCountController = timeCountController;
	}
	
}
