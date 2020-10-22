import java.util.ArrayList;

public class main {


    /*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
консоль.
4. Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "i vivan@mailbox.com" , "892312312",
30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
     */
    
    public static void main(String[] args) {
        // для хранения объектов сотрудников нужно создать
        // динамический список, но т.к. его ещё по курсу не проходили,
        // то воспользуемся обычным массивом.
        Employee eList [] = new Employee[100];
        ArrayList<Employee> list = new ArrayList<Employee>();
        Employee e1 = new Employee("Иванов Иван Иваныч", "Сантехник", "santechnik@gmail.com", 2242, 40000, 51);
        list.add(e1);
        Employee e2 = new Employee("Иванов Севан Иваныч", "Тракторист", "traktorep@gmail.com", 1244, 40000, 31);
        list.add(e2);
        Employee e3 = new Employee("Иванов Ибрагим Иваныч", "Дворник", "dvornik@gmail.com", 2247, 20000, 63);
        list.add(e3);
        Employee e4 = new Employee("Иванов Алишер Иваныч", "Трубоукладчик", "shelitekut@gmail.com", 1240, 80000, 43);
        list.add(e4);
        Employee e5 = new Employee("Иванов Сергей Иваныч", "Охранник", "ohrannik@gmail.com", 2210, 60000, 27);
        list.add(e5);
        eList [0] = e1;
        eList [1] = e2;
        eList [2] = e3;
        eList [3] = e4;
        eList [4] = e5;
        AgeInfo(40, eList);
    }

    private static void AgeInfo(int age, Employee eList [])
    {
        System.out.println("Данные сотрудников старше " + age + " лет : " + "\n");

        for (int i = 0; i <eList.length; i++ )
        {
            if (eList[i] != null)
            {
                if (eList[i].getAge() > age)
                {
                    eList[i].printEmployee();
                }
            }
            else
                {

                 //   System.out.println("Цикл окончен");
                    break;
                }
            System.out.println();
        }

    }

}
