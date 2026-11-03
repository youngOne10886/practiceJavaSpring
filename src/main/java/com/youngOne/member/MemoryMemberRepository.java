package com.youngOne.member;

import com.youngOne.member.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{
    // class member
    // class method
    @Override
    public Member save(Member member) {
        return member;
    }
    @Override
    public Optional<Member> findById(Long id) {

    }
    @Override
    public Optional<Member> findByName(String name) {

    }
    @Override
    public List<Member> findAll() {

    }
}
