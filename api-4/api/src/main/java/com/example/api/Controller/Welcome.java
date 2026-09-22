package com.example.api.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

 @GetMapping("/")

    public String BoasVindas(){
     return "Seja Bem Vindo";

 }
 @GetMapping("/Dev")

    public String Dev(){
     return "Feito Por Jubileu!!";

 }
}
