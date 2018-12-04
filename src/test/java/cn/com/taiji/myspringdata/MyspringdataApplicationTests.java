package cn.com.taiji.myspringdata;

import cn.com.taiji.myspringdata.domain.CustomerRepository;
import cn.com.taiji.myspringdata.service.CustomersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyspringdataApplicationTests {

    @PersistenceContext
    EntityManager em;

    @Autowired
    private CustomerRepository customerRepository;

    @Inject
    private CustomersService customersService;

    @Test
    public void contextLoads() {

        //System.out.println(customerRepository.findByLastName("Smith"));
        //System.out.println(customerRepository.findAll());
        //System.out.println(customerRepository.findByFirstNameAndLastName("tom", "Smith"));
        //System.out.println(customerRepository.findByIdIs(1));
        //System.out.println(customerRepository.findByIdBetween(1, 3));
        //System.out.println(customerRepository.findByIdLessThan(3));
        //System.out.println(customerRepository.findByIdLessThanEqual(3));
        //System.out.println(customerRepository.findAll(new Sort(Sort.Direction.DESC, "id")));
        //System.out.println(customersService.getPageCustomers());
        //System.out.println(customerRepository.findAllByIdGreaterThan(1));
        //System.out.println(customerRepository.findAllByIdGreaterThanEqual(2));
        //System.out.println(customerRepository.findAllByIdAfter(2));
        //System.out.println(customerRepository.findAllByIdBefore(4));
        //System.out.println(customerRepository.findAllByIdNotNull());
        //System.out.println(customerRepository.findAllByFirstNameLike("%a%"));
        System.out.println(customerRepository.findAllByIdGreaterThanEqualOrderByFirstNameDesc(1L));

        //更新数据
        /*Customers customers = customerRepository.findByIdIs(1);
        customers.setFirstName("alan");
        customerRepository.save(customers);*/

        //删除数据
        //customerRepository.delete(3L);


        //添加数据
        /*Customers customers=new Customers();
        customers.setFirstName("hello");
        customers.setLastName("world");
        customerRepository.save(customers);*/
    }

}
