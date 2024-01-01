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
@Table(name="aide")
public class Aide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aideId;

    private String type;
    private String description;
    private float montant;

    @ManyToOne
    @JoinColumn(name = "catastrophe_id")
    private catastrophes catastrophe;

}
