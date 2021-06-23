package com.example.carSale;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.util.Assert;

@SpringBootTest
class CarSaleApplicationTests {


	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

	@Test
	void contextLoads() {
		Car superCar = context.getBean("sportCar",Car.class);
		String result = superCar.readyForSale();
		Assert.isTrue(result.equals("Car ready in: Sport"));


	}

	@Test
	void vanTest() {
		Car vanCar = context.getBean("vanCar",Car.class);
		String result = vanCar.readyForSale();
		Assert.isTrue(result.equals("Car ready in: Van"));
	}

}
