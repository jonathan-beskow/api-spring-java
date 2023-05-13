package br.com.erudio.apigateway.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.erudio.apigateway.Model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Override
    default Optional<Person> findById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    


}
