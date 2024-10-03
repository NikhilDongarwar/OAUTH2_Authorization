package com.example.demo;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserProfileController {
    
    @GetMapping("/profile")
    public String getProfile(OAuth2AuthenticationToken token,Model model) {
        // Replace with the actual path to the image

        model.addAttribute("name",token.getPrincipal().getAttribute("name"));
        model.addAttribute("email",token.getPrincipal().getAttribute("email"));
        model.addAttribute("photo",token.getPrincipal().getAttribute("picture"));
        
        return "profile"; // This should match your Thymeleaf template file name
    }
}
