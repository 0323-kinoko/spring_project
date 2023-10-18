package com.example.demo.animalsAPI;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnimalsAPIController {
	
	private final AnimalsAPIService animalsAPIService;

	public AnimalsAPIController(AnimalsAPIService animalsAPIService) {
		this.animalsAPIService = animalsAPIService;
	}

	@GetMapping("/animalsAPI")
	public String animalsAPI(Model model) throws IOException {

		List<AnimalsAPIData> animalsList = animalsAPIService.getAnimals();

		model.addAttribute("animalsList", animalsList);

		return "animalsAPI.html";

		
		
	}

	@PostMapping("/animalsSearch")
	public String picPets(@RequestParam("animalId") String animalId, Model model) throws IOException {

		List<AnimalsAPIData> animalDetail = animalsAPIService.picAnimals(animalId);

		model.addAttribute("animalDetail", animalDetail);	

		return "animalsResult.html";

	}

}