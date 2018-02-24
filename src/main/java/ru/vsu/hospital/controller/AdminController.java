package ru.vsu.hospital.controller;

import org.springframework.web.servlet.view.RedirectView;

public class AdminController {
    public RedirectView addDoctor() {
        return new RedirectView("", true);
    }

    public RedirectView removeDoctor(long doctorId) {
        return new RedirectView("", true);
    }

    public RedirectView editDoctor(long doctorId) {
        return new RedirectView("", true);
    }

}
