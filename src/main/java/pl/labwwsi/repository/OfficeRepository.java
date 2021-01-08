package pl.labwwsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.labwwsi.entity.Office;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Long> {

}
