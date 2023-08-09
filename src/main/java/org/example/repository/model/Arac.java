package org.example.repository.model;

import lombok.*;
import org.example.repository.model.enums.EAracStatus;
import org.example.repository.model.enums.EAracVites;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Arac {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "marka")
    private String marka;
    @Column(name = "model")
    private String model;
    @Builder.Default
    @Enumerated(EnumType.STRING)
    private EAracVites vites = EAracVites.MANUEL;
    @Builder.Default
    @Enumerated(EnumType.STRING)
    private EAracStatus durum = EAracStatus.MUSAIT;

}
