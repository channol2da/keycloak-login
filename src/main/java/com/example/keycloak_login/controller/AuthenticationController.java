package com.example.keycloak_login.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @GetMapping("/permitAll")
    public ResponseEntity<String> permitAll(){
        return ResponseEntity.ok("누구나 접근이 가능합니다.\n");
    }

    @GetMapping("/authenticated")
    public ResponseEntity<String> authenticate(@RequestHeader String Authorization){
        log.debug(Authorization);
        return ResponseEntity.ok("로그인한 사람 누구나 접근이 가능합니다.\n");
    }

    @PreAuthorize("hasAnyRole('users')") // 권한확인
    @GetMapping("/user")
    public ResponseEntity<String> user() {
        return ResponseEntity.ok("Role이 \'users\'인 유저만 접근이 가능합니다.\n");
    }

    @PreAuthorize("hasAnyRole('admin')") // 권한확인
    @GetMapping("/admin")
    public ResponseEntity<String> admin() {
        return ResponseEntity.ok("Role이 \'admin\'인 유저만 접근이 가능합니다.\n");
    }
}
