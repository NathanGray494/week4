package ie.atu.registrationservice;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RegistrationController
{
    private final NotificationServiceClient notificationServiceClient;

    public RegistrationController(NotificationServiceClient notificationServiceClient) {
        this.notificationServiceClient = notificationServiceClient;
    }

    @PostMapping("/register")
    public Map<String, String> confirmMessage(@RequestBody UserDetails userDetails)
    {
        return notificationServiceClient.notifyUser(userDetails);
    }


}
