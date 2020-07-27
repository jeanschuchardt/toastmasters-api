package toastmastersapi.toastmasters.repositories;

import org.springframework.data.repository.CrudRepository;
import toastmastersapi.toastmasters.entity.Person;

public interface PersonRepository  extends CrudRepository<Person, Integer>
{

}
