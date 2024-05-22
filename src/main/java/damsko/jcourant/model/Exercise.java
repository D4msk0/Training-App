package damsko.jcourant.model;

import lombok.Data;

@Data
public class Exercise {
    private String name;
    private int sets;
    private int reps;


    public Exercise(String name, int sets, int reps) {
        this.name = name;
        this.sets = sets;
        this.reps = reps;
    }
}
