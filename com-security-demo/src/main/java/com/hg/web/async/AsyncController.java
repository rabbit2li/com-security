package com.hg.web.async;

import org.apache.commons.lang.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.concurrent.Callable;

/**
 * @auther kim
 * @date 2019/1/26
 */
@RestController
public class AsyncController {

    private Logger log = LoggerFactory.getLogger(AsyncController.class);

    @Autowired
    private DeferredResultHolder resultHolder;

    @Autowired
    private MockQueue mockQueue;

    @GetMapping("/order")
    public DeferredResult<String> order() throws Exception {
        log.info("主线程开始...");

        String orderName = RandomStringUtils.randomNumeric(8); //8位随机数
        mockQueue.setPlaceOrder(orderName);

        DeferredResult<String> deferredResult = new DeferredResult<>();
        resultHolder.getMap().put(orderName, deferredResult);

//        Callable<String> callable = new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                log.info("副线程开始---");
//                Thread.sleep(1000);
//                log.info("副线程结束---");
//                return "success";
//            }
//        };

        log.info("主线程返回...");
        return deferredResult;
    }
}
