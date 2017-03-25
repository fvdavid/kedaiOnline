package com.fvsaddam.app.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author fvsaddam | fvmonster.corp@gmail.com
 */
@Controller
public class HaloController {

    @RequestMapping("/halo")
    public ModelMap halo() {
        ModelMap data = new ModelMap();
        Date waktu = new Date();
        data.addAttribute("sekarang", waktu);
        return data;
    }

}
