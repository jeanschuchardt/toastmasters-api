package toastmastersapi.toastmasters.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="person")
public class Person {

    @Id
    @Column
    int id;

    @Column
    String fristName;
    @Column
    String lastName;
   // boolean isActive;
    //Date membershiipAfiliation;

    @OneToMany(mappedBy = "person")
    Set<CompleteProjects> ratings;


}
