package com.home.reactive.spring2hello;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeRepository {

    public Employee getEmp(){
        return Employee.builder().name("sds").age(34).build();
    }
    public List<Employee> getEmps(){

        List<Employee> l = new ArrayList<>();
        l.add(Employee.builder().name("rick").age(34).build());
        l.add(Employee.builder().name("john").age(5).build());
        l.add(Employee.builder().name("sds").age(7).build());
        l.add(Employee.builder().name("adm").age(65).build());
        l.add(Employee.builder().name("dk").age(56).build());
        l.add(Employee.builder().name("ksjldf").age(80).build());
        l.add(Employee.builder().name("sisi").age(76).build());
        l.add(Employee.builder().name("lena").age(43).build());
        l.add(Employee.builder().name("aas").age(32).build());
        l.add(Employee.builder().name("iof").age(21).build());
        l.add(Employee.builder().name("ov").age(43).build());
        l.add(Employee.builder().name("udh").age(5).build());
        return l;
    }
}
