package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Form;

@Controller
public class HelloController
{
	// @RequestMapping(value = "/", method = RequestMethod.GET)
	@RequestMapping("/")
	public String index(Model model)
	{
		model.addAttribute("message", "Hello Spring boot");
		model.addAttribute("form", new Form());

		return "index"; // 表示HTMLファイルの名前（拡張子不要）を指定
	}
}