//package com.spr;
//
//import org.springframework.messaging.converter.MappingJackson2MessageConverter;
//import org.springframework.messaging.simp.stomp.*;
//import org.springframework.web.socket.client.WebSocketClient;
//import org.springframework.web.socket.client.standard.StandardWebSocketClient;
//import org.springframework.web.socket.messaging.WebSocketStompClient;
//
//public class WSClient {
//    public static void main(String[] args) {
//        String serverUrl = "ws://localhost";
//
//        WebSocketClient client = new StandardWebSocketClient();
//
//        WebSocketStompClient stompClient = new WebSocketStompClient(client);
//        stompClient.setMessageConverter(new MappingJackson2MessageConverter());
//
//        StompSessionHandler sessionHandler = new MyStompSessionHandler();
//        stompClient.connect(serverUrl, sessionHandler);
//
//        stompClient.start();
//
//    }
//
//    static class MyStompSessionHandler extends StompSessionHandlerAdapter {
//        @Override
//        public void afterConnected(StompSession session, StompHeaders connectedHeaders) {
//            System.out.println("Connected to WebSocket server");
//            int i = 0;
//            while (true) {
//                session.send("/websocket", "hi" + (i++));
//            }
//        }
//
//        @Override
//        public void handleException(StompSession session, StompCommand command, StompHeaders headers,
//                                    byte[] payload, Throwable exception) {
//            System.out.println("WebSocket error: " + exception.getMessage());
//        }
//
//
//    }
//}
//
