package pl.labwwsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.labwwsi.entity.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {

}
