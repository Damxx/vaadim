package pl.labwwsi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.labwwsi.entity.Client;
import pl.labwwsi.entity.Contract;
import pl.labwwsi.entity.User;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {
	List<Contract> findByClient(Client client);
	List<Contract> findByAcceptedBy(User user);

}
