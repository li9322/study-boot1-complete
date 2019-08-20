package com.cntac.boot1.ch1.base.javaconfig;


/**
 * @ClassName: UserFunctionService
 * @Description:
 * @author: libl
 * @date: 2019/08/14 9:35
 */

public class UseFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService=functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
