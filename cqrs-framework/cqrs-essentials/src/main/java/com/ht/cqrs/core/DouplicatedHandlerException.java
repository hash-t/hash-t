package com.ht.cqrs.core;

public class DouplicatedHandlerException extends RuntimeException {

    public DouplicatedHandlerException(Class<?> requestType) {
        super("There are multiple handler for the request of type: " + requestType.getName());
    }

}
