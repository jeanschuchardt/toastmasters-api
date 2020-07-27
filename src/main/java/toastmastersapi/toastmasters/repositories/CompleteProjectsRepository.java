package toastmastersapi.toastmasters.repositories;

import org.springframework.data.repository.CrudRepository;
import toastmastersapi.toastmasters.entity.CompleteProjects;
import toastmastersapi.toastmasters.entity.Meeting;

public interface CompleteProjectsRepository  extends CrudRepository<CompleteProjects,Integer> {

}
