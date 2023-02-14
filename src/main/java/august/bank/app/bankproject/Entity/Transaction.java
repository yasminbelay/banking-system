package august.bank.app.bankproject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Transaction {

    @Id
    private Long id;

    private LocalDateTime dateTime;

    private Long number;


    private Double amount;


    private String type;

    private Long from;

    private Long to;

    private Double balance;




}
