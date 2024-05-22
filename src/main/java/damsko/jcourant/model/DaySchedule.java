package damsko.jcourant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
public class DaySchedule {
    private String day;
    private List<Exercise> exercises;

}
