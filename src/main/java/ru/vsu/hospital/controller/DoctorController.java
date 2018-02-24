package ru.vsu.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;
import ru.vsu.hospital.service.DoctorService;

@RequestMapping("/")
@Controller
public class DoctorController {
    private DoctorService doctorService;
    private static String errorMsg;

    @Autowired
    DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }


    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "customError")
    public String customError(ModelMap modelMap) {
        modelMap.addAttribute("msg", errorMsg);
        return "customError";
    }

    public RedirectView getAllCards() {
        return new RedirectView("", true);
    }

    public RedirectView editCard(long cardId) {
        return new RedirectView("", true);
    }

    public RedirectView printPeport() {
        return new RedirectView("", true);
    }
}