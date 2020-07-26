package toastmastersapi.toastmasters.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
public class Meetings {
    int id;
    Date meetingDate;
    

}
