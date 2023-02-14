package august.bank.app.bankproject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Account {

    @Id
    private Long id;

    private String type;

    private Double balance;

}
