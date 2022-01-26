package com.infointent.awslambda.function;

import com.infointent.awslambda.function.pojo.StringMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@Slf4j
public class CloudMsgConsumer implements Consumer<StringMessage> {
    @Override
    public void accept(StringMessage msg) {
        log.info("Consuming string message:", msg);
        StringMessage stringMessage = new StringMessage(msg.getOriginalMessage());
        log.info("Processed string message:", stringMessage);
    }
}
