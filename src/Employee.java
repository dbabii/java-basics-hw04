public class Employee implements Payable {

  protected String employeeId;
  protected String name;
  protected double averageMonthlySalary;

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    return averageMonthlySalary;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "employeeId='" + employeeId + '\'' +
        ", name='" + name + '\'' +
        ", averageMonthlySalary=" + averageMonthlySalary +
        '}';
  }

  @Override
  public void calculatePay() {

  }
}
