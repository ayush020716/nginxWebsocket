//package com.spr;
//import org.springframework.stereotype.Component;
//import org.springframework.web.socket.*;
//
//@Component
//public class MyWebSocketHandler implements WebSocketHandler {
//    @Override
//    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
//        System.out.println("New WebSocket connection established: " + session.getId());
//    }
//
//    @Override
//    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
//        System.out.println("Received message: " + message.getPayload());
//        session.sendMessage(new TextMessage("Echo: " + message.getPayload()));
//    }
//
//    @Override
//    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
//
//    }
//
//    @Override
//    public boolean supportsPartialMessages() {
//        return false;
//    }
//
//    @Override
//    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
//        System.out.println("WebSocket connection closed: " + session.getId());
//    }
//}
