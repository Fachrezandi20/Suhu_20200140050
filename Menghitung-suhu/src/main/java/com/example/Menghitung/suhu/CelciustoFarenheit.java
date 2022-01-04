/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Menghitung.suhu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author A S U S
 */
@Controller
public class CelciustoFarenheit {
        @RequestMapping("/celcius/add")
        @ResponseBody
        public int getAdd() {
        
       int C = 30;
       int CF = C * 9/5 +32;
       
       return CF;
    }
}
