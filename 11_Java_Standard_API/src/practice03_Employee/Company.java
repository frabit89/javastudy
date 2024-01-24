package practice03_Employee;

import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Company {
  
  // field
  private String name;
  private List<Employee> employees;
  private Scanner sc;
  
  // constructor
  public Company(String name) {
    this.name = name;
    employees = new ArrayList<Employee>();
    sc = new Scanner(System.in);
  }

  // method
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // 고용
  public void hire(Employee employee) throws RuntimeException {
    if(employee == null) {
      throw new RuntimeException("고용될 사원 정보가 올바르지 않습니다.");
    }
    if(employees.contains(employee)) {
      throw new RuntimeException("이미 등록된 사원 번호입니다.");
    }
    
    
  }
  
  // 해고
  public void fire(int empNo) {
    if(employees.isEmpty()) {
      throw new RuntimeException("해고할 사원이 없습니다.");
    }
    for(int i = 0, size = employees.size(); i < size; i++) {
      if(employees.get(i).getEmpNo() == empNo) {
        employees.remove(i);
        break;
      }
    }
    
  }
  //조회
  public void search(int empNo) {
    if(employees.isEmpty()) {
      throw new RuntimeException("조회할 사원이 없습니다.");
    }
    Employee searchEmployee = new Employee(empNo, null);
    for(Employee employee : employees) {
      if(employee.equals(searchEmployee)) {
        employee.info();
      }
    }
  }
  
  
  // 전체 조회
  public void searchAll() throws RuntimeException {
    if(employees.isEmpty()) {
      throw new RuntimeException("조회할 사원이 없습니다.");
    }
    for(Employee employee : employees) {
      employee.info();
      System.out.println("--------------");
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(employees);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Company other = (Company) obj;
    return Objects.equals(employees, other.employees);
  }
    
    
  
}
