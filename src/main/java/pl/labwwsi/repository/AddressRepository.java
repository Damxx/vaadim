package pl.labwwsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.labwwsi.entity.Address;


@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
