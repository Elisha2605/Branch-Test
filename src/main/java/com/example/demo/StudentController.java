package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.logging.Logger;

@Controller
public class StudentController {

    Logger log = Logger.getLogger(StudentController.class.getName()); //logger er det samme som system.out.print

    ArrayList<Student> students = new ArrayList<>();

    public StudentController() {
        students.add(new Student (1, "Faisal", "Jarkass", "fafj@kea.dk"));
        students.add(new Student (1, "Elisha", "Ngoma", "Elisha@kea.dk"));
        students.add(new Student (1, "Morten", "Mortensen", "morten@kea.dk"));
        students.add(new Student (1, "Jesper", "Nordentoft", "jesper@kea.dk"));
    }

    @GetMapping("/")
    public String index(Model model) {
        log.info("index called...");
        log.fine("Index: 0 -> " + students.get(0));

        model.addAttribute("students", students);

        return "index";
    }
}
