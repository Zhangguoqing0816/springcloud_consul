package com.guoqing.windows.consul.feign.fallback;

import com.guoqing.windows.consul.feign.service.MyFeignService;
import feign.hystrix.FallbackFactory;

/**
 * @Auther:
 * @Description:
 * @Date: 2019/12/30 11:14
 */
public class MyFeignServiceFallback implements FallbackFactory<MyFeignService> {
    @Override
    public MyFeignService create(Throwable throwable) {
        return new MyFeignService() {
            @Override
            public String hello() {
                return "调用 hello  -->  Fail...";
            }

            @Override
            public String sayGuoQing() {
                return "调用 sayGuoQing  -->  Fail...";
            }
        };
    }
}
