import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;

public class EFFY_TaskProcessor{

    private ArrayList<Task> taskList;

    public EFFY_TaskProcessor() {
        ArrayList<Task> taskList = new ArrayList<>();
        this.taskList = taskList;
    }

    public boolean addTask(String name,String comment, int priority, String status) {
        if (priority>=0 && priority<5) {
            taskList.add(new Task(name, comment, priority, status));
            return true;
        }
        else return false;
    }


    public int removeTask(int indexTask){
        taskList.remove(indexTask);
            return indexTask;
    }

    public ArrayList getTaskListWithPriority(int priority){
        ArrayList <Task> newTaskList = new ArrayList<>();
        for(int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).getPriority()==priority){
                newTaskList.add(taskList.get(i));
            }
        }
        return newTaskList;
    }

    public ArrayList  getTaskListWithStatus(String status){
        ArrayList <Task> newTaskList = new ArrayList<>();
        for(int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).getStatus().equals(status)){
                newTaskList.add(taskList.get(i));
            }
        }
        return newTaskList;
    }
    public ArrayList searchCommentWithKeyWord(String keyWord){
        ArrayList <Task> newTaskList = new ArrayList<>();
        for(int i = 0;i< taskList.size();i++) {
            if (taskList.get(i).getComment().contains(keyWord)) {
                newTaskList.add(taskList.get(i));
            }
        }
        return newTaskList;
    }
}
