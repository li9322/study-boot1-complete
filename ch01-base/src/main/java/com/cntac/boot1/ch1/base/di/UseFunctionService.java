package com.cntac.boot1.ch1.base.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserFunctionService
 * @Description:
 * @author: libl
 * @date: 2019/08/14 9:35
 */
@Service
public class UseFunctionService {
    @Autowired
    FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
