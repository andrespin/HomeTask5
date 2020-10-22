public class Employee {

      private String FIO;

      private String position;

      private String email;

      private int phone;

      private int salary;

      private int age;

      public Employee(String FIO,String position, String email,int phone ,int salary, int age)
      {
          this.FIO = FIO;
          this.position = position;
          this.email = email;
          this.phone = phone;
          this.salary = salary;
          this.age = age;
      }

      public void printEmployee()
      {
          System.out.println("ФИО: " + FIO);
          System.out.println("Должность: " + position);
          System.out.println("email: " + email);
          System.out.println("Номер телефона: " + phone);
          System.out.println("Зарплата: " + salary);
          System.out.println("Возраст: " + age);
      }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}