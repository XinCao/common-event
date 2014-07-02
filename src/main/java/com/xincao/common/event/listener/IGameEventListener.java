package com.xincao.common.event.listener;

import java.util.List;
import com.xincao.common.event.core.EventListener;

/**
 * 
 * @author CaoXin
 */
public interface IGameEventListener extends EventListener {

    public List<String> getEvents();
}