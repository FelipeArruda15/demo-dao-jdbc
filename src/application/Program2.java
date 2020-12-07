package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("==== TEST 1: department insert =====");
		Department department = new Department(null, "Recursos Humanos");
		departmentDao.insert(department);
		System.out.println("Inserted! New id = " + department.getId());
		
		System.out.println("\n=== TEST 2: department update =======");
		Department dep2 = departmentDao.findById(6);
		dep2.setName("RH");
		departmentDao.update(dep2);
		System.out.println("Update completed");
		
		
		System.out.println("\n==== TEST 3: department findById =====");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n==== TEST 4: department findAll =====");
		List<Department> list = departmentDao.findAll();
		for (Department d : list){
			System.out.println(d);
		}
		
		System.out.println("\n=== TEST 5: delete =======");
		departmentDao.deleteById(8);
		System.out.println("Delete completed");
	}

}
