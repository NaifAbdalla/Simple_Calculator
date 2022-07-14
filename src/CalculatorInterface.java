import javax.swing.*;
import java.awt.*;

public class CalculatorInterface {



    private JFrame frame;
    private JPanel panel1;
    private JPanel panel2;
    private JButton no0;
    private JButton no1;
    private JButton no2;
    private JButton no3;
    private JButton no4;
    private JButton no5;
    private JButton no6;
    private JButton no7;
    private JButton no8;
    private JButton no9;
    private JButton multiplication;
    private JButton addition;
    private JButton subtraction;
    private JButton equality;
    private  JButton division;
    private JButton decimal;
    private JTextField calculationBar;

    public CalculatorInterface(){
        frame = new JFrame("Calculator");
        frame.setLayout(new FlowLayout());
        frame.setPreferredSize(new Dimension(350,400));
        panel1 = new JPanel();
        panel2 = new JPanel(new GridLayout(4,4));

        decimal = new JButton(".");
        no0 = new JButton("0");
        no1 = new JButton("1");
        no2 = new JButton("2");
        no3 = new JButton("3");
        no4 = new JButton("4");
        no5 = new JButton("5");
        no6 = new JButton("6");
        no7 = new JButton("7");
        no8 = new JButton("8");
        no9 = new JButton("9");
        multiplication = new JButton("x");
        addition = new JButton("+");
        subtraction = new JButton("-");
        equality = new JButton("=");
        division = new JButton("/");

        panel2.add(no7);
        panel2.add(no8);
        panel2.add(no9);
        panel2.add(division);
        panel2.add(no4);
        panel2.add(no5);
        panel2.add(no6);
        panel2.add(multiplication);
        panel2.add(no1);
        panel2.add(no2);
        panel2.add(no3);
        panel2.add(subtraction);
        panel2.add(no0);
        panel2.add(decimal);
        panel2.add(addition);
        panel2.add(equality);
        panel2.setPreferredSize(new Dimension(350,300));

        calculationBar = new JTextField(33);
        calculationBar.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
        calculationBar.setPreferredSize(new Dimension(350,38));

       panel1.add(calculationBar);
       panel1.setPreferredSize(new Dimension(350,50));


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.add(panel1);
        //frame.add(calculationBar);
        frame.add(panel2);

        frame.pack();

        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new CalculatorInterface();
    }
}
