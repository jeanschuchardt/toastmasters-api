package toastmastersapi.toastmasters.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
@Builder
public class MeetingRoles {
    @Id
    int id;
    String name;
}
