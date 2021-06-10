package org.launchcode.skillstracker.controllers;

import org.apache.coyote.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String SkillsTracker(){
        return "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We need these languages</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @RequestMapping(value = "response", method = {RequestMethod.GET, RequestMethod.POST})
    public String FormResponse(@RequestParam String name, String lang1, String lang2, String lang3){
        return "<html>" +
                "<h1>" + name + "</h1>" +
                "<h2>Favorite Languages</h2>" +
                "<ol>" +
                "<li>" + lang1 + "</li>" +
                "<li>" + lang2 + "</li>" +
                "<li>" + lang3 + "</li>" +
                "</ol>" +
                "</html>";
    }

    @GetMapping("form")
    public String SkillsForm(){
        return"<html>" +
                "<form method = 'post' action = '/response'>" +
                "<label for='name'>Name:</label>" +
                "<input type = 'text' name = 'name'>" +
                "<br>" +
                "<label for='lang1'>Favorite Language:</label>"+
                "<select name='lang1'>" +
                "<option value=''>--Please choose an option--</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label for='lang2'>Second Favorite Language:</label>" +
                "<select name='lang2'>" +
                "<option value=''>--Please choose an option--</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label for='lang3'>Third Favorite Language</label>" +
                "<select name='lang3'>" +
                "<option value=''>--Please choose an option--</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<input type = 'submit' value = 'Submit'>" +
                "</form>" +
                "</html>";

    }
}
