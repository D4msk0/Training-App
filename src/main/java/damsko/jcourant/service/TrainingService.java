package damsko.jcourant.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import damsko.jcourant.model.DaySchedule;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class TrainingService {

    private List<DaySchedule> schedule;

    @PostConstruct
    public void init() {
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<DaySchedule>> typeReference = new TypeReference<>(){};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/trainingsschema.json");

        try {
            schedule = objectMapper.readValue(inputStream, typeReference);
        } catch (IOException e) {
            throw new RuntimeException("Could not read trainingsschema.json", e);
        }
    }

    public List<DaySchedule> getWeeklySchedule() {
        return schedule;
    }
}
