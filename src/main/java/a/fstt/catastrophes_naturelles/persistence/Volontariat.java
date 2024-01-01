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
@Table(name="volontariat")
public class Volontariat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long volontariatId;

    private String nom;
    private String adresse;
    private String telephone;
    private String email;
    private String disponibilite;

    @ManyToOne
    @JoinColumn(name = "catastrophe_id")
    private catastrophes catastrophe;
}
