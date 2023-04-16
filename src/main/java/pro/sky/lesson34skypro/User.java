package pro.sky.lesson34skypro;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.lang.NonNull;

@Data
@AllArgsConstructor
public class User {
    @NonNull
    private String name;
}
