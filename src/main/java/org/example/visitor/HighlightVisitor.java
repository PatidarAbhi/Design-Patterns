package org.example.visitor;

public class HighlightVisitor implements  NodeVisitor{
    @Override
    public void visit(HeadingNode headingNode) {
        System.out.println("heading node is highlight");
    }

    @Override
    public void visit(AnchorNode anchorNode) {
        System.out.println("anchor node is highlight");
    }
}
