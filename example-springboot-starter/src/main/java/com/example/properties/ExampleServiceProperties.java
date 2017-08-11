package com.example.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Description
 * <p>
 * </p>
 * DATE 2017/8/11.
 *
 * @author zhangchunju.
 */
@ConfigurationProperties("example.service")
public class ExampleServiceProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
