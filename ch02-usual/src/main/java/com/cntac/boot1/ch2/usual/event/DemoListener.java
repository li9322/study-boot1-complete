package com.cntac.boot1.ch2.usual.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName: DemoListener
 * @Description: 事件监听器
 *   // 实现ApplicationListener接口，并指定监听的事件类型。
 * @author: libl
 * @date: 2019/08/19 15:27
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    /**
     * // 使用onApplicationEvent方法对消息进行接受处理。
     * @param demoEvent
     */
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg=demoEvent.getMsg();
        System.out.println("我(bean-demoListener)接收到了bean-demoPublish发布的消息:"+msg);
    }
}
