package com.hrh.web.socket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @ProjectName: WebSocket
 * @Package: com.hrh.web.socket.config
 * @ClassName: WebSocketConfig
 * @Author: hrh
 * @Description:
 * @Date: 2019/6/10 0010 下午 15:00
 * @Version: 1.0
 */
@Configuration
public class WebSocketConfig {
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

}
