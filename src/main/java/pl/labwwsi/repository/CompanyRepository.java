package pl.labwwsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.labwwsi.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
