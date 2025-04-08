package tdl.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ToDoController {

  @GetMapping("/home")
  public String view1() {
    // templates/boardlist.html 을 렌더링

    return "boardlist";
  }


}
