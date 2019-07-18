package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FibonacciController {
	@GetMapping("/Fibonacci")
	  public int getHelloWordObject(@RequestParam("number") int number) {
	      int a=0, b=1, c;
	      if(number==0) 
	    	  return a;
	      for (int i=2; i<=number; i++) {
	    	  c = a + b;
	    	  a = b;
	    	  b = c;
	      }
	      return b;
	  }
}
