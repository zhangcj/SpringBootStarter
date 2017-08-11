package com.example.service;

/**
 * Description
 * <p>
 * </p>
 * DATE 2017/8/11.
 *
 * @author zhangchunju.
 */
public class ExampleService {
    private String prefix;
    private String suffix;

    public ExampleService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }
    public String wrap(String word) {
        return prefix + word + suffix;
    }
}
