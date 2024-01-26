package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 1/26/2024, Friday
 **/
@RestController
@RequestMapping("/graph")
public class GraphController {

    @GetMapping("/get")
    public String getGraph() {
        System.out.println("fetch latest graph##########################################################");
        return "<html><h1>Hello World</h1></html>";
    }

}

