package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.CalculateForm;

@Controller
public class CalculateController
{
	@RequestMapping("/calculate")
	public String form(Model model)
	{
		model.addAttribute("calculateForm", new CalculateForm());
		return "index";
	}

	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public String result(@ModelAttribute CalculateForm calculateForm, Model model)
	{
		calculateForm.sumTotal();
		model.addAttribute("calculateForm", calculateForm);
		return "result";
	}
}
