package com.xgrt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.xgrt.controller","com.xgrt.config"})//扫描controller
@EnableWebMvc
public class SpringMVCConfig {
}
