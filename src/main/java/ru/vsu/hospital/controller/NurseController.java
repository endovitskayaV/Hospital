package ru.vsu.hospital.controller;

import org.springframework.web.servlet.view.RedirectView;

public class NurseController {
    public RedirectView getAllDuties() {
        return new RedirectView("", true);
    }

    public RedirectView setRoom(long cardId, long roomNumber) {
        return new RedirectView("", true);
    }

    public RedirectView editProcedure(long cardId) {
        return new RedirectView("", true);
    }
}
