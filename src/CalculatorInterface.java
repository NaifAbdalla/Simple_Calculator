import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorInterface implements ActionListener {

    double num1 = 0;
    double num2 = 0;
    char operation;
    private final JFrame frame;
    private final JPanel panel1,panel2,panel3;
    private final JButton[] noButtons;
    private final JButton[] funcButtons;
    private final JButton multiplication,addition,subtraction,equality,division,decimal;

    private final JButton delete,clear;
    private final JTextField calculationBar;

    private final Font myFont = new Font(Font.SANS_SERIF,Font.BOLD,20);

    ImageIcon image;

    public CalculatorInterface() {
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
            funcButtons[i].setFocusable(false);
            funcButtons[i].setFont(myFont);
            funcButtons[i].addActionListener(this);
        }

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

       for(int i = 0; i<10;i++){
           if(e.getSource() == noButtons[i]){
               calculationBar.setText(calculationBar.getText().concat(noButtons[i].getText()));
           }
       }
       if(e.getSource() == addition){
           operation = '+';
           int length = calculationBar.getText().length();
           num1 = Double.parseDouble(calculationBar.getText().substring(0,length));
           calculationBar.setText("");
           System.out.println(num1);
       }
        else if(e.getSource() == multiplication){
           operation = '*';
            int length = calculationBar.getText().length();
            num1 = Double.parseDouble(calculationBar.getText().substring(0,length));
           calculationBar.setText("");

        }
        else if(e.getSource() == subtraction){
           operation = '-';
            int length = calculationBar.getText().length();
            num1 = Double.parseDouble(calculationBar.getText().substring(0,length));
           calculationBar.setText("");
        }
       else if(e.getSource() == division){
           operation = '/';
           int length = calculationBar.getText().length();
           num1 = Double.parseDouble(calculationBar.getText().substring(0,length));
           calculationBar.setText("");
       }
       else if(e.getSource() == equality){
           int length = calculationBar.getText().length();
           num2 = Double.parseDouble(calculationBar.getText().substring(0,length));
           switch (operation){
               case '+':
                   calculationBar.setText(String.valueOf(num1+num2));
                   break;
               case '-' :
                   calculationBar.setText(String.valueOf(num1-num2));
                   break;
               case '*':
                   calculationBar.setText(String.valueOf(num1*num2));
                   break;
               case '/':
                   calculationBar.setText(String.valueOf(num1/num2));
           }
       }
       else if(e.getSource() == decimal){
           if(!calculationBar.getText().contains("."))
           calculationBar.setText(calculationBar.getText().concat("."));
       }
       else if(e.getSource() == clear){
           calculationBar.setText("");
           num1 = 0;
           num2 = 0;
       }
       else if (e.getSource() == delete) {
       String delString = "";
       int length = calculationBar.getText().length();
           for (int i = 0; i < length - 1; i++) {
               delString+= calculationBar.getText().charAt(i);
           }
           calculationBar.setText(delString);
       }
        System.out.println("action performed");

    }
}
