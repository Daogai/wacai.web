package com.youkeda.wacai.web;

import com.youkeda.wacai.web.model.Accounting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountingControlle {
@RequestMapping(path ="/accounting")
public Accounting accounting(Accounting accounting){
    int result=accounting.getcash() +
               accounting.getincome()-
               accounting.getrent()-
               accounting.getbalance()-
               accounting.geteat()-
               accounting.getktv()-
               accounting.getbalance();
               accounting.setbalance(result);

               return accounting;

}





}
