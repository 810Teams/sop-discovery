package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class StudentServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentServiceApplication.class, args);
    }

    @RequestMapping(value = "v1/student/{studentId}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable("studentId") String studentId) {
        Student student = new Student(
                studentId,
                "Teerapat",
                "Kraisrisirikul",
                "teerapat_saint@hotmail.com"
        );

        return student;
    }
}
