package org.example.visitor;

public class VisitorMain {

    public static void visit()
    {
        HtmlDocument htmlDocument = new HtmlDocument();
        htmlDocument.add(new HeadingNode());
        htmlDocument.add(new AnchorNode());

        HighlightVisitor highlightVisitor = new HighlightVisitor();
        htmlDocument.accept(highlightVisitor);



    }
}
