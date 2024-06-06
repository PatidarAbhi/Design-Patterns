package org.example.chainOfResponsibilty;

public abstract class DataReader {
    protected DataReader nextReader;

    public DataReader(DataReader dataReader) {
        this.nextReader = dataReader;
    }

    public void read(String filePath) {
        if (nextReader != null) {
            nextReader.read(filePath);
        }
    }

    protected abstract boolean doHandle(String filePath);
}
