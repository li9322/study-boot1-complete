package com.cntac.boot1.ch1.base.di;

import org.springframework.stereotype.Service;

/**
 * @ClassName: FunctionService
 * @Description:
 * @author: libl
 * @date: 2019/08/14 9:31
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "hello" + word + "!";
    }
}
