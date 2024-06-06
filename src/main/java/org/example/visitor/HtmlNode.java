package org.example.visitor;

public interface HtmlNode {
    void accept(NodeVisitor nodeVisitor);
}
