package br.com.camila.payroll_api.domain;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private Double hourlyPrice;

}
