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

    public void getTaskListWithPriority(int priority){
        for(int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).priority==priority){
                System.out.println(taskList.get(i).toString());
            }
        }
    }

    public  void  getTaskListWithStatus(String status){
        for(int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).status.equals(status)){
                System.out.println(taskList.get(i).toString());
            }
        }
    }
    public void searchCommentWithKeyWord(String keyWord){
        for(int i = 0;i< taskList.size();i++) {
            if (taskList.get(i).comment.contains(keyWord)) {
                System.out.println(taskList.get(i).toString());
            }
        }
    }
}
