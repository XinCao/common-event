package com.xincao.common.event.core;

/**
 * 事件监听器
 * 
 * @author caoxin
 */
public interface EventListener {
    public void handleEvent(Event event) throws Exception;
}