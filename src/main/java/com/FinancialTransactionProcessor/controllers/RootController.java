package com.FinancialTransactionProcessor.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Redirects root path to Swagger UI so visiting http://localhost:8098/ shows the API docs.
 */
@Controller
public class RootController {

    @GetMapping(value = {"", "/"})
    public String root() {
        return "redirect:/swagger-ui/index.html";
    }
}
