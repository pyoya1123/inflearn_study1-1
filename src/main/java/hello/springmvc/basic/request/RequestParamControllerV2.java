package hello.springmvc.basic.request;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.http.HttpResponse;

@RestController
@Slf4j
public class RequestParamControllerV2 {
    @RequestMapping("/request-param-v2")
    public String requestParamV2(@RequestParam("username") String username, @RequestParam("age") int age) throws IOException {

        log.info("username={}, age={}", username, age);

        return "ok";
    }
}
