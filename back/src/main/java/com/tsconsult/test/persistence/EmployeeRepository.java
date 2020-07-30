package com.tsconsult.test.persistence;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tsconsult.test.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Long>{

}
