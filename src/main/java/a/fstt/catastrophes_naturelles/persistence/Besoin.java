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
@Table(name="besoin")
public class Besoin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long besoinId;

    private String description;

    @ManyToOne
    @JoinColumn(name = "catastrophe_id")
    private catastrophes catastrophe;

}
