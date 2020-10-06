package com.example.webday5restmethods.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get-endpoints")
public class GetController {

	@GetMapping("/path-variables/pv1/{pv1}/pv2/{pv2}")
	public String pathParams(@PathVariable String pv1, @PathVariable String pv2) {
		return String.format("pv1: %s; pv2: %s", pv1, pv2);
	}

	@GetMapping("/request-params")
	public String requestParams(@RequestParam String rp1, @RequestParam String rp2) {
		return String.format("rp1: %s; rp2: %s", rp1, rp2);
	}
}
