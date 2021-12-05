package com.infointent.awslambda.function;

import com.infointent.awslambda.function.pojo.StringMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
@Slf4j
public class CloudMsgSupplier implements Supplier<StringMessage> {
    @Override
    public StringMessage get() {
        String message = "CloudMsgSupplier Test message";
        StringMessage stringMessage = new StringMessage(message);
        log.info("Supplying string message:", stringMessage);
        return stringMessage;
    }
}
