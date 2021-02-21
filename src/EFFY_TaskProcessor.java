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


    public int removeTask(int indexTask){
        int i;
        for(i=0;i< taskList.size();i++){
            if(i==indexTask){
                taskList.remove(i);
                break;
            }
        }
        return i;
    }

    public ArrayList getTaskListWithPriority(int priority){
        ArrayList <Task> newTaskList = new ArrayList<>();
        for(int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).priority==priority){
                newTaskList.add(taskList.get(i));
            }
        }
        return newTaskList;
    }

    public ArrayList  getTaskListWithStatus(String status){
        ArrayList <Task> newTaskList = new ArrayList<>();
        for(int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).status.equals(status)){
                newTaskList.add(taskList.get(i));
            }
        }
        return newTaskList;
    }
    public ArrayList searchCommentWithKeyWord(String keyWord){
        ArrayList <Task> newTaskList = new ArrayList<>();
        for(int i = 0;i< taskList.size();i++) {
            if (taskList.get(i).comment.contains(keyWord)) {
                newTaskList.add(taskList.get(i));
            }
        }
        return newTaskList;
    }
}
