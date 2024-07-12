package br.com.camila.payroll_api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// não é uma entidade, então não precisa persistir no banco
@Getter @Setter
@AllArgsConstructor
public class Payroll {

    private String workerName;
    private String description;
    private Double hourlyPrice;
    private Double workedHours;
    private Double totalPayment;
}
