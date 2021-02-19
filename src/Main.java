import java.util.ArrayList;

public class Main {

    //константы приоритета
    public static int priorityLow = 0;
    public static int priorityPreMiddle = 1;
    public static int priorityMiddle = 2;
    public static int priorityPreHight = 3;
    public static int priorityHight = 4;

    //константы статуса
    public static String isOpen = "Открыта";
    public static String isWorking ="В работе";
    public static String isInDebugging = "В отладке";
    public static String isFinish = "Выполнена";


    public static void main(String[] args) {
    EFFY_TaskProcessor myTaskList = new EFFY_TaskProcessor();

    myTaskList.addTask("Позвонить маме","сегодня",priorityHight,isOpen);
    myTaskList.addTask("Позвонить маме","Обязательно сегодня",priorityLow,isWorking);
    myTaskList.addTask("Позвонить маме","Обязательно сегодня",priorityPreMiddle,isFinish);
    myTaskList.addTask("Позвонить маме","сегодня",priorityLow,isInDebugging);
    myTaskList.addTask("Удали меня","Прямо сейчас",priorityHight,isWorking);
    myTaskList.addTask("Позвонить маме","сегодня",priorityLow,isInDebugging);

        myTaskList.returnTaskString();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        myTaskList.superFunction(1,priorityLow," "," ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        myTaskList.superFunction(2,null, isOpen," ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        myTaskList.superFunction(3,null," ","Обязательно");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        myTaskList.removeTask(4);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        myTaskList.returnTaskString();
    }
}

