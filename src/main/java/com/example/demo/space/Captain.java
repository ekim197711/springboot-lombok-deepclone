package com.example.demo.space;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder(toBuilder = true)
public class Captain implements Cloneable{
    private String name;
    private Integer level;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Captain(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }


}
