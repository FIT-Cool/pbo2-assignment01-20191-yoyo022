package modul2;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;


public class Controller {
    public TextField txtRadius;
    public TextField txtLength;
    public TextField txtHeight;
    public TextField txtWidth;

    public double length;
    public double width;
    public double height;
    public double radius;
    public String pilihan ;
    public double luas ;
    public double keliling;
    public double luasPermukaanBall;
    public double volumeBall;
    public double luasPermukaanTube;
    public double volumeTube;


    public void squareAction(ActionEvent actionEvent) {
        txtLength.setDisable(false);
        txtWidth.setDisable(false);
        txtRadius.setDisable(true);
        txtHeight.setDisable(true);
        pilihan = "square";
    }

    public void ballAction(ActionEvent actionEvent) {
        txtLength.setDisable(true);
        txtWidth.setDisable(true);
        txtRadius.setDisable(false);
        txtHeight.setDisable(true);
        pilihan = "ball";
    }

    public void tubeAction(ActionEvent actionEvent) {
        txtLength.setDisable(true);
        txtWidth.setDisable(true);
        txtRadius.setDisable(false);
        txtHeight.setDisable(false);
        pilihan = "tube";
    }

    public void submitAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if(pilihan == "square"){
            length = Double.parseDouble(txtLength.getText()) ;
            width = Double.parseDouble(txtWidth.getText()) ;
            luas = length * width;
            keliling = 2*(length+width);
            alert.setHeaderText("Message");
            alert.setTitle("Message");
            alert.setContentText("Luas : "+ luas + "," + "Keliling : "+ keliling);
            alert.show();
            txtLength.clear();
            txtWidth.clear();
            txtLength.setDisable(true);
            txtWidth.setDisable(true);

        }
        else if (pilihan == "ball") {
            radius = Double.parseDouble(txtRadius.getText()) ;
            luasPermukaanBall = 4 * (Math.PI)*radius*radius;
            volumeBall = (4 / 3)*(Math.PI)*(radius*radius*radius);
            alert.setHeaderText("Message");
            alert.setTitle("Message");
            alert.setContentText("Luas : " + luasPermukaanBall + "," + "Volume : " + volumeBall);
            alert.show();
            txtRadius.clear();
            txtRadius.setDisable(true);
        }
        else if (pilihan == "tube"){
            radius = Double.parseDouble(txtRadius.getText()) ;
            height = Double.parseDouble(txtHeight.getText()) ;
            luasPermukaanTube = 2 * (Math.PI)*radius*(radius+height);
            volumeTube = Math.PI*radius*radius*height;
            alert.setHeaderText("Message");
            alert.setTitle("Message");
            alert.setContentText("Luas : "+ luasPermukaanTube + "," + "Volume : "+ volumeTube);
            alert.show();
            txtRadius.clear();
            txtHeight.clear();
            txtRadius.setDisable(true);
            txtHeight.setDisable(true);
        }
    }
}
