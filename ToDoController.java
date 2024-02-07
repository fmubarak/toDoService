import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/todos")
public class TodoController {
    private List<TodoItem> items;

    public TodoController() {
        items = new ArrayList<>();
        items.add(new TodoItem(1, "Do the Coding Challenge", true));
        items.add(new TodoItem(2, "Review the code with Alison", false));
        items.add(new TodoItem(3, "Get hired", false));
        items.add(new TodoItem(4, "Start working with ASRC", false));
    }

    @GetMapping
    public List<TodoItem> getTodoItems() {
        return items;
    }
    @DeleteMapping("/{id}")
    public void deleteTodoItem(@PathVariable int id) {
        items.removeIf(item -> item.getId() == id);
    }
}