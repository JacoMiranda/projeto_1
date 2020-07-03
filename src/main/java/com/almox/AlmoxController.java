package com.almox;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlmoxController {
	
	@RequestMapping("/novo")
	public String novo() {
		
		return "CadastroProd";
    }
    
     @RequestMapping("/es")
     public String sMaterial(){

         return "SaidaMaterial";
     }

}
