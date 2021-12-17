import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TodoListTest {

    ToDoList toDoList = new ToDoList();

    @BeforeAll
    public static void addTasks(){
        ToDoList toDoList = new ToDoList();
        toDoList.setMyNotes("presentation", true);
        toDoList.setMyNotes("send emails", true);
        toDoList.setMyNotes("monthly report", false);
    }


    @Nested
    public class TestAddListFunction {

        @Test
        public void addTasksToDoList() {
           String actualTask = toDoList.checkMyNotes("presentation");
            assertEquals("presentation",actualTask);

        }
    }


    @Nested
    public class TestRemoveListFunction{

        @Test
        public void removeTasksFromToDoList(){
           boolean actualTask=toDoList.removeFromMyNotes("send emails");
           assertEquals(true,actualTask);
        }
    }

    @Nested
    public class TestToUnRemoveListFunction{

        @Test
        public void unRemoveTasksFromToDoList(){
            boolean actualTask=toDoList.unRemoveFromMyNotes("send emails");
            assertEquals(true,actualTask);

        }
    }

    @Nested
    public class TestToToggleInTheListFunction{

            @Test
            public void checkIfTaskIsCompleted() {
                boolean actualList = toDoList.completedOrNotCompleted("presentation");
                assertEquals(true, actualList);
            }

        @Test
        public void checkIfSecondTaskIsCompleted() {
            boolean actualList = toDoList.completedOrNotCompleted("send emails");
            assertEquals(true, actualList);
        }

            @Test
            public void checkIfTaskIsNotCompleted() {
                boolean actualList = toDoList.completedOrNotCompleted("monthly report");
                assertEquals(false, actualList);
            }
        }
    }











//        1. As a note keeper I want to add items to my todo list.
//        2. As a note keeper I want to remove items from my todo list.
//        3. As a note keeper, I want to be able to bring back the removed items. (un remove)
//        4. As a note keeper, I want to toggle between completed and not completed.
//