package toastmastersapi.toastmasters.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="complete_projects")
public class CompleteProjects {

    @EmbeddedId
    CompleteProjectKey id;

    @ManyToOne
    @MapsId("person_id")
    @JoinColumn(name = "person_id")
    Person person;

    @ManyToOne
    @MapsId("projects_id")
    @JoinColumn(name = "project_id")
    Project project;

    Date apresentationDate;


}
