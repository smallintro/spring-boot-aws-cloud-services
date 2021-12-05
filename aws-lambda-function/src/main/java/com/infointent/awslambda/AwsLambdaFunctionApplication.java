package com.infointent.awslambda;

import com.infointent.awslambda.function.CloudMsgConsumer;
import com.infointent.awslambda.function.CloudMsgFunction;
import com.infointent.awslambda.function.CloudMsgSupplier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class AwsLambdaFunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsLambdaFunctionApplication.class, args);
    }

    @Bean
    public CloudMsgFunction cloudMsgFunction() {
        return new CloudMsgFunction();
    }

    @Bean
    public CloudMsgSupplier cloudMsgSupplier() {
        return new CloudMsgSupplier();
    }

    @Bean
    public CloudMsgConsumer cloudMsgConsumer() {
        return new CloudMsgConsumer();
    }

    @Bean
    public Function<String, String> reverseString() {
        // StringBuilder is not thread safe
        return value -> new StringBuilder(value).reverse().toString();
    }

}
