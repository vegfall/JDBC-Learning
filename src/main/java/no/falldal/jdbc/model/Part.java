package no.falldal.jdbc.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
public class Part {
    @Id
    private Integer id;
    private String name;
    private Integer quantity;

    public Part(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Part(Integer id, String name, Integer quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
}
