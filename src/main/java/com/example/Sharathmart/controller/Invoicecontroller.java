package com.example.Sharathmart.controller;

import com.example.Sharathmart.dto.Invoicedto;
import com.example.Sharathmart.service.Invoiceservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/invoice")
public class Invoicecontroller {
    @Autowired
    private Invoiceservice service;

    @GetMapping
    public Flux<Invoicedto>getInvoices(){

        return service.getInvoices();
    }

    @PostMapping("/addinvoice")
    public Mono<Invoicedto>createInvoice(@RequestBody Mono<Invoicedto> invoicdto){

        return service.createInvoice(invoicdto);
    }
}
