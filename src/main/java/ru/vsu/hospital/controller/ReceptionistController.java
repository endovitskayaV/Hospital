package ru.vsu.hospital.controller;

import org.springframework.web.servlet.view.RedirectView;

public class ReceptionistController {

    public RedirectView getAllPatients() {
        return new RedirectView("", true);
    }

    public RedirectView createCard() {
        return new RedirectView("", true);
    }
}
