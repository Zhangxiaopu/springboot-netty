package com.zhangpu.netty.client;

import com.zhangpu.netty.client.client.NettyClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot-netty
 * com.zhangpu.netty.client
 * Description:
 * User: 张普
 * Date: 2020-09-03
 * Time: 15:24
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        //启动netty客户端
        NettyClient nettyClient = new NettyClient();
        nettyClient.start();
    }
}
