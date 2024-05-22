package damsko.jcourant.controller;

import damsko.jcourant.model.DaySchedule;
import damsko.jcourant.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TrainingController {

    @Autowired
    private TrainingService trainingService;

    @GetMapping("/")
    public String getSchedule(Model model) {
        List<DaySchedule> schedule = trainingService.getWeeklySchedule();
        model.addAttribute("schedule", schedule);
        return "index";
    }
}
