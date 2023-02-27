package com.example.security_test.api;

import com.example.security_test.mapper.MemberMapper;
import com.example.security_test.vo.request.MemberJoinVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/member")
public class MemberAPIController {
    @Autowired
    MemberMapper mapper;
    @PostMapping("/join")
    public ResponseEntity<Object> postMemberJoin(@RequestBody MemberJoinVO data) {
        mapper.insertMember(data);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
