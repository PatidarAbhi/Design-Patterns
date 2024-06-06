package org.example.visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node) {
        nodes.add(node);
    }

    public void accept(NodeVisitor visitor) {
        for (HtmlNode node : nodes) {
            node.accept(visitor);
        }
    }
}
