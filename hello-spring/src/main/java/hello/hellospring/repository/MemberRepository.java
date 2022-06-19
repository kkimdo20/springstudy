package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //optional은 자바 8부터 나온 기능 NPE 방지를 위한 코드임
    Optional<Member> findByName(String name);
    List<Member> findAll();

}
