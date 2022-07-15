package com.agea.servicios;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.agea.entidades.Agea;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Service
public class SpeedService {


	public Agea comparar(String urlParam) {
		
	

		String key = "AIzaSyASqvjMpONb8iO6mEc1lg0jTrwg7jnL7Bo";

		String url = "https://www.googleapis.com/pagespeedonline/v5/runPagespeed?url=" + urlParam + "&key=" + key;

		RestTemplate rt = new RestTemplate();

		ResponseEntity<String> resp = rt.getForEntity(url, String.class);

		String str = resp.getBody();

		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		Gson gson = builder.create();
		Agea user = gson.fromJson(str, Agea.class);
		str = gson.toJson(user);

		return user;
	}

}
