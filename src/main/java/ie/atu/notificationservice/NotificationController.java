package ie.atu.notificationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class NotificationController
{
    @PostMapping("/notify")
    public Map<String, String> notifyUser(@RequestBody UserDetails userDetails)
    {
        Map<String, String> response = new HashMap<>();
        response.put("message", "User " +  userDetails.getName() + " (" +  userDetails.getEmail() +")"+ " has been successfully registered.");
        return response;
    }

}
