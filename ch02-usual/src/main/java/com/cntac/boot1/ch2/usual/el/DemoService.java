package com.cntac.boot1.ch2.usual.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @ClassName: DemoService
 * @Description:
 * @author: libl
 * @date: 2019/08/16 9:50
 */
@Service
public class DemoService {

    @Value("其他类的属性")
    private String another;

    public String getAnother(){
        return another;
    }

    public void setAnother(String another){
        this.another=another;
    }
}
