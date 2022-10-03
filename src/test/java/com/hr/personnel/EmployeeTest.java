package com.hr.personnel;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

  private Employee employee;

  @Before
  public void setUp() throws Exception {
    employee = new Employee("chris",
        LocalDate.of(2022, 01, 3));
  }

  @Test
  public void getEmployeeInfo_should_return_name_and_hireDate() {
    // act
    String employeeInfo = employee.getEmployeeInfo();

    // assert
    Assert.assertEquals("name = chris, hireDate = 2022-01-03",
        employeeInfo);
  }


  @Test
  public void work_should_return_name_worked_string() {

    String work = employee.work();

    // option enter = static import
    assertThat(work).isEqualTo("chris worked");
  }
}