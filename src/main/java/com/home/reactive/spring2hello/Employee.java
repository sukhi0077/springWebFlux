package com.home.reactive.spring2hello;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    public String name;
    public int age;
}

