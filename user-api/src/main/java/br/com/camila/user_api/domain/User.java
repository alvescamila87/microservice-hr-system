package br.com.camila.user_api.domain;

import lombok.*;
import lombok.EqualsAndHashCode.Include;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "TB_USER")
@Getter @Setter
@NoArgsConstructor
//@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Include
    private Long id;
    private String name;
    private String email;
    private String password;
    private Double hourlyPrice;

    public User(Long id, String name, String email, String password, Double hourlyPrice) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.hourlyPrice = hourlyPrice;
    }
}
