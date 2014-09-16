package com.brownylin.service;

import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.testng.annotations.Test;

import com.brownylin.config.AppContext;

public class JodaTimeServiceTest
{
	JodaTimeService testedService = (JodaTimeService)
		AppContext.INSTANCE.getAppContext().getBean("JodaTimeService");

	@Test
	public void testSplitDuration()
	{
		DateTime now = new DateTime();
		List<Interval> list = testedService.splitDuration(now, now.plusSeconds(10), 3, 3 * 1000);

		for (Interval i : list) {
			System.out.println(i.getStart() + " - " + i.getEnd() + " - " + i.toDurationMillis());
		}
	}
}
