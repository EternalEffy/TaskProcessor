import java.util.ArrayList;

public class EFFY_TaskProcessor {
    ArrayList <Task> taskList = new ArrayList<>();

    public void addTask(String name,String comment, int priority, String status){
        if(priority>=5) {
            System.out.println("Приоритет должен быть задан от 0 до 4");
            return;
        }
        taskList.add(new Task(name,comment,priority,status));
    }

    public void returnTaskString() {
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println(taskList.get(i).toString(i));
        }
    }
    public void getTaskListWithPriority(int priority){
        for(int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).priority==priority){
                System.out.println(taskList.get(i).toString(i));
            }
        }
    }

    public  void  getTaskListWithStatus(String status){
        for(int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).status.equals(status)){
                System.out.println(taskList.get(i).toString(i));
            }
        }
    }
    public void searchCommentWithKeyWord(String keyWord){
        for(int i = 0;i< taskList.size();i++){
            if (taskList.get(i).comment.contains(keyWord)){
                System.out.println(taskList.get(i).toString(i));
            }
        }
    }

    public void removeTask(int numberOfTask){
        for(int i=0;i< taskList.size();i++){
            if(i==numberOfTask) taskList.remove(i);
        }
    }

}
