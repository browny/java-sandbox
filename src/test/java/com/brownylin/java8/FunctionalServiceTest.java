package com.brownylin.java8;

import java.util.Arrays;
import java.util.List;

import com.brownylin.config.AppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FunctionalServiceTest
{
	private static final Logger logger = LoggerFactory.getLogger(FunctionalServiceTest.class);

	FunctionalService testedService = (FunctionalService)
		AppContext.INSTANCE.getAppContext().getBean("FunctionalService");

	@Test
	public void cleanNames()
	{
		List<String> names = Arrays.asList("john", "k", "Tom", "y");

		String result = testedService.cleanNames(names);
		Assert.assertEquals(result, "John,Tom");
	}
}