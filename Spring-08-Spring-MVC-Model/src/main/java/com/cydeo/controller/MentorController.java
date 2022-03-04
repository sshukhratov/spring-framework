package com.cydeo.controller;

import com.cydeo.model.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {

    @RequestMapping("/mentors")
    public String mentor(Model model){

        Mentor mentor1 = new Mentor("Mike", "Smith", 45, Gender.MALE);
        Mentor mentor2 = new Mentor("Tom", "Hanks", 65, Gender.MALE);
        Mentor mentor3 = new Mentor("Ammy", "Bryan", 25, Gender.FEMALE);

        model.addAttribute("MIKE", mentor1);
        model.addAttribute("TOM", mentor2);
        model.addAttribute("AMMY", mentor3);

        List<String> columnNames = new ArrayList<>();
        columnNames.add(" First Name ");
        columnNames.add(" Last Name ");
        columnNames.add(" Age ");
        columnNames.add(" Gender");

        model.addAttribute("column", columnNames);


        return "/student/Mentor";
    }
}
