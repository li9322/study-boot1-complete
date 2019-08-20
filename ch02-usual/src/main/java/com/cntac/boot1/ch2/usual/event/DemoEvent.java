package com.cntac.boot1.ch2.usual.event;

import org.springframework.context.ApplicationEvent;

/**
 * @ClassName: DemoEvent
 * @Description: 自定义事件
 * @author: libl
 * @date: 2019/08/19 15:25
 */
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1l;
    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
