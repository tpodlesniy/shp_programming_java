import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Roulette extends JFrame {
    public Roulette() {
        super("Roulette");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        int min = 1;
        int max = 4;
        int count = 0;
        int a = (int) ( Math.random() * (max - min) + min);
        String astr = Integer.toString(a);
        int b = (int) ( Math.random() * (max - min) + min);
        String bstr = Integer.toString(b);
        int c = (int) ( Math.random() * (max - min) + min);
        if(a==b && a==c && b==c){
            count+=100;
        }
        String cstr = Integer.toString(c);
        String countstr = Integer.toString(count);
        String d = "your winnings: ";
        String winnings = d + countstr;

        // Cоздание многострочных полей
        JTextArea area1 = new JTextArea(astr, 1, 2);
        area1.setEditable (false);
        // Шрифт и табуляция
        area1.setFont(new Font("Dialog", Font.PLAIN, 10));
        area1.setTabSize(10);

        JTextArea area2 = new JTextArea(bstr, 1, 2);
        area2.setEditable (false);
        // Шрифт и табуляция
        area2.setFont(new Font("Dialog", Font.PLAIN, 10));
        area2.setTabSize(10);

        JTextArea area3 = new JTextArea(cstr, 1, 2);
        area3.setEditable (false);
        // Шрифт и табуляция
        area3.setFont(new Font("Dialog", Font.PLAIN, 10));
        area3.setTabSize(10);

        JTextArea area4 = new JTextArea("WIN!", 1, 3);
        area4.setEditable (false);
        // Шрифт и табуляция
        area4.setFont(new Font("Dialog", Font.PLAIN, 10));
        area4.setTabSize(10);

        JTextArea area5 = new JTextArea(winnings, 1, 11);
        area5.setEditable (false);
        // Шрифт и табуляция
        area5.setFont(new Font("Dialog", Font.PLAIN, 10));
        area5.setTabSize(10);

        JTextArea area6 = new JTextArea("LOUSE!", 1, 5);
        area6.setEditable (false);
        // Шрифт и табуляция
        area6.setFont(new Font("Dialog", Font.PLAIN, 10));
        area6.setTabSize(10);


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
        contents.add(new JScrollPane(area1));
        contents.add(new JScrollPane(area2));
        contents.add(new JScrollPane(area3));
        if(a==b && a==c && b==c){
            contents.add(new JScrollPane(area4));
            contents.add(new JScrollPane(area5));
        }
        else{
            contents.add(new JScrollPane(area6));
        }
        contents.add(button, BorderLayout.SOUTH);
        setContentPane(contents);
        // Выводим окно на экран
        setSize(400, 100);
        setVisible(true);
    }

    private void RunRoulette() {

    }
}