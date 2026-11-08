
package CafeteriaSystem;

public class undoStack {
    
    private UndoAction[] stack;
    private int top;

    public undoStack() {

        stack = new UndoAction[100];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public boolean push(UndoAction action) {

        if (isFull()) {
            return false;
        }

        top++;
        stack[top] = action;

        return true;
    }

    
}
