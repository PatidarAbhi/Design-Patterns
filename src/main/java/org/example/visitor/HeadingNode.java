package org.example.visitor;

public class HeadingNode implements  HtmlNode{

    @Override
    public void accept(NodeVisitor nodeVisitor) {
      nodeVisitor.visit(this);
    }
}
