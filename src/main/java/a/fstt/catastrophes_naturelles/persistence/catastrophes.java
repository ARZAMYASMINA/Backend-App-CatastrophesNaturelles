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
@Table(name="catastrophes")
public class catastrophes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @OneToMany(mappedBy = "catastrophe", cascade = CascadeType.ALL)
    private List<assistence> assistanceList;

    @OneToMany(mappedBy = "catastrophe", cascade = CascadeType.ALL)
    private List<Aide> aideList;

    @OneToMany(mappedBy = "catastrophe", cascade = CascadeType.ALL)
    private List<Volontariat> volontariatList;

    @OneToMany(mappedBy = "catastrophe", cascade = CascadeType.ALL)
    private List<Logistique> logistiqueList;

    @OneToMany(mappedBy = "catastrophe", cascade = CascadeType.ALL)
    private List<Besoin> besoinList;
}
