package com.seven.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Seven.Lin
 * @date 2020/2/15 11:25
 */
@Data
@ConfigurationProperties(prefix = "seven.hello")
public class HelloProperties {
    private String prefix;
    private String suffix;

}
