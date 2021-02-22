public class Task {
    private String name;
    String comment;
    int priority;
    String status; //4


    public Task(String name, String comment, int priority, String status){
        setName(name);
        setComment(comment);
        setPriority(priority);
        setStatus(status);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String toString(){
        return "Имя задачи: " + name + " Описание задачи: " + comment + " Приоритет задачи: " + priority + " Статус задачи: " + status;
    }

}
