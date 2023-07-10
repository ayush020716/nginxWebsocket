//package com.spr;
//import javax.websocket.*;
//import javax.websocket.server.ServerEndpoint;
//import java.io.IOException;
//
//@ServerEndpoint("/websocket")
//public class MyWS {
//
//    @OnOpen
//    public void onOpen(Session session) {
//        System.out.println("WebSocket connection opened: " + session.getId());
//    }
//
//    @OnMessage
//    public void onMessage(String message, Session session) throws IOException {
//        System.out.println("Received message: " + message);
//        session.getBasicRemote().sendText("Server received message: " + message);
//    }
//
//    @OnClose
//    public void onClose(Session session) {
//        System.out.println("WebSocket connection closed: " + session.getId());
//    }
//
//    @OnError
//    public void onError(Throwable throwable) {
//        throwable.printStackTrace();
//        System.err.println("WebSocket error: " + throwable.getMessage());
//    }
//
//    @OnError
//    public void onError(Session session, Throwable throwable) {
//        throwable.printStackTrace();
//        System.err.println("WebSocket error in session: " + session.getId() + " ---- " + throwable.getMessage());
//    }
//
//}
