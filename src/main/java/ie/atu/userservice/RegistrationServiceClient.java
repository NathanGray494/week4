package ie.atu.userservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient(name="confirmation-service", url = "http://localhost:8081")
public interface RegistrationServiceClient {
    @PostMapping("/register")
    Map<String, String> someDetails(@RequestBody UserDetails userDetails);
}
