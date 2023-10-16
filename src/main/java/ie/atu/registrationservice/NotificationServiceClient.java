package ie.atu.registrationservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient(name="notification-service", url = "http://localhost:8082")
public interface NotificationServiceClient {
    @PostMapping("/notify")
    Map<String,String> notifyUser(@RequestBody UserDetails userDetails);
}
