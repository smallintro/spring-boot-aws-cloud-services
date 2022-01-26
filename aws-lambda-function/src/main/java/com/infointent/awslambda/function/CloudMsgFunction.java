package com.infointent.awslambda.function;

import com.infointent.awslambda.function.pojo.StringMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
@Slf4j
public class CloudMsgFunction implements Function<String, StringMessage> {

    @Override
    public StringMessage apply(String msg) {
        log.info("StringMessage input:", msg);
        StringMessage stringMessage = new StringMessage(msg);
        log.info("StringMessage output:", stringMessage);
        return stringMessage;
    }
}
