package com.cntac.boot1.ch2.usual.profile;

/**
 * @ClassName: DemoBean
 * @Description: 示例Bean
 * @author: libl
 * @date: 2019/08/19 15:13
 */
public class DemoBean {
    private String content;

    public DemoBean(String content){
        super();
        this.content=content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
