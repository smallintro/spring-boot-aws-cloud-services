package com.infointent.awslambda.function.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.util.StringUtils;

@Data
@ToString
public class StringMessage {
    private String originalMessage;
    private String reverseMessage;
    private int messageLength;

    public StringMessage(String message) {
        this.originalMessage = message;
        if (!StringUtils.hasLength(message)) {
            return;
        }
        this.reverseMessage = new StringBuffer(message).reverse().toString();
        this.messageLength = message.length();
    }
}
