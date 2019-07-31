package com.qianfeng.demo.listener;

import org.springframework.stereotype.Component;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author xiaoxinmin
 * @Date 2019/7/29
 */
@Component
public class MyListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.err.println("MyListener requestDestroyed...");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.err.println("MyListener requestInitialized...");
    }
}
