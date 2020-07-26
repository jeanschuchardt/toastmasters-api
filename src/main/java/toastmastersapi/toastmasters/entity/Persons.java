package toastmastersapi.toastmasters.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
public class Persons {
    int id;
    String fristName;
    String lastName;
    boolean isActive;
    Date membershiipAfiliation;

}
