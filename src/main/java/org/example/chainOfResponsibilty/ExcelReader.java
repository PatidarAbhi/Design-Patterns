package org.example.chainOfResponsibilty;

public class ExcelReader extends DataReader {
    public ExcelReader(DataReader dataReader) {
        super(dataReader);
    }

    @Override
    protected boolean doHandle(String filePath) {
        return filePath.endsWith(".xlsx");
    }

    @Override
    public void read(String filePath) {
        if (doHandle(filePath)) {
            System.out.println("Reading excel file " + filePath);
        }
        else
            super.read(filePath);
    }
}
