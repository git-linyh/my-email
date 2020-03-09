package pers.linyh.emailmanage.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: linyh
 * @Date: 2019-12-03
 * @Description: No Description
 */
@Controller
@RequestMapping("/admin")
@Slf4j
public class TestController {

    @RequestMapping()
    public String test(Model model) {
        model.addAttribute("aa","cc");
        model.addAttribute("products", "林彝铧");
        return "/login";
    }

}
