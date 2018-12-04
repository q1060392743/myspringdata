package cn.com.taiji.myspringdata.service;

import cn.com.taiji.myspringdata.domain.CustomerRepository;
import cn.com.taiji.myspringdata.domain.Customers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * @author SongChong created by 2018/12/4 0004 14:37
 */
@Service
public class CustomersService {

    @Inject
    CustomerRepository customerRepository;

    public List<Customers> getPageCustomers() {
        PageRequest pageable = new PageRequest(1, 2);
        Specification<Customers> spec = new Specification<Customers>() {
            @Override
            public Predicate toPredicate(Root<Customers> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list = new ArrayList<>();
                //list.add(criteriaBuilder.equal(root.<Long>get("id"), 1));
                return criteriaBuilder.and(list.toArray(new Predicate[0]));
            }
        };
        Page<Customers> pageList = customerRepository.findAll(spec, pageable);
        return pageList.getContent();
    }

}