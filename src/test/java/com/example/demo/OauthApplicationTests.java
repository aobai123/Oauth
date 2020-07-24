package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class OauthApplicationTests {

   public static void main(String[] args) {
     System.out.println(new BCryptPasswordEncoder().encode("123456"));
   }

}
