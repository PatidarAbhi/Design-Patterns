package org.example.chainOfResponsibilty;

public class MainChain {

    public static void accounting()
    {
        DataReader quickBooksReader = new QuickBooksReader(null);
        DataReader excelReader = new ExcelReader(quickBooksReader);

        String filePath1 = "data.xlsx";
        String filePath2 = "data.qbw";

       excelReader.read(filePath1);
       excelReader.read(filePath2);
    }
}
