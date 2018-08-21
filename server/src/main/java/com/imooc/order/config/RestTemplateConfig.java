package com.imooc.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateConfig {
//
//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate(){
//        return  new RestTemplate();
//    }
}
