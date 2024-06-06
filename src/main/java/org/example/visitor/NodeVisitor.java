package org.example.visitor;

public interface NodeVisitor {
    void visit(HeadingNode headingNode);
    void visit(AnchorNode anchorNode);
}
