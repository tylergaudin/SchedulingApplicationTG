package helper;

import javafx.scene.control.Alert;

public class helpers {

    public static void alert(String string)
    {
        Alert alert1 = new Alert(Alert.AlertType.CONFIRMATION);
        alert1.setContentText(string);
        alert1.showAndWait();
    }

    public static String lookupID()
}
