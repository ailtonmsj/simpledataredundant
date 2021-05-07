package br.com.amsj.simpleapi.redundant.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(method=RequestMethod.GET, path="/")
	public ResponseEntity<String> getCurrentDate() {
		
		ResponseEntity<String> responseEntity = null;
		
		Date date = new Date();
		
		SimpleDateFormat dt1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:SS");
		String dateString = dt1.format (date);
		
		log.info("Success");
		
		responseEntity = new ResponseEntity<String>(dateString, HttpStatus.OK);
		
		log.info("Success on Redundant");
		
		return responseEntity;
	}
}
