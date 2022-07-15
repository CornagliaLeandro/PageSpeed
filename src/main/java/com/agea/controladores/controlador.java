package com.agea.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.ModelMap;

import com.agea.entidades.Agea;


import com.agea.servicios.SpeedService;


@Controller
@RequestMapping("/")
public class controlador {

	@Autowired
	SpeedService speedServices;
	
	
	@GetMapping("/resultado")
	public String compararURL(ModelMap model, @RequestParam("url") String url, @RequestParam("urlComparar") String urlComparar){
		
		Agea pagina1 = speedServices.comparar(url);
		Agea pagina2 = speedServices.comparar(urlComparar);
		
		model.addAttribute("url", url);
		model.addAttribute("urlComparar", urlComparar);
		
		model.addAttribute("pagina1speedIndex", pagina1.getLighthouseResult().getAudits().getSpeedIndex().getDisplayValue());
		model.addAttribute("pagina1interactive",pagina2.getLighthouseResult().getAudits().getSpeedIndex().getDisplayValue());
		
		model.addAttribute("pagina2speedIndex", pagina2.getLighthouseResult().getAudits().getSpeedIndex().getDisplayValue());
		model.addAttribute("pagina2interactive", pagina2.getLighthouseResult().getAudits().getSpeedIndex().getDisplayValue());
		
		return "resultados" ;
	}
}
