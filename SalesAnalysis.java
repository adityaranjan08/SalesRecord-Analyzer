import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class SalesAnalysis {
    public SalesAnalysis() {

    }

    List<Sale> saleRecord = new ArrayList<>();


    public List<Sale> readDataFromFile(String filename) throws FileNotFoundException {
        try {
            FileReader filereader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(filereader);
            String line = "";
            String headingLine = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                saleRecord.add(new Sale(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], Float.parseFloat(arr[6])));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return saleRecord;

    }

    public void display(List<Sale> saleRecord) {
        saleRecord.stream().forEach(s -> System.out.println(s));
    }

    public void countNoOfOnlinePurchase(List<Sale> saleRecord) {
        int count = 0;
        double totalPrice = 0;

        for (Sale online : saleRecord) {
            if (online.salesChannel.equalsIgnoreCase("online")) {
                count += 1;
                totalPrice = totalPrice + online.unitPrice;
            }
        }
        System.out.println("Total No. Of Online Purchase: ");
        System.out.println(count);
        System.out.println("Total Price of Online Purchase: ");
        System.out.println(totalPrice);

    }

    public void allRecordBasedOnOrderPriority(List<Sale> saleRecord) {
        System.out.println("Record Based On Order Priority");
        saleRecord.stream().sorted((p1, p2) -> p1.getOrderPriority().compareTo(p2.orderPriority)).forEach(s -> System.out.println(s));
    }

    public void displayRecordHappenedInYear2015(List<Sale> saleRecord) {
        System.out.println("All Purchase Happened in Year 2015");
        saleRecord.stream().filter(p->p.orderDate.substring(5,9).equals("2015")).forEach(s->System.out.println(s));
        // saleRecord.stream().filter(p -> p.getOrderDate().substring(5, 9).equalsIgnoreCase("2015")).forEach(s -> System.out.println(s));
    }

    public void displayInDescendingOrder(List<Sale> saleRecord) {
        System.out.println("display In Descending Order");
        saleRecord.stream().filter(p->p.getItemType().equals(p.itemType)).sorted((p1,p2)->p2.getItemType().compareTo(p1.getItemType())).collect(Collectors.toList()).forEach(s->System.out.println(s));
    }
}
