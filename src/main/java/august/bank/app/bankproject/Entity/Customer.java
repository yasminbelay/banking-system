package august.bank.app.bankproject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Customer {

    @Id
    private Long id;

    private String firstName;

    private String lastName;


    @OneToMany
    private List<Account>  accounts;


    @OneToMany
    private List<Transaction> transactions;


}
