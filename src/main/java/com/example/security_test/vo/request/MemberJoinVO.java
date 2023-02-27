package com.example.security_test.vo.request;

import lombok.Data;

@Data
public class MemberJoinVO {
    private String id;
    private String pwd;
    private String name;
    private String nickname;
}
