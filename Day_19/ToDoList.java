import java.util.ArrayList;
public class ToDoList {

    static ArrayList<String> myNotes = new ArrayList<>();
    static ArrayList<String> temporaryNotes = new ArrayList<>();
    static ArrayList<String> todoListCompleted= new ArrayList<>();
    static ArrayList<String> todoListNotCompleted= new ArrayList<>();


    public void setMyNotes(String task, boolean completedOrNotCompleted) {
        if (completedOrNotCompleted) {
            todoListCompleted.add(task);
            myNotes.addAll(todoListCompleted);
        } else {
            todoListNotCompleted.add(task);
            myNotes.addAll(todoListNotCompleted);
        }

    }

    public String checkMyNotes(String task) {
            String existingTask = null;
            for (String notes : myNotes) {
                if (notes.equals(task)){
                    existingTask = task;
                    break;
                }
            }
            return existingTask;
        }

    public boolean removeFromMyNotes(String task){
        return myNotes.removeIf(notes-> notes.equals(task));
    }

    public boolean unRemoveFromMyNotes(String task) {
        boolean item = false;
        temporaryNotes.add(task);
        myNotes.removeIf(notes -> notes.equals(task));
        myNotes.addAll(temporaryNotes);
        if (myNotes.contains(task)) {
            item = true;
        }
        return item;
    }


    public boolean completedOrNotCompleted(String completedOrNotCompletedList) {
        boolean task = false;
        for (String notes : todoListCompleted) {
            if (notes.equals(completedOrNotCompletedList)) {
                task = true;
                break;
            }
        }
        for (String notes : todoListNotCompleted) {
            if (notes.equals(completedOrNotCompletedList)) {
                task = false;
                break;
            }

        }
        return task;
    }

}