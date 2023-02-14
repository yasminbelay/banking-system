package august.bank.app.bankproject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class User {

    @Id
    private long id;

    private String name;

    private String email;

    private String password;

    @ManyToMany
    private List<Role> roles;
}
