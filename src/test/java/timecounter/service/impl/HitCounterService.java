package timecounter.service.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import timecounter.service.api.vo.HitCounterInfo;
import timecounter.service.impl.HitCounterServiceImpl;

public class HitCounterService {

	private HitCounterServiceImpl counterServiceImpl;
	private  ApplicationContext context ;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext 
						            ("beans.xml");
		counterServiceImpl = context.getBean(HitCounterServiceImpl.class);
	}

	@After
	public void tearDown() throws Exception {
		context = null;	
	}

	@Test
	public void testGetHitCount() {
		Assert.notNull(counterServiceImpl);
		HitCounterInfo hitCount = null;
		for(int i=1;i<=4;++i) {
			hitCount = counterServiceImpl.getHitCount();
		}
		Assert.isTrue(hitCount.getCalls() == 5L);
	}

}
