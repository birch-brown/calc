package com.genusllc.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MinusController {
    @GetMapping("/minus")
    public Result minus(@RequestParam(value="a") Long a, @RequestParam(value="b") Long b) {
        return new Result(a - b);
    }
}
