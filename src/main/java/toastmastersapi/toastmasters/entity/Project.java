package toastmastersapi.toastmasters.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="project")
public class Project {
    @Id
    int id;
    String nivel;
    String description;

    @OneToMany(mappedBy = "project")
    Set<CompleteProjects> ratings;


}
