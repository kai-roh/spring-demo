package com.example.demo.controller;

import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberContorller {

    private final MemberService memberService;

    @Autowired
    public MemberContorller(MemberService memberService) {
        this.memberService = memberService;
    }

}