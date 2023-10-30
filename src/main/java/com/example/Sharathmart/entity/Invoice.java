package com.example.Sharathmart.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "sharathinvoice")
public class Invoice {
    @Id
    public String id;
    public  String invoicenumber;
    public String  vendor;
    public String poc;
    public int noofdays;
    public String currency;
    public double amountPerDay;
    public double  totalAmount;
    public Date invoicedateStart;
    public Date invoicedateEnd;
    public int invoiceprocessdays;
}
