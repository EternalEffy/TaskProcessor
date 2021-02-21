import java.util.ArrayList;

public class EFFY_TaskProcessor{
    private ArrayList <Task> taskList = new ArrayList<>();

    public boolean addTask(String name,String comment, int priority, String status) {
        if (priority>=0 && priority<5) {
            taskList.add(new Task(name, comment, priority, status));
            return true;
        }
        else return false;
    }
    public void returnTaskString() {
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println(taskList.get(i).toString());
        }
    }
    public void removeTask(int indexOfTaskInList){
        for(int i=0;i< taskList.size();i++){
            if(i==indexOfTaskInList){
                taskList.remove(i);
                break;
            }
        }
    }

    public ArrayList getTaskListWithPriority(int priority){
        ArrayList <Task> newTaskListWIthPriority = new ArrayList<>();
        for(int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).priority==priority){
                newTaskListWIthPriority.add(taskList.get(i));
            }
        }
        //Добавляю цикл который выводит новый список для наглядности
        for (int i = 0; i< newTaskListWIthPriority.size(); i++) {
            System.out.println(newTaskListWIthPriority.get(i).toString());
        }
        return newTaskListWIthPriority;
    }

    public ArrayList  getTaskListWithStatus(String status){
        ArrayList <Task> newTaskListWIthStatus = new ArrayList<>();
        for(int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).status.equals(status)){
                newTaskListWIthStatus.add(taskList.get(i));
            }
        }
        //Добавляю цикл который выводит новый список для наглядности
        for (int i = 0; i< newTaskListWIthStatus.size(); i++) {
            System.out.println(newTaskListWIthStatus.get(i).toString());
        }
        return newTaskListWIthStatus;
    }
    public ArrayList searchCommentWithKeyWord(String keyWord){
        ArrayList <Task> newTaskListWIthSKeyWord = new ArrayList<>();
        for(int i = 0;i< taskList.size();i++) {
            if (taskList.get(i).comment.contains(keyWord)) {
                newTaskListWIthSKeyWord.add(taskList.get(i));
            }
        }
        //Добавляю цикл который выводит новый список для наглядности
        for (int i = 0; i< newTaskListWIthSKeyWord.size(); i++) {
            System.out.println(newTaskListWIthSKeyWord.get(i).toString());
        }
        return newTaskListWIthSKeyWord;
    }
}
