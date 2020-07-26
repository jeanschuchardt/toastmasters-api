package toastmastersapi.toastmasters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import toastmastersapi.toastmasters.entity.Persons;
import toastmastersapi.toastmasters.entity.Projects;

@SpringBootApplication
public class ToastmastersApplication {

    public static void main(String[] args) {

        SpringApplication.run(ToastmastersApplication.class, args);

		Persons.builder().id(1).fristName("Jean").lastName("Burda");
		Persons.builder().id(1).fristName("Barbara").lastName("Nassif");

		Projects.builder().id(1).description("N1.1");
		Projects.builder().id(2).description("N1.2");
		Projects.builder().id(3).description("N1.3");
		Projects.builder().id(4).description("N1.4");
		Projects.builder().id(5).description("N1.5");



    }


}
