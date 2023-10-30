package com.example.Sharathmart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoicedto {
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
