package com.dovalle.challenge;

import com.dovalle.challenge.intermediary.NumericTrial03;
import com.dovalle.challenge.superior.MathTrial01;
import com.dovalle.challenge.superior.MathTrial02;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ChallengeApplication.class, args);
		/*
		System.out.println("Typed a number between 0 and 100000");
		NumericTrial03.run();*/

		/*System.out.println("Type a radius value to calculate the circle's area:\n");
		MathTrial01.run();*/

		System.out.println("Type a note:\n");
		MathTrial02.run();
	}

}
