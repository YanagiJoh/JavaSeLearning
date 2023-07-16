package TeamworkProject.Test;

import TeamworkProject.domain.Employee;
import TeamworkProject.service.NameListService;
import TeamworkProject.service.TeamException;
import org.junit.Test;

public class NameListServiceTest {

    @Test
    public void testGetAllEmployees() {

        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

    }

    @Test
    public void testGetEmployee() {

        NameListService service = new NameListService();
        int id = 1;
        id = 101;

        try {
            Employee employee = service.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }

    }
}
