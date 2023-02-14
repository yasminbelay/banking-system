package august.bank.app.bankproject.Entity;

import org.springframework.data.annotation.Id;
import lombok.Data;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection = "User")
@Data
public class User {

    @Id
    private long id;

    private String name;

    private String email;

    private String password;
    @DocumentReference(lookup = "Role")
    private List<Role> roles;
}
