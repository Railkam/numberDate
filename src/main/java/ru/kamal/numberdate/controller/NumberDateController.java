package ru.kamal.numberdate.controller;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kamal.numberdate.entity.NumberDate;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class NumberDateController {



    @GetMapping("/number")
    public String getNumber() {
        NumberDate numberDate = new NumberDate();
        return numberDate.getNumber();
    }


}
