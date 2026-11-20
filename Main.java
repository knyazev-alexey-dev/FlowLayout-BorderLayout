import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Демонстрация менеджеров компоновки");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout(8, 8)); // Менеджер JFrame
            frame.add(new JLabel("JFrame использует BorderLayout", SwingConstants.CENTER), BorderLayout.NORTH);

            JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 12, 20)); // Менеджер JPanel
            panel.setBorder(BorderFactory.createTitledBorder("JPanel использует FlowLayout"));
            panel.add(new JButton("Первая кнопка"));
            panel.add(new JButton("Вторая кнопка"));
            panel.add(new JLabel("Элементы располагаются по потоку"));
            frame.add(panel, BorderLayout.CENTER);
            frame.add(new JLabel("Измените размер окна", SwingConstants.CENTER), BorderLayout.SOUTH);
            frame.setSize(600, 260);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
