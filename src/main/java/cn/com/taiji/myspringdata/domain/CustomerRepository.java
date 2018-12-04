package cn.com.taiji.myspringdata.domain;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author SongChong created by 2018/12/4 0004 10:38
 */
public interface CustomerRepository extends JpaRepository<Customers, Long>, JpaSpecificationExecutor<Customers> {
    List<Customers> findByLastName(String lastName);

    List<Customers> findAll();

    Customers findByFirstNameAndLastName(String firstName, String lastName);

    Customers findByIdIs(long id);

    List<Customers> findByIdBetween(long start, long end);

    List<Customers> findByIdLessThan(long end);

    List<Customers> findByIdLessThanEqual(long end);

    List<Customers> findAll(Sort var1);

    List<Customers> findAllByIdGreaterThan(long start);

    List<Customers> findAllByIdGreaterThanEqual(long start);

    List<Customers> findAllByIdAfter(long start);

    List<Customers> findAllByIdBefore(long end);

    List<Customers> findAllByIdNotNull();

    List<Customers> findAllByFirstNameLike(String string);

    List<Customers> findAllByIdGreaterThanEqualOrderByFirstNameDesc(long start);
}
