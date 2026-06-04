package carwash_auth_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @GetMapping("/api/client/profile")
    public String Profile(){
        return "Client Profile";
    }
}
