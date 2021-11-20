package com.appdevelopersblog.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.appdevelopersblog.aws.lambda.requests.Request;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class GreetMeHandler extends SpringBootRequestHandler<String,Object> {
    public Object handleGreetMeRequest(Request request, Context context){
        switch (request.getHttpMethod()) {
            case "GET" :
                String name = request.getName();
                return "Hello "+name+"!!! Welcome to AppsDeveloperBlog...";
            case "default" :
                break;
        }
        return null;
    }
}