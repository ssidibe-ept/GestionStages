package sn.edu.groupeisi.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Entreprise {
    @Id
    @Column(unique = true,  nullable = false, length = 150)
    private String raisonSociale;

    @Column(length = 150)
    private String secteurActivite;

    @Column(length = 200)
    private String adresse;

    @Column(length = 70,  nullable = false)
    private String email;

    @Column(length = 30,  nullable = false)
    private String telephone;
}