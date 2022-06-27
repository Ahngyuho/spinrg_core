package hello.core.order;

import hello.core.AppConfig;
import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderServiceTest {
    MemberService memberService;
    OrderService orderService;

    @Test
    void createOrder(){
        long memberId = 1L;
        Member member = new Member(memberId,"memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

    @Test
    void test(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService bean1 = ac.getBean(MemberService.class);
        OrderService bean2 = ac.getBean(OrderService.class);

        MemberRepository member = bean1.myReturn();
        MemberRepository order = bean2.myReturn();
        Assertions.assertThat(member).isEqualTo(order);
    }
}
