package com.brownylin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.brownylin.service.*" })
public class SpringConfig
{

}
