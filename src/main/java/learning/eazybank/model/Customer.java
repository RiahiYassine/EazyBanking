package learning.eazybank.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor @AllArgsConstructor @Builder
@ToString

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(name = "role", nullable = false)
    private String role;

}
