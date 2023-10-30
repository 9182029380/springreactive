package com.example.Sharathmart.service;

import com.example.Sharathmart.dto.Invoicedto;
import com.example.Sharathmart.repository.InvoiceRepository;
import com.example.Sharathmart.util.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class Invoiceservice {
    @Autowired
    private InvoiceRepository repo;
    public Mono<Invoicedto> createInvoice(Mono<Invoicedto> invoicdto) {
        return invoicdto.map(AppUtils::dtoToEntity)
                .flatMap(repo::insert)
                .map(AppUtils::entityToDto);
    }

    public Flux<Invoicedto> getInvoices() {
        return repo.findAll().map(AppUtils::entityToDto);
    }
}
