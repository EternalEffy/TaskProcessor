import java.util.ArrayList;

public class Main {

    //константы приоритета



    public static void main(String[] args) {
    EFFY_TaskProcessor myTaskList = new EFFY_TaskProcessor();

    myTaskList.addTask("Позвонить маме","сегодня", Constants.priorityHight,Constants.isOpen);
    myTaskList.addTask("Позвонить маме","Обязательно сегодня",Constants.priorityLow,Constants.isWorking);
    myTaskList.addTask("Позвонить маме","Обязательно сегодня",Constants.priorityPreMiddle,Constants.isFinish);
    myTaskList.addTask("Позвонить маме","сегодня",Constants.priorityLow,Constants.isInDebugging);
    myTaskList.addTask("Удали меня","Прямо сейчас",Constants.priorityHight,Constants.isWorking);
    myTaskList.addTask("Позвонить маме","сегодня",Constants.priorityLow,Constants.isInDebugging);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        myTaskList.getTaskListWithPriority(Constants.priorityLow);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        myTaskList.getTaskListWithStatus(Constants.isOpen);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        myTaskList.searchCommentWithKeyWord("Обязательно");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        myTaskList.removeTask(4);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}

