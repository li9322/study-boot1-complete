package com.cntac.boot1.ch2.usual.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @ClassName: DemoPrototypeService
 * @Description:
 * @author: libl
 * @date: 2019/08/15 16:48
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
