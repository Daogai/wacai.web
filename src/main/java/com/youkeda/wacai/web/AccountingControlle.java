package com.youkeda.wacai.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountingControlle {
@RequestMapping(path ="/account")
public String account(@RequestParam("cash")int cash,@RequestParam("rent")int rent,@RequestParam("income")int income,@RequestParam("charges")int charges,@RequestParam("eat")int eat)
{
    int result =cash+income-rent-charges-eat;
    String a ="本月余额：";
    return a+result;












}




}
