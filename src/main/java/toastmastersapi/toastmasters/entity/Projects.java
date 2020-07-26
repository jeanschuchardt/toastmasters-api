package toastmastersapi.toastmasters.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Projects {
    int id;
    String nivel;
    String description;

}
