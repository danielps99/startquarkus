/**
 * @author Daniel Pereira dos Santos on 12/1/23
 */

package br.com.bdws.dto;

import com.github.javafaker.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDto {
    private String name;
    private String industry;
    private String profession;
    private String logo;
    private String url;
    private String bs;
    private String buzzword;
    private String catchPhrase;
    private String suffix;
    private Address address;
    private Dog vigilant;
    private Artist manager;

    public CompanyDto(Company company, Address addr, Dog vigil, Artist manag) {
        name = company.name();
        industry = company.industry();
        profession = company.profession();
        logo = company.logo();
        url = company.url();
        bs = company.bs();
        buzzword = company.buzzword();
        catchPhrase = company.catchPhrase();
        suffix = company.suffix();
        address = addr;
        vigilant = vigil;
        manager = manag;
    }
}
