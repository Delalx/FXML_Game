import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class DiceRoll {

    @FXML
    Text textDice;

    @FXML
    void Dice() {
        int dice = (int)(Math.random() * 6) + 1;
        textDice.setText("" + dice);
    }
}
