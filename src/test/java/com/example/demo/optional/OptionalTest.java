package com.example.demo.optional;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OptionalTest {
	
//	Optional: 값을 감싸고 있는 wrapper 클래스
//	객체에 값이 있는지 없는지를 확인하기 위해 사용
	
	@Test
	void Optional사용하기() {
//		단일 test는 우클-run as-junit test
		String str = "apple";
		Optional<String> opt = Optional.of(str);
		
		System.out.println("Optional에서 값 꺼내기: " + opt.get());
		System.out.println("Optional안에 값이 있는지?: " + opt.isPresent());
		System.out.println("Optional안에 값이 없는지?: " + opt.isEmpty());
		
//		Optional에 값이 있으면 그대로 출력 없으면, 바나나로 대체 
		String str2 = null;
		System.out.println(Optional.ofNullable(str2).orElse("banana"));
	}
	
	@Test
	void of와ofNullable의차이() {
		
//		of: Optional을 생성하는 함수. null 입력불가
//		ofNullable: Optioanl을 생성하는 함수. null 입력가능
		
		String str = null;
		
//		Optional<String> opt1 = Optional.of(str); // of는 null값을 받을 수 없음
		Optional<String> opt2 = Optional.ofNullable(str);
		
	}
	
	@Test
	void 빈객체를사용하는경우() {
		Optional<String> opt = Optional.ofNullable(null);
//		System.out.println(opt.get());//에러-Optional 안에 값이 없음-값이 있는지 체크해야함!!
		
//		if를 사용하여 null값 체크하기
		String str = "banana";
		if(str != null) {
			System.out.println("값이 존재합니다");
		}
		
//		optional을 사용하여 null값 체크하기
		Optional<String> opt2 = Optional.ofNullable(str);
		opt2.ifPresent(name -> System.out.println("값이 존재합니다: " + name));
//		if함수 안에는 람다식을 사용해야함
		
	}
}
