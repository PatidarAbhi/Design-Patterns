package org.example.memento;

public class MementoMain {

    public  static  void performMementoOperations()
    {
        Editor editor =new Editor();
        History history =new History();
        editor.setContent("Abhishek");
        history.save(editor);
        System.out.println(editor.getContent());

        editor.setContent("Kartik");
        history.save(editor);
        System.out.println(editor.getContent());

        editor.setContent("Sarang");
        System.out.println(editor.getContent());

        history.undo(editor);
        System.out.println(editor.getContent());

        history.undo(editor);
        System.out.println(editor.getContent());


    }
}
