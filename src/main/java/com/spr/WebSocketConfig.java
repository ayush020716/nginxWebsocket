package com.spr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

@Configuration
@EnableWebSocket
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpoint() {
        System.out.println("ServerEndpointExporter");
        return new ServerEndpointExporter();
    }

}

//@Configuration
//@EnableWebSocket
//public class WebSocketConfig {
//    private final MyWebSocketHandler myWebSocketHandler;
//
//    public WebSocketConfig(MyWebSocketHandler myWebSocketHandler) {
//        this.myWebSocketHandler = myWebSocketHandler;
//    }
//
//    @Override
//    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//        registry.addHandler(myWebSocketHandler, "/websocket")
//                .setAllowedOrigins("*");
//    }
//}
