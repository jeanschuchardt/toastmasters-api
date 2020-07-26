package toastmastersapi.toastmasters.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.Date;

@Entity
@Data
public class Meetings {
    @Id
    int id;
    Date meetingDate;
    

}
