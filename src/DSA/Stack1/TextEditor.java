package DSA.Stack1;

import java.util.Stack;

public class TextEditor {
    private StringBuilder text;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public TextEditor() {
        text = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void insertText(String newText) {
        // Save the current text to the undo stack
        undoStack.push(text.toString());

        // Append the new text to the existing text
        text.append(newText);
    }

    public void deleteText(int numCharsToDelete) {
        if (numCharsToDelete >= text.length()) {
            // Save the current text to the undo stack
            undoStack.push(text.toString());
            // Clear the text
            text.setLength(0);
        } else {
            // Save the current text to the undo stack
            undoStack.push(text.toString());

            // Delete the specified number of characters from the end of the text
            text.setLength(text.length() - numCharsToDelete);
        }
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            // Save the current text to the redo stack
            redoStack.push(text.toString());

            // Restore the previous text from the undo stack
            text = new StringBuilder(undoStack.pop());
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            // Save the current text to the undo stack
            undoStack.push(text.toString());

            // Restore the undone text from the redo stack
            text = new StringBuilder(redoStack.pop());
        }
    }

    public String getText() {
        return text.toString();
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Insert some text
        editor.insertText("Hello, ");
        editor.insertText("world!");

        // Undo the last operation
        editor.undo();

        // Redo the undone operation
        editor.redo();

        System.out.println("Final text: " + editor.getText());
    }
}
