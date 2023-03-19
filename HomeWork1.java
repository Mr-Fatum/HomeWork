import java.awt.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;

public class HomeWork1 {

//    Правила выполнения домашнего задания:
//     <p>
//     1. Вся работа выполняется в файле домашнего задания
//     Если вас просят создать класс - его надо создать вложенным, т.е. внутри класса HomeWorkN
//     вы создаете класс MyClass {} (все в одном файле)
//     2. Задание считается выполненным если все тесты пройдены.
//     Тест выполнен если напротив него находится знак ✅
//     3. Что бы запустить тесты нажмите значок запуска кода напротив метода main.
//     ‼️ВАЖНО‼️ Вся работа в модуле ведется на JDK-17, перед запуском скачайте его и установите
//     правильный JDK и уровень языка в Settings -> Project Structure


    //     Домашнее задание #1:
//     У всех полей выставить модификатор доступа private
//     Реализовать класс «Student»
//     Поля класса - name:String, grade:Integer (+конструктор, +геттеры)
//     Метод announce - String announce() {} - возвращает строку в формате "/name/ учится в /grade/ классе"
//     Реализовать класс «Teacher»
//     Поля класса - name:String, students:Student[30] (+конструктор из name, +геттеры)
//     Метод - void addStudent(Student student) {} - добавляет студента в массив студентов,
//     если количество студентов достигло максимального количества, ничего не делать
//     Метод - String[] rollCall() {} - возвращает массив строк из результатов вызова метода
//     announce всех студентов преподавателя
    private static class Student {
        private String studentName;
        private int grade;

        public Student() {
            this.studentName = studentName;

        }

        String getName() {
            this.studentName = studentName;
            return STUDENT_NAME;
        }

        public int getGrade() {
            this.grade = grade;
            return STUDENT_GRADE;
        }

        String announce() {
            return STUDENT_NAME + " учится в " + STUDENT_GRADE + " классе";
        }
    }

    private static class Teacher {
        private String teacherName;
        private final List students = new List();
        private java.lang.String[][] String;

        public Teacher(String teacherName) {
            this.teacherName = teacherName;
        }

        public String getName() {
            this.teacherName = teacherName;
            return TEACHER_NAME;
        }

        public Student[] getStudents() {
            return new Student[30];
        }


        public String[] rollCall() {
            Object[] myStudents = Arrays.stream(new List[]{students}).toArray();
            return (java.lang.String[]) myStudents[0];
        }

        public Object[] addStudent(Student student) {
            students.add(java.lang.String.valueOf(student));
            Object[] myStudents = Arrays.stream(new List[]{students}).toArray();
            return myStudents;
        }
    }

    /**
     * Это метод main - нажми play что бы запустить тесты
     * Ничего не меняй в тестах, они уже написаны так что бы проверить твое решение
     * Некоторые методы в тесте подсвечены красным, это значит что компилятор не может их найти
     * и тебе необходимо их реализовать, пока ты это не сделаешь, тесты не запустятся
     */
    public static void main(String[] args) {

        var student = new Student();
        print("Student: Студент создался", true);
        print("Student: Геттер имени", Objects.equals(student.getName(), STUDENT_NAME));
        print("Student: Геттер класса", Objects.equals(student.getGrade(), STUDENT_GRADE));
        print("Student: announce содержит имя", student.announce().contains(STUDENT_NAME));
        print("Student: announce содержит класс", student.announce().contains(STUDENT_GRADE.toString()));

        var teacher = new Teacher(TEACHER_NAME);
        print("Teacher: Учитель создался", true);
        print("Teacher: Геттер имени", teacher.getName() == TEACHER_NAME);
        print("Teacher: Геттер студентов", teacher.getStudents() != null);
        print("Teacher: Массив учеников должен быть размером 30", teacher.getStudents().length == 30);

        teacher.addStudent(student);
        print("Teacher: Студент сохранился в массив", teacher.getStudents()[0] == student);
        String[] calls = teacher.rollCall();
        print("Teacher: Массив rollCall состоит из одного элемента", calls.length == 1);
        print("Teacher: В строке содержится имя студента", calls[0].contains(STUDENT_NAME));
    }

    /* Техническая секция - сюда писать ничего не надо */

    private static void print(String condition, Boolean act) {
        Function<String, String> yellow = str -> "\u001B[33m" + str + "\u001B[0m";
        System.out.print("TEST CASE " + yellow.apply(constLen(condition, 55)));
        if (act) System.out.print("✅");
        else System.out.print("❌");
        System.out.println();
    }

    private static String constLen(String str, int len) {
        StringBuilder sb = new StringBuilder(str);
        while (len-- - str.length() > 0) sb.append(" ");
        return sb.toString();
    }

    private final static String STUDENT_NAME = "NameStudent";
    private final static String TEACHER_NAME = "NameStudent";
    private final static Integer STUDENT_GRADE = 1;


}
