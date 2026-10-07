package com.CodingBrajmohan.TestingApp.controllers;


import com.CodingBrajmohan.TestingApp.TestcontainersConfiguration;
import com.CodingBrajmohan.TestingApp.dto.EmployeeDto;
import com.CodingBrajmohan.TestingApp.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webtestclient.autoconfigure.AutoConfigureWebTestClient;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.reactive.server.WebTestClient;


@AutoConfigureWebTestClient(timeout = "100000")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestcontainersConfiguration.class)
public class AbstractIntegrationTest {

    @Autowired
    WebTestClient webTestClient;

    Employee testEmployee = Employee.builder()
//            .id(1L)
                .email("anuj@gmail.com")
                .name("Anuj")
                .salary(200L)
                .build();
    EmployeeDto testEmployeeDto = EmployeeDto.builder()
//            .id(1L)
                .email("anuj@gmail.com")
                .name("Anuj")
                .salary(200L)
                .build();
}
