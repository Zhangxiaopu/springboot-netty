package com.zhangpu.springbootnetty;

import com.zhangpu.springbootnetty.server.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetSocketAddress;

@SpringBootApplication
public class SpringbootNettyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootNettyApplication.class, args);

        //启动服务端
        NettyServer nettyServer = new NettyServer();
        nettyServer.start(new InetSocketAddress("127.0.0.1",8509));
    }

}
