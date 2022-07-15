import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorInterface implements ActionListener {

    private final JFrame frame;
    private final JPanel panel1,panel2,panel3;
    private final JButton[] noButtons;

//    Replaced by using Array
//    private JButton no0;
//    private JButton no1;
//    private JButton no2;
//    private JButton no3;
//    private JButton no4;
//    private JButton no5;
//    private JButton no6;
//    private JButton no7;
//    private JButton no8;
//    private JButton no9;

    private final JButton[] funcButtons;
    private final JButton multiplication,addition,subtraction,equality,division,decimal;

    private final JButton delete,clear;
    private final JTextField calculationBar;

    private final Font myFont = new Font(Font.SANS_SERIF,Font.BOLD,20);

    ImageIcon image;

    public CalculatorInterface(){
        image = new ImageIcon("Image/calculator.png");
        frame = new JFrame("Calculator");
        frame.setLayout(new FlowLayout());
        frame.setPreferredSize(new Dimension(375,450));
        frame.setIconImage(image.getImage());

        panel1 = new JPanel();
        panel2 = new JPanel(new GridLayout(4,4));
        panel3 = new JPanel(new GridLayout(1,2));

        noButtons = new JButton[10];

        for (int i = 0; i<10;i++) {

            noButtons[i] = new JButton(String.valueOf(i));
            noButtons[i].setFont(myFont);
            noButtons[i].setFocusable(false);
            noButtons[i].addActionListener(this);
        }

//        Redundant code eliminated by using Array and for loop
//        no0 = new JButton("0");
//        no1 = new JButton("1");
//        no2 = new JButton("2");
//        no3 = new JButton("3");
//        no4 = new JButton("4");
//        no5 = new JButton("5");
//        no6 = new JButton("6");
//        no7 = new JButton("7");
//        no8 = new JButton("8");
//        no9 = new JButton("9");

        decimal = new JButton(".");
        multiplication = new JButton("x");
        addition = new JButton("+");
        subtraction = new JButton("-");
        equality = new JButton("=");
        division = new JButton("/");

        delete = new JButton("Delete");
        clear = new JButton("Clear");

        delete.setPreferredSize(new Dimension(175,30));
        clear.setPreferredSize(new Dimension(175,30));

        funcButtons = new JButton[8];

        funcButtons[0]= decimal;
        funcButtons[1]= multiplication;
        funcButtons[2]= addition;
        funcButtons[3]= subtraction;
        funcButtons[4]= equality;
        funcButtons[5]= division;
        funcButtons[6]= delete;
        funcButtons[7]= clear;

        for(int i = 0; i < 8;i++){
            funcButtons[i].addActionListener(this);
            funcButtons[i].setFocusable(false);
            funcButtons[i].setFont(myFont);
        }
//        delete.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
//        clear.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));

//        delete.setFocusable(false);
//        clear.setFocusable(false);
//
//        delete.addActionListener(this);
//        clear.addActionListener(this);

//        multiplication.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
//        subtraction.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
//        equality.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
//        division.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
//        decimal.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
//        addition.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));

//        multiplication.addActionListener(this);
//        subtraction.addActionListener(this);
//        equality.addActionListener(this);
//        division.addActionListener(this);
//        decimal.addActionListener(this);
//        addition.addActionListener(this);
//
//        multiplication.setFocusable(false);
//        subtraction.setFocusable(false);
//        equality.setFocusable(false);
//        division.setFocusable(false);
//        decimal.setFocusable(false);
//        addition.setFocusable(false);

//        Redundant code eliminated by using Array and for loop
//        no0.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
//        no1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
//        no2.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
//        no3.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
//        no4.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
//        no5.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
//        no6.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
//        no7.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
//        no9.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
//        no8.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));


        panel2.add(noButtons[7]);
        panel2.add(noButtons[8]);
        panel2.add(noButtons[9]);
        panel2.add(division);
        panel2.add(noButtons[4]);
        panel2.add(noButtons[5]);
        panel2.add(noButtons[6]);
        panel2.add(multiplication);
        panel2.add(noButtons[1]);
        panel2.add(noButtons[2]);
        panel2.add(noButtons[3]);
        panel2.add(subtraction);
        panel2.add(noButtons[0]);
        panel2.add(decimal);
        panel2.add(addition);
        panel2.add(equality);
        panel2.setPreferredSize(new Dimension(350,300));

        calculationBar = new JTextField(17);
        calculationBar.setFont(myFont);
        calculationBar.setEditable(false);

       panel1.add(calculationBar);
       panel1.setPreferredSize(new Dimension(350,50));

       panel3.add(clear);
       panel3.add(delete);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel1);
        frame.add(panel3);
        frame.add(panel2);

        frame.pack();

        frame.setResizable(false);

        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new CalculatorInterface();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
