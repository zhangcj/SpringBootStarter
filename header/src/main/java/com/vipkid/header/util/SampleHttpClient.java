package com.vipkid.header.util;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.SimpleHttpConnectionManager;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpClientParams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SampleHttpClient {

    public static void doHttpClient() throws IOException {

        HttpClient client = new HttpClient();

        List<Header> headers = new ArrayList<Header>();
        headers.add(new Header("SOMETIME","someContent"));
        headers.add(new Header("API-REMOTEIP", "http://10.1.41.252"));

        client.getHostConfiguration().getParams().setParameter("http.default-headers", headers);
        // 使用 GET 方法 ，如果服务器需要通过 HTTPS 连接，那只需要将下面 URL 中的 http 换成 https
        HttpMethod method=new GetMethod("http://localhost:8080/api/category/1");
        //使用POST方法
        //HttpMethod method = new PostMethod("http://java.sun.com");
        client.executeMethod(method);

        //打印服务器返回的状态
        System.out.println(method.getStatusLine());
        //打印返回的信息
        System.out.println(method.getResponseBodyAsString());
        //释放连接
        method.releaseConnection();
    }
}
