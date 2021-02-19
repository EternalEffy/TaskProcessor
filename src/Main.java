import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    EFFY_TaskProcessor myTaskList = new EFFY_TaskProcessor();
    myTaskList.addTask("Позвонить маме","сегодня",4,"Выполняется");
    myTaskList.addTask("Позвонить маме","Обязательно сегодня",2,"На рассмотрении");
    myTaskList.addTask("Позвонить маме","Обязательно сегодня",2,"Выполняется");
    myTaskList.addTask("Позвонить маме","сегодня",1,"Выполняется");
    myTaskList.returnTaskString();
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    myTaskList.getTaskListWithPriority(4);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    myTaskList.getTaskListWithStatus("На рассмотрении");
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    myTaskList.searchCommentWithKeyWord("Обязательно");
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    myTaskList.removeTask(0);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    myTaskList.returnTaskString();
    }
}

