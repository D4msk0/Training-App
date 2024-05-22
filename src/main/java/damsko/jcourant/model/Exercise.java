package damsko.jcourant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Exercise {
    private String name;
    private int sets;
    private int reps;

}
