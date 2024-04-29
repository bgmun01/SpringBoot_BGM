package com.example.member.repository;

import com.example.member.entity.MemberEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
//pK의 타입
    // 이메일로 회원 정보 조회
    // 알아서  쿼리를 해준다?

    Optional<MemberEntity> findByMemberEmail(String memberEmail);
}
