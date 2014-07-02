package com.xincao.common.event;

import com.xincao.common.event.dispatcher.GameEventDispatcher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String... args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:event_listener.xml");
        GameEventDispatcher dispatcher = ac.getBean(GameEventDispatcher.class);
        String name = "caoxin";
        dispatcher.triggerEvent(WorldEvents.login, name);
    }
}