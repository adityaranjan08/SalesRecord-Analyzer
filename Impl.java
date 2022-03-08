import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Impl {
    public static void main(String[] args) throws FileNotFoundException {
        SalesAnalysis salesAnalysis = new SalesAnalysis();
        String filename = "sample.csv";
        List<Sale> saleRecord = salesAnalysis.readDataFromFile(filename);
        System.out.println("Press 1 for Reading data from the file \nPress 2 for Count Total Number Of Online Purchase Made \nPress 3 for Displaying Records based on Order Priority \nPress 4 for Displaying the Purchase Record of 2015 \nPress 5 for displaying items in descending Order");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();


        switch(choice){
            case 1:
                salesAnalysis.display(saleRecord);
                break;
            case 2:
                salesAnalysis.countNoOfOnlinePurchase(saleRecord);
                break;
            case 3:
                salesAnalysis.allRecordBasedOnOrderPriority(saleRecord);
                break;
            case 4:
                salesAnalysis.displayRecordHappenedInYear2015(saleRecord);
                break;
            case 5:
                salesAnalysis.displayInDescendingOrder(saleRecord);
                break;
            default:
                System.out.println("Invalid Selection");
        }
    }
}
