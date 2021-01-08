package pl.labwwsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.labwwsi.entity.ContactPerson;

@Repository
public interface ContactPersonRepository extends JpaRepository<ContactPerson, Long> {

}
