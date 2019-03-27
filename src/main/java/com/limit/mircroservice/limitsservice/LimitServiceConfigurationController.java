package com.limit.mircroservice.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class LimitServiceConfigurationController {

	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public LimitServiceConfiguration retrieveLimitServiceConfiguration() {

		LimitServiceConfiguration limitServiceConfiguration = new LimitServiceConfiguration(configuration.getMaximum(),
				configuration.getMinimum());
		return limitServiceConfiguration;

	}

	@GetMapping("/fault-tolerance")
	@HystrixCommand(fallbackMethod = "fallbackRetrieveServiceConfiguration")
	public LimitServiceConfiguration retrieveServiceConfiguration() {

		throw new RuntimeException("Not available");

	}

	public LimitServiceConfiguration fallbackRetrieveServiceConfiguration() {

		LimitServiceConfiguration limitServiceConfiguration = new LimitServiceConfiguration(999, 9);
		return limitServiceConfiguration;

	}

}
