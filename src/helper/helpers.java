package helper;

import javafx.scene.control.Alert;
import model.Customer;
import model.Directory;

public class helpers {

    public static void alert(String string)
    {
        Alert alert1 = new Alert(Alert.AlertType.CONFIRMATION);
        alert1.setContentText(string);
        alert1.showAndWait();
    }

    public static String lookupID(String custName)
    {
        for (Customer customer : Directory.getAllCustomers())
        {
            if (customer.custName == custName.custName){
                return customer.custId;
            }
        }
    }
}
