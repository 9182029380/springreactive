package com.example.Sharathmart.util;

import com.example.Sharathmart.dto.Invoicedto;
import com.example.Sharathmart.entity.Invoice;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;

public class AppUtils {

      public static Invoicedto entityToDto(Invoice invoice){
            Invoicedto invoicedto = new Invoicedto();
            BeanUtils.copyProperties(invoice, invoicedto);
            return invoicedto;
      }
      public static Invoice dtoToEntity(Invoicedto invoicedto){
            Invoice invoice = new Invoice();
            BeanUtils.copyProperties(invoicedto,invoice);
            return invoice;
      }

}
