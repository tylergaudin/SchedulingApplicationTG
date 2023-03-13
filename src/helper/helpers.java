package helper;

import javafx.scene.control.Alert;
import model.Customer;
import model.Directory;
import model.User;

import java.util.Locale;

public class helpers {

    public static void alert(String string)
    {
        Alert alert1 = new Alert(Alert.AlertType.CONFIRMATION);
        alert1.setContentText(string);
        alert1.showAndWait();
    }

    public static int lookupCustId(String custName)
    {
        for (Customer customer : Directory.getAllCustomers())
        {
            if (customer.getName().toUpperCase().contains(custName.toUpperCase())){
                return customer.getId();
            }
        }
        return -1;
    }

    public static String lookupCustName(int custId)
    {
        for (Customer customer : Directory.getAllCustomers())
        {
            if (customer.getId() == custId){
                return customer.getName();
            }
        }
        return "Customer not found.";
    }

    public static int lookupUserId(String userName)
    {
        for (User user : Directory.getAllUsers())
        {
            if (user.getUserName().toUpperCase().contains(userName.toUpperCase())){
                return user.getId();
            }
        }
        return -1;
    }

    public static String lookupUserName(int userId)
    {
        for (User user : Directory.getAllUsers())
        {
            if (user.getId() == userId){
                return user.getUserName();
            }
        }
        return "Customer not found.";
    }
}
