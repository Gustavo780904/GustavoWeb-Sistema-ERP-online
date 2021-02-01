package com.macsistema.mac.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controle {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
}
