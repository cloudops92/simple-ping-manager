package com.mishah.controller;

import com.mishah.logic.PingManager;
import com.mishah.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/rest")
public class RequestHandler {

    private final static UUID SYSTEM_ID = UUID.randomUUID();
    private final PingManager pingManager = new PingManager();

    @GetMapping("/")
    public String healthCheck() {
        return "Ping-manager - Welcome to RestWorld!!!";
    }

    @PostMapping("/process")
    public PingAnalyticResponse handleRequest(@RequestBody PingAnalyticRequest request) {

        PingAnalyticResponse response = new PingAnalyticResponse();

        try {

            String input = request.getUrl();

            if (input == null || input.trim().isEmpty())
                throw new NullPointerException("Error: Input found either NULL or empty.");
            else {

                Ping ping = pingManager.pingURL(request);

                response.setPing(ping);
                response.setSysId(RequestHandler.SYSTEM_ID.toString());
                response.setMessage("INFO: Request execute successfully.");
                response.setError(false);
            }

        } catch (Exception e) {
            response.setError(true);
            response.setMessage(e.getMessage());
            e.printStackTrace();
        }

        return response;
    }

    @PostMapping("/view")
    public ViewResponse handleViewRequest(@RequestBody ViewRequest request) {

        ViewResponse response = new ViewResponse();

        try {

            List<Ping> pings = pingManager.getPings();

            response.setSysId(RequestHandler.SYSTEM_ID.toString());
            response.setMessage("INFO: Request execute successfully.");
            response.setError(false);
            response.setPings(pings);


        } catch (Exception e) {
            response.setError(true);
            response.setMessage(e.getMessage());
            e.printStackTrace();
        }

        return response;
    }
}
