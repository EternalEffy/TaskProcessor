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
    public String returnTaskString() {
        String taskListString = null;
        for (int i = 0; i < taskList.size(); i++) {
            taskListString +=taskList.get(i).toString();
        }
        return taskListString;
    }


    public int removeTask(int indexOfTaskInList){
        int index = 0;
        for(int i=0;i< taskList.size();i++){
            if(i==indexOfTaskInList){
                taskList.remove(i);
                index=i;
                break;
            }
        }
        return index;
    }

    public ArrayList getTaskListWithPriority(int priority){
        ArrayList <Task> newTaskListWIthPriority = new ArrayList<>();
        for(int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).priority==priority){
                newTaskListWIthPriority.add(taskList.get(i));
            }
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
        return newTaskListWIthStatus;
    }
    public ArrayList searchCommentWithKeyWord(String keyWord){
        ArrayList <Task> newTaskListWIthSKeyWord = new ArrayList<>();
        for(int i = 0;i< taskList.size();i++) {
            if (taskList.get(i).comment.contains(keyWord)) {
                newTaskListWIthSKeyWord.add(taskList.get(i));
            }
        }
        return newTaskListWIthSKeyWord;
    }
}
