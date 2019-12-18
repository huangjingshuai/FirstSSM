package com.hjs.controller;



import com.hjs.model.User;
import com.hjs.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Package: com.hjs.controller
 * <p>
 * Description： TODO
 * <p>
 * Author: hjscode
 * <p>
 * Date: Created in 2019/10/29 22:26
 */
@Controller
@RequestMapping("/test")
public class AyTestController {
    @Resource
    UserService  userService;
    @GetMapping("/sayHello")
    public String sayHello(Model model){
        model.addAttribute("name","ay");
        return "hello";
    }
}
