package pl.labwwsi.service;

import java.util.List;
import java.util.Set;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import pl.labwwsi.entity.Role;
import pl.labwwsi.entity.User;
import pl.labwwsi.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	
	
	private final UserRepository userRepository;
	private final BCryptPasswordEncoder passwordEncoder;

	public UserServiceImpl(UserRepository userRepository,
			BCryptPasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
		this.userRepository = userRepository;
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void saveUser(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setActive(true);
		userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public List<User> findBySupervisor(User user) {
		return userRepository.findBySupervisor(user);
	}
	
	@Override
	public Double getMaxContractValue(User user) {
		Set<Role> roles = user.getRoles();
		Double max = 0.00;
		for (Role role : roles) {
			if (max < role.getMaxContractValue()) {
				max = role.getMaxContractValue();
			}
		}
		return max;
	}

}
