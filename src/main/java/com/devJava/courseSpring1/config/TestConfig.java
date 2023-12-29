package com.devJava.courseSpring1.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devJava.courseSpring1.Enums.OrderStatus;
import com.devJava.courseSpring1.entites.Category;
import com.devJava.courseSpring1.entites.Order;
import com.devJava.courseSpring1.entites.Product;
import com.devJava.courseSpring1.entites.User;
import com.devJava.courseSpring1.repositories.CategoryRepository;
import com.devJava.courseSpring1.repositories.OrderRepository;
import com.devJava.courseSpring1.repositories.ProductRepository;
import com.devJava.courseSpring1.repositories.UserRepository;

// aqui vai informar para o Spring que esse aqrquivo
//irá rodar como um test que foi instanciado no application.properties
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;
	// basicamente esse código vai executar assim que o programa rodar
	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category("Electronics");
		Category cat2 = new Category( "Books");
		Category cat3 = new Category( "Computers");
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		Product p1 = new Product( "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product( "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product( "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product( "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product( "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		User u1 = new User( "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User("Alex Green", "alex@gmail.com", "977777777", "123456");
		// ele vai salvar uma lisa de determinado objeto dentro do banco de dados
		userRepository.saveAll(Arrays.asList(u1, u2));
		Order o1 = new Order( Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAID, u1);
		Order o2 = new Order( Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITING_PAMENT, u2);
		Order o3 = new Order( Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.WAITING_PAMENT, u1);
	    orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	    
	}
}
