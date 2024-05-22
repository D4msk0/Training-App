package damsko.jcourant.service;

import damsko.jcourant.model.DaySchedule;
import damsko.jcourant.model.Exercise;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainingService {

    public List<DaySchedule> getWeeklySchedule() {
        return Arrays.asList(
                new DaySchedule("Dag 1", Arrays.asList(
                        new Exercise("Squats", 3, 12),
                        new Exercise("Lunges", 3, 12),
                        new Exercise("Deadlifts", 3, 10),
                        new Exercise("Leg Press", 3, 12),
                        new Exercise("Kettlebell Swings", 3, 15),
                        new Exercise("Cardio", 1, 20)
                )),
                new DaySchedule("Dag 2", Arrays.asList(
                        new Exercise("Bench Press", 3, 10),
                        new Exercise("Pull-Ups", 3, 10),
                        new Exercise("Bent Over Rows", 3, 12),
                        new Exercise("Shoulder Press", 3, 12),
                        new Exercise("Bicep Curls", 3, 15),
                        new Exercise("Tricep Dips", 3, 15)
                )),
                // Other days go here
                new DaySchedule("Dag 3", Arrays.asList(
                        new Exercise("Licht joggen of wandelen", 1, 30),
                        new Exercise("Stretching", 1, 20)
                )),
                new DaySchedule("Dag 4", Arrays.asList(
                        new Exercise("Deadlifts", 3, 10),
                        new Exercise("Push-Ups", 3, 15),
                        new Exercise("Dumbbell Rows", 3, 12),
                        new Exercise("Overhead Press", 3, 12),
                        new Exercise("Goblet Squats", 3, 15),
                        new Exercise("Cardio", 1, 20)
                )),
                new DaySchedule("Dag 5", Arrays.asList(
                        new Exercise("Planks", 3, 1),
                        new Exercise("Russian Twists", 3, 20),
                        new Exercise("Leg Raises", 3, 15),
                        new Exercise("Bicycle Crunches", 3, 20),
                        new Exercise("Cardio", 1, 20)
                )),
                new DaySchedule("Dag 6", Arrays.asList(
                        new Exercise("Squats", 3, 12),
                        new Exercise("Bench Press", 3, 10),
                        new Exercise("Lunges", 3, 12),
                        new Exercise("Pull-Ups", 3, 10),
                        new Exercise("Leg Press", 3, 12),
                        new Exercise("Shoulder Press", 3, 12)
                )),
                new DaySchedule("Dag 7", Arrays.asList(
                        new Exercise("Licht joggen of wandelen", 1, 30),
                        new Exercise("Stretching", 1, 20)
                ))
        );
    }
}
