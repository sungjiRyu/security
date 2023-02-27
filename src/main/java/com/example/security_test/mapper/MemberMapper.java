package com.example.security_test.mapper;

import com.example.security.vo.request.LoginVO;
import com.example.security_test.vo.entity.MemberInfoVO;
import com.example.security_test.vo.request.MemberJoinVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    public void insertMember(MemberJoinVO data);
    MemberInfoVO getMemberInfoByMemberId(String id);
    MemberInfoVO getMemberInfoByLoginInfo(LoginVO login);
}
