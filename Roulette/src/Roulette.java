import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Roulette extends JFrame {
    private JTextArea area_random1;
    private JTextArea area_random2;
    private JTextArea area_random3;
    private JTextArea area_result;

    private int cash = 100;

    private JTextArea CreateTextArea()
    {
        JTextArea area = new JTextArea("", 1, 2);
        area.setEditable (false);
        area.setFont(new Font("Dialog", Font.PLAIN, 10));
        area.setTabSize(10);
        return area;
    }

    public void CreateControls(){
        area_random1 = CreateTextArea();
        area_random2 = CreateTextArea();
        area_random3 = CreateTextArea();

        area_result = new JTextArea( "", 1, 3);
        area_result.setEditable (false);
        area_result.setFont(new Font("Dialog", Font.PLAIN, 10));
        area_result.setTabSize(10);

        JButton button = new JButton("Play");
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                RunRoulette();
            }
        });

        // Добавим поля в окно
        JPanel contents = new JPanel();
        contents.add(area_random1);
        contents.add(area_random2);
        contents.add(area_random3);
        contents.add(area_result);
        contents.add(button, BorderLayout.SOUTH);
        setContentPane(contents);
    }

    public Roulette() {
        super("Roulette");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 100);
        setVisible(true);

        CreateControls();
        RunRoulette();
    }

    private void RunRoulette() {
        cash -= 10;
        Spin spin = new Spin();

        String message;
        if(spin.IsVictory()) {
            cash += 50;
            message = "Win!";
        } else {
            message = "Loose!";
        }

        message += " You have " + cash + "$";

        area_random1.setText(Integer.toString(spin.getRandom1()));
        area_random2.setText(Integer.toString(spin.getRandom2()));
        area_random3.setText(Integer.toString(spin.getRandom3()));

        area_result.setText(message);
    }
}