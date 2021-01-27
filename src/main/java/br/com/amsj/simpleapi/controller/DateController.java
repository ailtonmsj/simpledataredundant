package br.com.amsj.simpleapi.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {
	
	@RequestMapping(method=RequestMethod.GET, path="/")
	public String getCurrentDate() {
		
		return "API date " + new Date();
	}
}
