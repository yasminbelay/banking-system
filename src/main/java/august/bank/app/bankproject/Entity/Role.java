package august.bank.app.bankproject.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Data;

@Document(collection = "Role")
@Data
public class Role {

    @Id
    private Long id;

    private String name;
}
