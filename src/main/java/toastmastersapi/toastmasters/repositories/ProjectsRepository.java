package toastmastersapi.toastmasters.repositories;

import org.springframework.data.repository.CrudRepository;
import toastmastersapi.toastmasters.entity.Project;

public interface ProjectsRepository extends CrudRepository <Project,Integer> {
}
