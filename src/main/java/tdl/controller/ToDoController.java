package tdl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ToDoController {


  @GetMapping("")
  public String view1(){
    
    return "";
  }



}
