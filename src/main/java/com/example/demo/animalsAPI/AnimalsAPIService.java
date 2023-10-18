package com.example.demo.animalsAPI;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AnimalsAPIService {

	private final AnimalsAPIRepository animalsAPIRepository;

	public AnimalsAPIService(AnimalsAPIRepository animalsAPIRepository) {
		this.animalsAPIRepository = animalsAPIRepository;
	}

	public List<AnimalsAPIData> getAnimals() throws IOException {

		AnimalsAPIData[] animalsList = animalsAPIRepository.getAnimals();

		return Arrays.asList(animalsList);

	}

	public List<AnimalsAPIData> picAnimals(String animalId) throws IOException {

		AnimalsAPIData[] animalDetail = animalsAPIRepository.picAnimals(animalId);

		return Arrays.asList(animalDetail);

	}

}