package a.fstt.catastrophes_naturelles.persistence;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="assistence")
public class assistence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assistanceId;

    private String nom;
    private String adresse;
    private String telephone;
    private String email;

    @ManyToOne
    @JoinColumn(name = "catastrophe_id")
    private catastrophes catastrophe;
}
