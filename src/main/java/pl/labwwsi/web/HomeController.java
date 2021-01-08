package pl.labwwsi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pl.labwwsi.AuthenticationFacade;
import pl.labwwsi.entity.Contract;
import pl.labwwsi.entity.Notification;
import pl.labwwsi.entity.User;
import pl.labwwsi.repository.NotificationRepository;
import pl.labwwsi.service.ContractService;

@Controller
public class HomeController {
	
	
	@Autowired
	private NotificationRepository notificationRepository;
	@Autowired
	private ContractService contractService;
	@Autowired
	private AuthenticationFacade authenticationFacade;

	//SHOW HOME PAGE FOR LOGGED USER
	@GetMapping("/")
    public String home(Model model) {
		User user = authenticationFacade.getAuthenticatedUser();
		model.addAttribute("user", user);
		
		List<Notification> notificationList = notificationRepository.findByUser(user);
		model.addAttribute("notificationList", notificationList);
		
		List<Contract> contractList = contractService.findByAcceptedBy(user);
		model.addAttribute("contractList", contractList);
		
        return "index";
	}
	
}
