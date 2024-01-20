package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureHttpGraphQlTester;
import org.springframework.stereotype.Controller;

import static org.junit.jupiter.api.Assertions.*;

@Controller
class HelloControllerTest {

    private final MemberService memberService;

    @Autowired
    public HelloControllerTest(MemberService memberService) {
        this.memberService = memberService;
    }
}