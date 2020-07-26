package toastmastersapi.toastmasters.entity;

import lombok.Builder;
import lombok.Data;



import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.Date;

@Entity
@Data
@Builder
public class Persons {
    @Id

    int id;
    String fristName;
    String lastName;
    boolean isActive;
    Date membershiipAfiliation;

}
