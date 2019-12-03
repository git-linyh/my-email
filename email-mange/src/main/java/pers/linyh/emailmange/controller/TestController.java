package pers.linyh.emailmange.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        model.addAttribute("products", "456");
        return "/login";
    }

}
