package toastmastersapi.toastmasters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import toastmastersapi.toastmasters.entity.*;
import toastmastersapi.toastmasters.repositories.CompleteProjectsRepository;
import toastmastersapi.toastmasters.repositories.MeetingRepository;
import toastmastersapi.toastmasters.repositories.PersonRepository;
import toastmastersapi.toastmasters.repositories.ProjectsRepository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@SpringBootApplication
@ComponentScan

public class ToastmastersApplication {

    public static void main(String[] args) {

        SpringApplication.run(ToastmastersApplication.class, args);

    }

    @Bean
    public CommandLineRunner demo(PersonRepository repository) {
        return (args) -> {
            // save a few customers
            repository.save(Person.builder().id(1).fristName("Jean").lastName("Burda").build());
            repository.save(Person.builder().id(2).fristName("Barbara").lastName("Nassif").build());

        };
    }

    @Bean
    public CommandLineRunner createProjects(ProjectsRepository repository) {
        return (args) -> {
            repository.save(Project.builder().id(1).description("N1.1").build());
            repository.save(Project.builder().id(2).description("N1.2").build());
            repository.save(Project.builder().id(3).description("N1.3").build());
            repository.save(Project.builder().id(4).description("N1.4").build());
            repository.save(Project.builder().id(5).description("N1.5").build());

        };
    }

//    @Bean
//    public CommandLineRunner createProjects(MeetingRepository repository) {
//        return (args) -> {
//            repository.save(Meeting.builder().id(1).meetingDate(new Date()).build());
//            repository.save(Meeting.builder().id(2).meetingDate(new Date()).build());
//
//
//        };
//    }

//    @Bean
//    public CommandLineRunner createProjectUsers(CompleteProjectsRepository repository) {
//
//        return (args) -> {
//            repository.save(CompleteProjects.builder().person(Person.builder().id(3).fristName("Test").lastName("Test").build()).project(Project.builder().id(6).description("N1.6").build()).build());
//
//
//
//       };
//       };



    //}


}
