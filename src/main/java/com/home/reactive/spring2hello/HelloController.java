package com.home.reactive.spring2hello;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    EmployeeRepository employee;

    @GetMapping("/h1")
    public String sayHello() {
        System.out.println("controller hello******");
        return "hey man!";
    }

    @GetMapping("/emp")
    private Mono<Object> getEmployeeById() {
        List<Employee> l = employee.getEmps();
        log.debug("statring emp fetch*******************");
       Optional<Employee> e= l.stream().filter(x-> x.age==56).findFirst();
        return Mono.just(e);
    }

    @GetMapping("/emps")
    private Flux<Object> getEmployees() {
        List<Employee> l = employee.getEmps();
        //l = l.stream().filter(x -> x.age > 60).collect(Collectors.toList());
        List<String> s = l.stream().map(x -> Strings.toRootUpperCase(x.name)).collect(Collectors.toList());
        List<EmployeeExtended> se = l.stream().map(x ->  EmployeeExtended.builder().name(x.name).age(x.age-20).male(x.age>50).build()).collect(Collectors.toList());

        return Flux.fromIterable(se);
    }
}

