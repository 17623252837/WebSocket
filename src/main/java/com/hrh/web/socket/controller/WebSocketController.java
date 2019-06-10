package com.hrh.web.socket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @ProjectName: WebSocket
 * @Package: com.hrh.web.socket.controller
 * @ClassName: WebSocketController
 * @Author: hrh
 * @Description:
 * @Date: 2019/6/10 0010 下午 15:11
 * @Version: 1.0
 */
@RestController
public class WebSocketController {
    @Autowired
    WebSocketServer server;
    @PostMapping("/login")
    public String login(String username,String password) throws IOException {
        //TODO: 校验密码
        server.sendInfo(username + "进入了聊天室!");
        return username;
    }
}

