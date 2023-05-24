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

	@GetMapping("/layout-extends")
	public String layoutExtends() {
		return "template/layout_extends/layout-extends-main";
	}
}
