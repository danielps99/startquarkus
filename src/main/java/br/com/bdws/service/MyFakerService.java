/**
 * @author Daniel Pereira dos Santos on 12/1/23
 */

package br.com.bdws.service;

import br.com.bdws.dto.CompanyDto;
import com.github.javafaker.Faker;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyFakerService {
    private final Faker faker = new Faker();

    public CompanyDto createCompanyDto () {
        return new CompanyDto(faker.company(), faker.address(), faker.dog(), faker.artist());
    }
}
