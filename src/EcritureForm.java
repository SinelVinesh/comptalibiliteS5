import javax.swing.*;

public class EcritureForm extends JPanel {
    public EcritureForm() {
        // title
        JLabel title = new JLabel("Ajouter une écriture");
        // chose an exercice
        JLabel exerciceLabel = new JLabel("Choisir un exercice");
        String[] exercices = {"2019", "2020", "2021"};
        JComboBox<String> exercice = new JComboBox<>(exercices);
        // chose a journal
        String[] journals = {"RAN", "BQBOA", "BQBNI"};
        String[] months = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"};
        JLabel journalLabel = new JLabel("Choisir un journal");
        JComboBox<String> journal = new JComboBox<>(journals);
        JLabel monthLabel = new JLabel("Choisir un mois");
        JComboBox<String> month = new JComboBox<>(months);

        // ecriture main part

    }
}
