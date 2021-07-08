package com.example.demo;

import com.example.demo.domain.Card;
import com.example.demo.domain.Player;
import com.example.demo.repository.CardRepository;
import com.example.demo.repository.PlayerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
		SpringApplication.run(DemoApplication.class, args);
		CardRepository cardRepository = configurableApplicationContext.getBean(CardRepository.class);
		PlayerRepository playerRepository = configurableApplicationContext.getBean(PlayerRepository.class);

		Player p1 = new Player ("Franck");
		Card c1 = new Card (Card.Value.BOMB, p1);
		Card c2 = new Card (Card.Value.COLOR, p1);
		Card c3 = new Card (Card.Value.ORDINARY, p1);
		Card c4 = new Card (Card.Value.ORDINARY, p1);
		Card c5 = new Card (Card.Value.ORDINARY, p1);
		Player p2 = new Player ("Franck");

		playerRepository.save(p1);
		playerRepository.save(p2);
		cardRepository.save(c1);
		cardRepository.save(c2);
		cardRepository.save(c3);
		cardRepository.save(c4);
		cardRepository.save(c5);

	}

}
