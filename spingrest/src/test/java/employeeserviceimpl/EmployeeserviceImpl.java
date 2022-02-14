package employeeserviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rest.spingrest.repository.EmployeeDao;
@SpringBootTest
public class EmployeeserviceImpl {
	@Autowired
	private EmployeeserviceImpl employeeserviceImpl;
	@Autowired
	private EmployeeDao employeeDao;
	
	@BeforeEach
	void setup() {
		EmployeeserviceImpl employeeserviceImpl=new EmployeeserviceImpl();
	}

	@Test
	void test() {
		System.out.println("the test is running");
	}

	
	

	
	
}