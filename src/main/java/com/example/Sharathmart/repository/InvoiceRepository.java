package com.example.Sharathmart.repository;

import com.example.Sharathmart.entity.Invoice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends ReactiveMongoRepository<Invoice,String> {
}
