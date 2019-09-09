package modul1;
//@author Yosef 1772009

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;


public class Controller {
    public ImageView userimage;
    public ImageView comimage;
    public TextField winscore;
    public TextField drawscore;
    public TextField losescore;
    public Button btnpaper;
    public Button btnrock;
    public Button btnscissors;

    Random randomNumbers = new Random();
    public int hasil;
    public int win = 0;
    public int draw = 0;
    public int lose = 0;

    public void exitAction(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void papperAction(ActionEvent actionEvent) {
        userimage.setImage(new Image("modul1/gambar/kertas.jpg"));
        hasil = randomNumbers.nextInt(3);
            if (hasil == 0) {
                comimage.setImage(new Image("modul1/gambar/kertas.jpg"));
                draw += 1;
                drawscore.setText(String.valueOf(draw));
            } else if (hasil == 1) {
                comimage.setImage(new Image("modul1/gambar/batu.jpg"));
                win +=1;
                winscore.setText(String.valueOf(win));
            } else if (hasil == 2) {
                comimage.setImage(new Image("modul1/gambar/gunting.jpg"));
                lose+=1;
                losescore.setText(String.valueOf(lose));
            }
        }


    public void rockAction(ActionEvent actionEvent) {
        userimage.setImage(new Image("modul1/gambar/batu.jpg"));
        hasil = randomNumbers.nextInt(3);
            if (hasil == 0) {
                comimage.setImage(new Image("modul1/gambar/batu.jpg"));
                draw += 1;
                drawscore.setText(String.valueOf(draw));
            } else if (hasil == 1) {
                comimage.setImage(new Image("modul1/gambar/gunting.jpg"));
                win +=1;
                winscore.setText(String.valueOf(win));
            } else if (hasil == 2) {
                comimage.setImage(new Image("modul1/gambar/kertas.jpg"));
                lose+=1;
                losescore.setText(String.valueOf(lose));
            }
        }


    public void scissorsAction(ActionEvent actionEvent) {
        userimage.setImage(new Image("modul1/gambar/gunting.jpg"));
        hasil = randomNumbers.nextInt(3);
            if (hasil == 0) {
                comimage.setImage(new Image("modul1/gambar/gunting.jpg"));
                draw += 1;
                drawscore.setText(String.valueOf(draw));
            } else if (hasil == 1) {
                comimage.setImage(new Image("modul1/gambar/kertas.jpg"));
                win +=1;
                winscore.setText(String.valueOf(win));
            } else if (hasil == 2) {
                comimage.setImage(new Image("modul1/gambar/batu.jpg"));
                lose+=1;
                losescore.setText(String.valueOf(lose));
            }
        }
}
