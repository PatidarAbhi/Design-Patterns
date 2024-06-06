package org.example.visitor;

public class AnchorNode implements HtmlNode{
    @Override
    public void accept(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }
}
