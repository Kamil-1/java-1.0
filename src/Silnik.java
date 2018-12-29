import javax.swing.*;
import java.awt.*;

public class Silnik {

    public static void main(String[] args){

        String[] pozycjeWstazkiComboBox = {"Element 1", "Element 2"};           // Stworzenie elementów wstążki

        JFrame okno = new JFrame();
        okno.setTitle("Okno testowe");
        okno.setSize(900,900);
        okno.setLayout(new BorderLayout());                                     // Podzielenie układu okna na regiony: NORTH, SOUTH, WEST, EAST, CENTER
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JComboBox wstazkaComboBox = new JComboBox(pozycjeWstazkiComboBox);      // Stworzenie wstążki
        JButton zatwierdzJButt = new JButton("Połącz");                    // Stworzenie przycisku
        JPanel goraJPanel = new JPanel();                                       // Stworzenie górnego panelu


        goraJPanel.add(wstazkaComboBox);                                        // Dodanie do górnego panelu wstążki
        goraJPanel.add(zatwierdzJButt);                                         // Dodanie do górnego panelu przycisku


        okno.add(goraJPanel, BorderLayout.NORTH);                               // Dodanie górnego panelu do okna

        /*-------------------------------------------------------------------------------------------------------------------------------------------*/

        okno.setVisible(true);
    }
}
