package com.soap.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soap.client.SoapClient;
import com.soap.wsdl.AddResponse;
import com.soap.wsdl.SubtractResponse;

@RestController
public class SoapController {

    @Autowired
    private SoapClient soapClient;
    
    @PostMapping("/sumar")
    public ResponseEntity<?> add(@RequestParam int numberA, @RequestParam int numberB) {

        Map<String, Integer> response = new HashMap<>();
        AddResponse addResponse = soapClient.getAddResponse(numberA, numberB);

        response.put("resultado", addResponse.getAddResult());

        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/restar")
    public ResponseEntity<?> subtract(@RequestParam int numberA, @RequestParam int numberB) {

        Map<String, Integer> response = new HashMap<>();
        SubtractResponse subtractResponse = soapClient.getSubtractResponse(numberA, numberB);

        response.put("resultado", subtractResponse.getSubtractResult());

        return ResponseEntity.ok().body(response);
    }
}
