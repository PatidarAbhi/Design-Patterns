package org.example.chainOfResponsibilty;

public class QuickBooksReader extends DataReader {


    public QuickBooksReader(DataReader dataReader) {
        super(dataReader);
    }

    @Override
    protected boolean doHandle(String filePath) {
        return filePath.endsWith(".qbw");
    }

    @Override
    public void read(String filePath) {
        if (doHandle(filePath)) {
            System.out.println("Reading QuickBooks file: " + filePath);
        } else
            super.read(filePath);
    }
}
