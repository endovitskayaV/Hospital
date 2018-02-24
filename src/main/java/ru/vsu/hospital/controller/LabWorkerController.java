package ru.vsu.hospital.controller;

import org.springframework.web.servlet.view.RedirectView;

public class LabWorkerController {

    public RedirectView getAllAnalysis() {
        return new RedirectView("", true);
    }

    public RedirectView editAnalyse(long analyseId) {
        return new RedirectView("", true);
    }
}
