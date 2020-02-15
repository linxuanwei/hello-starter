package com.seven.starter;

import lombok.Data;

/**
 * @author Seven.Lin
 * @date 2020/2/15 11:27
 */
@Data
public class HelloService {
    private HelloProperties helloProperties;

    public String sayHello(String name) {
        return helloProperties.getPrefix() + " " + name + " " + helloProperties.getSuffix();
    }
}