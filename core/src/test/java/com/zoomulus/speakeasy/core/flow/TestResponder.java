package com.zoomulus.speakeasy.core.flow;

import lombok.Getter;
import lombok.experimental.Accessors;

import com.zoomulus.speakeasy.core.message.Message;

@Getter
@Accessors(fluent=true)
public class TestResponder extends Sink
{
    private final String name = "sink";
    private Message response;

    @Override
    public void processResponse(Message response)
    {
        this.response = response;
    }
}