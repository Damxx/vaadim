package pl.labwwsi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.labwwsi.entity.Event;
import pl.labwwsi.entity.Notification;
import pl.labwwsi.entity.User;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
	Notification findFirstByEventOrderByCreatedDesc(Event event);
	List<Notification> findByEvent(Event event);
	List<Notification> findByUser(User user);
	
}
