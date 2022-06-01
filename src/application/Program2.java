package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department insert ====");
		Department department = new Department(null, "Jogos");
		departmentDao.insert(department);
		System.out.println("Inserted! New Id = " + department.getId());
		
		System.out.println("=== TEST 2: Department update ====");
		department.setName("Jogos eletronicos");
		departmentDao.update(department);
		System.out.println("Updated complete!");
		
		System.out.println("=== TEST 3: Department delete ====");
		departmentDao.deleteById(9);
		System.out.println("Deleted complete!");
		
		System.out.println("=== TEST 4: Department findById ====");
		Department departmentFinded = departmentDao.findById(2);
		System.out.println(departmentFinded);
		
		System.out.println("=== TEST 5: Department findAll ====");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}


	}

}
