package com.fattahi.cloud.zuul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by m.fattahi on 4/19/2016.
 */
@SpringBootApplication
@EnableZuulProxy
@EnableHystrix
public class ZuulServer {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ZuulServer.class).web(true).run(args);
	}
}
