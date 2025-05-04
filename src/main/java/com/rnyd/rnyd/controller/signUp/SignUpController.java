package com.rnyd.rnyd.controller.signUp;

import com.rnyd.rnyd.dto.user.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signup") // http://localhost:8080/sign-up
public class SignUpController {
   @PostMapping("/register") // http://localhost:8080/signup/register POST
    public ResponseEntity<UserDTO> register(@RequestBody UserDTO request) {

        return ResponseEntity.ok(new UserDTO());

    }

    @GetMapping("/register") // http://localhost:8080/sign-up GET
    public ResponseEntity<String> getAll() {
        return ResponseEntity.ok("Hola");

    }
}

