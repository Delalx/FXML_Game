import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class RockPaperScissors {
    @FXML
    Text text;

    @FXML
    Button rock;

    @FXML
    Button paper;

    @FXML
    Button scissors;

    @FXML
    ImageView imageViewPlayer;

    @FXML
    ImageView imageViewComputer;

    @FXML
    void Rockpaperscissors() {
        EventHandler<ActionEvent> Rock = actionEvent1 -> {
            Image rock = new Image("Images/Rock.png");
            Image paper = new Image("Images/Paper.png");
            Image scissors = new Image("Images/Scissors.png");
            imageViewPlayer.setImage(rock);

            int computer = (int)(Math.random() * 3) + 1;
            if (computer == 1) {
                imageViewComputer.setImage(rock);
                text.setText("It's a draw");
            }
            if (computer == 2) {
                imageViewComputer.setImage(paper);
                text.setText("YOU LOSE!");
            }
            if (computer == 3) {
                imageViewComputer.setImage(scissors);
                text.setText("YOU WIN!");
            }
        };
        EventHandler<ActionEvent> Paper = actionEvent1 -> {
            Image rock = new Image("Images/Rock.png");
            Image paper = new Image("Images/Paper.png");
            Image scissors = new Image("Images/Scissors.png");
            imageViewPlayer.setImage(paper);

            int computer = (int)(Math.random() * 3) + 1;
            if (computer == 1) {
                imageViewComputer.setImage(rock);
                text.setText("YOU WIN!");

            }
            if (computer == 2) {
                imageViewComputer.setImage(paper);
                text.setText("It's a draw");
            }
            if (computer == 3) {
                imageViewComputer.setImage(scissors);
                text.setText("YOU LOSE!");
            }
        };
        EventHandler<ActionEvent> Scissors = actionEvent1 -> {
            Image rock = new Image("Images/Rock.png");
            Image paper = new Image("Images/Paper.png");
            Image scissors = new Image("Images/Scissors.png");
            imageViewPlayer.setImage(scissors);

            int computer = (int)(Math.random() * 3) + 1;
            if (computer == 1) {
                imageViewComputer.setImage(rock);
                text.setText("YOU LOSE!");
            }
            if (computer == 2) {
                imageViewComputer.setImage(paper);
                text.setText("YOU WIN!");
            }
            if (computer == 3) {
                imageViewComputer.setImage(scissors);
                text.setText("It's a draw");
            }
        };

        rock.setOnAction(Rock);
        paper.setOnAction(Paper);
        scissors.setOnAction(Scissors);
    }
}
