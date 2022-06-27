package hello.core;

import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CoreApplicationTests {

	@Test
	void contextLoads() {

		Long ll = new Long(1);
		OrderService orderService = new OrderServiceImpl(new MemoryMemberRepository(),new RateDiscountPolicy());

	}

}
