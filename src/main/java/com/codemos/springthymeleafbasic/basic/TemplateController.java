package com.codemos.springthymeleafbasic.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")
public class TemplateController {
	@GetMapping("/fragment")
	public String template() {
		return "template/fragments/fragment-main";
	}

	@GetMapping("/layout")
	public String layout() {
		return "template/layouts/layout-main";
	}
}
