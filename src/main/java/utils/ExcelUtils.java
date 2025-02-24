package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {
    private static final String FILE_PATH = "src/test/resources/TestData.xlsx";

    public static String getCellData(String sheetName, int rowNum, int colNum) {
        try (FileInputStream file = new FileInputStream(FILE_PATH);
             Workbook workbook = new XSSFWorkbook(file)) {
            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(rowNum);
            Cell cell = row.getCell(colNum);
            return cell.getStringCellValue();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
