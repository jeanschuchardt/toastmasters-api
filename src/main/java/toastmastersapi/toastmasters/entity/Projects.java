package toastmastersapi.toastmasters.entity;

import lombok.Builder;
import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Builder
public class Projects {
    @Id
    int id;
    String nivel;
    String description;

}
