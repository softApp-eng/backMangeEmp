package com.group.backmangeemp;

import com.group.backmangeemp.model.Employee;
import com.group.backmangeemp.repo.EmpRepo;
import com.group.backmangeemp.service.EmpService;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.web.filter.CorsFilter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class BackmangeempApplication implements CommandLineRunner {
    @Autowired
    public EmpService empService;

    public static void main(String[] args) {
        SpringApplication.run(BackmangeempApplication.class, args);
        // System.out.println("hello");
    }
    @Bean
    public FilterRegistrationBean<CorsFilter> corsFilter() {
        FilterRegistrationBean<CorsFilter> registrationBean = new FilterRegistrationBean<>();
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        source.registerCorsConfiguration("/**", config);
        registrationBean.setFilter(new CorsFilter(source));
        registrationBean.setOrder(0);
        return registrationBean;
    }
    @Override
    public void run(String... args) throws Exception {
//       empService.addEmp(new Employee(null,
//               "test 1",
//               "test1@gmail.com",
//               "job1",
//               "06111111111",
//               "https://unsplash.com/photos/m_8o12KdLfg",
//               new Random(12).toString()));
//        empService.addEmp(new Employee(null,
//                "test 1",
//                "test1@gmail.com",
//                "job1",
//                "06111111111",
//                "https://unsplash.com/photos/m_8o12KdLfg",
//                new Random(12).toString()));
//        empService.addEmp(new Employee(null,
//                "test 1",
//                "test1@gmail.com",
//                "job1",
//                "06111111111",
//                "https://unsplash.com/photos/m_8o12KdLfg",
//                new Random(12).toString()));
//        empService.addEmp(new Employee(null,
//                "test 1",
//                "test1@gmail.com",
//                "job1",
//                "06111111111",
//                "https://unsplash.com/photos/m_8o12KdLfg",
//                new Random(12).toString()));
//        empService.addEmp(new Employee(null,
//                "test 1",
//                "test1@gmail.com",
//                "job1",
//                "06111111111",
//                "https://unsplash.com/photos/m_8o12KdLfg",
//                new Random(12).toString()));
    }
}
