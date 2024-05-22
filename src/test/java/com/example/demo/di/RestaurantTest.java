package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.di.Chef;
import com.example.demo.di.Restaurant;

/*
 * 의존성 주입 테스트
 * */
@SpringBootTest
public class RestaurantTest {

	@Autowired //컨테이너에서 빈을 찾아서 필드에 주입
	Restaurant restaurant;
	
	@Autowired
	Chef chef;

	@Test
	void 테스트() {
		System.out.println("restaurant: " + restaurant); //레스토랑 인스턴스의 주소
		
		System.out.println("chef: " + chef); //쉐프 인스턴스의 주소
		
		System.out.println("getChef(): " + restaurant.getChef()); //위와 주소가 같음. 객체 하나를 생성하고 공유함	
	}


}
