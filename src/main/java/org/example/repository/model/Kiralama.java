package org.example.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Kiralama {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Kisi kisi;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Arac arac;
    private LocalDate kiralamaTarihi;
    private LocalDate kiralamaBitisTarihi;

}
