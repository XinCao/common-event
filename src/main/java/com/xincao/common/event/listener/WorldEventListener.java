package com.xincao.common.event.listener;

import com.xincao.common.event.WorldEvents;
import com.xincao.common.event.core.Event;

/**
 * 游戏逻辑（控制器）
 *
 * @author CaoXin
 */
public class WorldEventListener extends AbstractGameEventListener {

    @Override
    public void handleEvent(Event e) throws Exception {
        String eventName = e.getName();
        String name = (String)e.getContext();
        if (WorldEvents.login.equals(eventName)) {
            this.login(name);
        }
    }

    private void login(String name) {
        System.out.println(name + "登录游戏世界");
    }

}