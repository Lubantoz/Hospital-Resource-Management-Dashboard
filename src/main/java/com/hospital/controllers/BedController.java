package com.hospital.controllers;

import com.hospital.services.DatabaseService;
import io.javalin.http.Handler;

public class BedController {

    private DatabaseService dbService = new DatabaseService();

    public Handler getAvailableBeds = ctx -> {
        int availableBeds = dbService.getAvailableBeds();
        ctx.json("{\"availableBeds\": " + availableBeds + "}");
    };
}
