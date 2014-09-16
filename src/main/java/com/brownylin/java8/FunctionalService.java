package com.brownylin.java8;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component("FunctionalService")
public class FunctionalService
{
	public String cleanNames(List<String> names)
	{
		if (names == null) return "";
		return names
			.stream()
			.filter(name -> name.length() > 1)
			.map(name -> capitalize(name))
			.collect(Collectors.joining(","));
	}

	private String capitalize(String e)
	{
		return e.substring(0, 1).toUpperCase() + e.substring(1, e.length());
	}
}
