package toastmastersapi.toastmasters.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CompleteProjectKey implements Serializable {
    @Column(name = "project_id")
    int projectId;

    @Column(name = "person_id")
    int personId;

}
