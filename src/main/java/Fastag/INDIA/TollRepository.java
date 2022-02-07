package Fastag.INDIA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Fastag.INDIA.entity.fastag;
@Repository
public interface TollRepository extends JpaRepository<fastag, String > {

}
