package br.com.camila.payroll_api.resources;

import br.com.camila.payroll_api.domain.Payroll;
import br.com.camila.payroll_api.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {



    private final PayrollService payrollService;

    @GetMapping("/{workedId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workedId, @RequestBody Payroll payment){
        return ResponseEntity.ok().body(payrollService.getPayment(workedId, payment));
    }
}
