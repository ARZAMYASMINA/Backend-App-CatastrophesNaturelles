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
@Table(name="logistique")
public class Logistique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int logistiqueId;
    private float latitude;
    private float longitude;
    private String description;

    @ManyToOne
    @JoinColumn(name = "catastrophe_id")
    private catastrophes catastrophe;
}
