package br.com.camila.payroll_api.feignClients;

import br.com.camila.payroll_api.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

// Feign como se fosse um proxy
// Não usamos resttemplate, pois estamos trabalhando com microsserviços (com Feign Client)
@FeignClient(name = "user-api", url = "http://localhost:8000")
public interface UserFeign {

    @GetMapping(value = "/api/users/{id}")
    ResponseEntity<User> findById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<User>> findAll();
}
