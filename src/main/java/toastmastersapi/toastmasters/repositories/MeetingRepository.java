package toastmastersapi.toastmasters.repositories;

import org.springframework.data.repository.CrudRepository;
import toastmastersapi.toastmasters.entity.Meeting;


public interface MeetingRepository extends CrudRepository<Meeting,Integer> {
}
