package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService;
    MemoryMemberRepository memberRepository;

    @BeforeEach
    public void beforeEach() {
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }

    @AfterEach
    public void afterEach() {
        memberRepository.clearAll();
    }

    @Test
    void join() {
        Member member = new Member();
        member.setName("spring");

        memberService.join(member);

        Member result = memberService.findOne(member.getId()).get();
        assertThat(member.getName()).isEqualTo(result.getName());
    }

    @Test
    void duplicateExceptionTest() {
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        memberService.join(member1);
        assertThrows(IllegalStateException.class, () -> memberService.join(member2));

    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}