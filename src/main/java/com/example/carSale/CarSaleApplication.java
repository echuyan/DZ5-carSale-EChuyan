package com.example.carSale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedArrayType;

@SpringBootApplication
public class CarSaleApplication {

	public static void main(String[] args) {
	SpringApplication.run(CarSaleApplication.class, args);

	//Car carForFamily = new Car(configuration);
	//	System.out.println(carForFamily.readyForSale());

	//	Car carForYoung = new Car(configuration);
	//	System.out.println(carForYoung.readyForSale());

		//	Car carForTravel = new Car(configuration);
		//	System.out.println(carForTravel.readyForSale());

		//Car carForFamily = new Car(new ClassicConfiguration());
	//	System.out.println(carForFamily.readyForSale());

	//	Car carForYoung = new Car(new SportConfiguration());
	//	System.out.println(carForYoung.readyForSale());

		//	Car carForTravel = new Car(new VanConfiguration());
		//	System.out.println(carForTravel.readyForSale());

		//инверсия контроля
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Car newCarForFamily = context.getBean("classicCar",Car.class);
		Car newCarForYoung = context.getBean("sportCar",Car.class);
		Car newCarForTravel = context.getBean("vanCar",Car.class);

		System.out.println(newCarForFamily.readyForSale());
		System.out.println(newCarForYoung.readyForSale());
		System.out.println(newCarForTravel.readyForSale());
	}

}
