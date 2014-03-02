package com.regs.core.domain;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id +3;
        this.content = content;

    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
