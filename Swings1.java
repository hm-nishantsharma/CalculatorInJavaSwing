// Date: 4th January 2024
// Implementing Swing by creating a Calculator App
// Known Exceptions Handled manually using loops


//header files
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

// Using javax.swing to create a basic calculator and perform various mathematical operations.



class Calculator extends JFrame implements ActionListener {
    String inp, oup, empty;

    int num1, num2, res, oprCounter, oprAt, pminus;
    JTextField t1; //for Input String
    JLabel l1, l2;  //for displaying instructions
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;  //for creating buttons to modify input string

    Calculator() {
        num1 = 0;
        num2 = 0;
        res = 0;
        inp = "";
        oup = inp;
        empty = "";
        oprCounter = 0;
        oprAt = 0;
        pminus = 0;
        JFrame f = new JFrame();

        /*
            setLayout() method allows you to set the layout of the container,
            BorderLayout, FlowLayout, GridLayout, null Layout
         */
        GridLayout layout = new GridLayout(7, 3);
        f.setLayout(layout);

        /*
            To resize a frame, There is a method JFrame.setSize(int width, int height)
            which takes two parameters width and height.
        */
        f.setSize(1500, 1000);
        f.setBackground(Color.darkGray);


        //Components of the Calculator starts

        //Dynamic Memory Allocated using new Keyword
        t1 = new JTextField(inp);
        t1.setBackground(Color.black);
        t1.setForeground(Color.white);
        t1.setOpaque(true);
        t1.setHorizontalAlignment(SwingConstants.CENTER);
        t1.setFont(new Font("Dialog", Font.BOLD, 15));

        l1 = new JLabel("Press any button to start...");
        l1.setBackground(Color.black);
        l1.setOpaque(true);
        l1.setForeground(Color.green);
        l1.setFont(new Font("Dialog", Font.BOLD,12));
        l1.setHorizontalAlignment(SwingConstants.CENTER);


        b1 = new JButton("←");
        b1.setToolTipText("Backspace");
        b1.addActionListener(this);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setOpaque(true);
        b1.setFont(new Font("Dialog", Font.BOLD, 25));

        b2 = new JButton("1");
        b2.addActionListener(this);
        b2.setBackground(Color.darkGray);
        b2.setForeground(Color.white);
        b2.setOpaque(true);
        b2.setFont(new Font("Dialog", Font.BOLD, 20));

        b3 = new JButton("2");
        b3.addActionListener(this);
        b3.setBackground(Color.darkGray);
        b3.setForeground(Color.white);
        b3.setOpaque(true);
        b3.setFont(new Font("Dialog", Font.BOLD, 20));

        b4 = new JButton("3");
        b4.addActionListener(this);
        b4.setBackground(Color.darkGray);
        b4.setForeground(Color.white);
        b4.setOpaque(true);
        b4.setFont(new Font("Dialog", Font.BOLD, 20));

        b5 = new JButton("4");
        b5.addActionListener(this);
        b5.setBackground(Color.darkGray);
        b5.setForeground(Color.white);
        b5.setOpaque(true);
        b5.setFont(new Font("Dialog", Font.BOLD, 20));

        b6 = new JButton("5");
        b6.addActionListener(this);
        b6.setBackground(Color.darkGray);
        b6.setForeground(Color.white);
        b6.setOpaque(true);
        b6.setFont(new Font("Dialog", Font.BOLD, 20));

        b7 = new JButton("6");
        b7.addActionListener(this);
        b7.setBackground(Color.darkGray);
        b7.setForeground(Color.white);
        b7.setOpaque(true);
        b7.setFont(new Font("Dialog", Font.BOLD, 20));

        b8 = new JButton("7");
        b8.addActionListener(this);
        b8.setBackground(Color.darkGray);
        b8.setForeground(Color.white);
        b8.setOpaque(true);
        b8.setFont(new Font("Dialog", Font.BOLD, 20));

        b9 = new JButton("8");
        b9.addActionListener(this);
        b9.setBackground(Color.darkGray);
        b9.setForeground(Color.white);
        b9.setOpaque(true);
        b9.setFont(new Font("Dialog", Font.BOLD, 20));

        b10 = new JButton("9");
        b10.addActionListener(this);
        b10.setBackground(Color.darkGray);
        b10.setForeground(Color.white);
        b10.setOpaque(true);
        b10.setFont(new Font("Dialog", Font.BOLD, 20));

        b11 = new JButton("0");
        b11.addActionListener(this);
        b11.setBackground(Color.darkGray);
        b11.setForeground(Color.white);
        b11.setOpaque(true);
        b11.setFont(new Font("Dialog", Font.BOLD, 20));

        b12 = new JButton("+");
        b12.setToolTipText("Addition");
        b12.addActionListener(this);
        b12.setBackground(Color.black);
        b12.setForeground(Color.white);
        b12.setOpaque(true);
        b12.setFont(new Font("Dialog", Font.BOLD, 20));

        b13 = new JButton("-");
        b13.setToolTipText("Subtraction");
        b13.addActionListener(this);
        b13.setBackground(Color.black);
        b13.setForeground(Color.white);
        b13.setOpaque(true);
        b13.setFont(new Font("Dialog", Font.BOLD, 20));

        b14 = new JButton("x");
        b14.setToolTipText("Multiplication");
        b14.addActionListener(this);
        b14.setBackground(Color.black);
        b14.setForeground(Color.white);
        b14.setOpaque(true);
        b14.setFont(new Font("Dialog", Font.BOLD, 20));

        b15 = new JButton("/");
        b15.setToolTipText("Division");
        b15.addActionListener(this);
        b15.setBackground(Color.black);
        b15.setForeground(Color.white);
        b15.setOpaque(true);
        b15.setFont(new Font("Dialog", Font.BOLD, 20));


        b16 = new JButton("=");
        b16.setToolTipText("Check Output");
        b16.addActionListener(this);
        b16.setBackground(Color.black);
        b16.setForeground(Color.white);
        b16.setOpaque(true);
        b16.setFont(new Font("Dialog", Font.BOLD, 20));

        b17 = new JButton("+/-");
        b17.setToolTipText("To insert negative integer");
        b17.addActionListener(this);
        b17.setBackground(Color.black);
        b17.setForeground(Color.white);
        b17.setOpaque(true);
        b17.setFont(new Font("Dialog", Font.BOLD, 20));


        b18 = new JButton("Reset");
        b18.setToolTipText("Resets the input string");
        b18.addActionListener(this);
        b18.setBackground(Color.black);
        b18.setForeground(Color.white);
        b18.setOpaque(true);
        b18.setFont(new Font("Dialog", Font.BOLD, 20));

        l2 = new JLabel("Calculator App");
        l2.setBackground(Color.black);
        l2.setOpaque(true);
        l2.setForeground(Color.yellow);
        l2.setFont(new Font("Dialog", Font.BOLD, 20));
        l2.setHorizontalAlignment(SwingConstants.CENTER);


//        b19 = new JButton("Check");
//        b19.setToolTipText("Check values assigned to num1 and num2");
//        b19.addActionListener(this);
//        b19.setBackground(Color.blue);
//        b19.setForeground(Color.white);
//        b19.setOpaque(true);
//        b19.setFont(new Font("Dialog", Font.BOLD, 20));


        //Add to Frame
        f.add(t1);
        f.add(l1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
        f.add(b12);
        f.add(b11);
        f.add(b13);
        f.add(b14);
        f.add(b15);
        f.add(b16);
        f.add(b17);
        f.add(b18);
        f.add(l2);


        /*
            controls whether a Component and its children are displayed on the screen.
        */
        f.setVisible(true);
        f.setTitle("My Calculator");

        /*
            Moves and resizes this component. The new location of the top-left corner is
            specified by x and y, and the new size is specified by width and height.
            This method changes layout-related information, and therefore,
            invalidates the component hierarchy.
        */
        f.setBounds(100, 100, 600, 500);

        /*
            Enables or disables this component, depending on the value of the parameter
            b. An enabled component can respond to user input and generate events.
            Components are enabled initially by default.
        */
        f.setEnabled(true);

        /*
            To close the JFrame  by clicking on the X button. JFrame.setDefaultCloseOperations(int)
            is a method provided by JFrame class.

            Various parameters that determines the actions performed by this method:
            "0" -> JFrame will never close even after clicking on X button
            JFrame.EXIT_ON_CLOSE -> exits application and releases the used memory
            JFrame.HIDE_ON_CLOSE -> hides the JFrame. It doesn't exit the application.
            JFrame.DISPOSE_ON_CLOSE  -> turns the frame off but doesn't close the program. It also consumes memory.
            JFrame.DO_NOTHING_ON_CLOSE -> does nothing when user clicks on X button

        */
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        inp = t1.getText();
        // Backspace Button
        if (ae.getSource() == b1) {
            // inp = t1.getText();
            if (!inp.equals(empty)) {
                int size = inp.length();
                char[] c1 = inp.toCharArray();
                char[] out = new char[size - 1];
                for (int i = 0; i < size - 1; i++) {
                    out[i] = c1[i];
                }
                StringBuilder sb1 = new StringBuilder();
                for (int i = 0; i < size - 1; i++) {
                    sb1.append(out[i]);
                }
                inp = sb1.toString();
                t1.setText(inp);
                l1.setText("Backspace performed");

            } else {
                l1.setText("Can't perform this operation");
            }
        }

        // Numbers
        if (ae.getSource() == b2) {
            inp = inp + "1";
            t1.setText(inp);
            l1.setText(inp);
        }
        if (ae.getSource() == b3) {
            inp = inp + "2";
            t1.setText(inp);
            l1.setText(inp);
        }
        if (ae.getSource() == b4) {
            inp = inp + "3";
            t1.setText(inp);
            l1.setText(inp);
        }
        if (ae.getSource() == b5) {
            inp = inp + "4";
            t1.setText(inp);
            l1.setText(inp);
        }
        if (ae.getSource() == b6) {
            inp = inp + "5";
            t1.setText(inp);
            l1.setText(inp);
        }
        if (ae.getSource() == b7) {
            inp = inp + "6";
            t1.setText(inp);
            l1.setText(inp);
        }
        if (ae.getSource() == b8) {
            inp = inp + "7";
            t1.setText(inp);
            l1.setText(inp);
        }
        if (ae.getSource() == b9) {
            inp = inp + "8";
            t1.setText(inp);
            l1.setText(inp);
        }
        if (ae.getSource() == b10) {
            inp = inp + "9";
            t1.setText(inp);
            l1.setText(inp);
        }
        if (ae.getSource() == b11) {
            inp = inp + "0";
            t1.setText(inp);
            l1.setText(inp);
        }

        // Operations
        if (inp != empty) {
            if (ae.getSource() == b12) {
                if (oprCounter == 0) {
                    inp = inp + "+";
                    t1.setText(inp);
                    l1.setText(inp);
                    oprCounter++;
                }
            }
            if (ae.getSource() == b13) {
                if (oprCounter == 0) {
                    inp = inp + "-";
                    t1.setText(inp);
                    l1.setText(inp);
                    oprCounter++;
                }
            }
            if (ae.getSource() == b14) {
                if (oprCounter == 0) {
                    inp = inp + "*";
                    t1.setText(inp);
                    l1.setText(inp);
                    oprCounter++;
                }
            }
            if (ae.getSource() == b15) {
                if (oprCounter == 0) {
                    inp = inp + "/";
                    t1.setText(inp);
                    l1.setText(inp);
                    oprCounter++;
                }
            }
        } else {
            l1.setText("Can't perform this function");
        }
// Equal To Button
        if (ae.getSource() == b16) {
            String n2;
            String n1;
            if (!inp.equals(empty)) {
                inp = t1.getText();
                char[] out = inp.toCharArray();
                int size = inp.length();

                for (int i = 0; i < size; i++) {
                    if (out[i] == '+' || out[i] == '-' || out[i] == '*' || out[i] == '/') {
                        oprAt = i;//2
                    }
                }
                if (oprAt == 0) {
                    l1.setText("Error!");
                }
                char[] first = new char[oprAt];
                for (int i = 0; i < oprAt; i++) {
                    first[i] = out[i];
                }

                if (size > oprAt) {
                    char[] second = new char[size - oprAt - 1];//5-2-1=2
                    int j = 0;

                    for (int i = oprAt + 1; i < size; i++) {
                        second[j++] = out[i];
                    }
                    //n2 = Arrays.toString(second);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < second.length; i++) {
                        sb.append(second[i]);
                    }
                    n2 = sb.toString();

                    num2 = Integer.parseInt(n2);

                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < first.length; i++) {
                    sb.append(first[i]);
                }
                n1 = sb.toString();


                // n1 = Arrays.toString(first);

                num1 = Integer.parseInt(n1);

                if (out[oprAt] == '+') {
                    res = num1 + num2;
                    l1.setText("" + res);
                } else if (out[oprAt] == '-') {
                    res = num1 - num2;
                    l1.setText("" + res);
                } else if (out[oprAt] == '*') {
                    res = num1 * num2;
                    l1.setText("" + res);
                } else if (out[oprAt] == '/') {
                    if (num2 != 0) {
                        res = num1 / num2;
                        l1.setText("" + res);
                    } else {
                        l1.setText("Error: Divide by Zero(0)");
                    }
                }
                String output = Integer.toString(res);

                t1.setText(output);
                inp = output;

                oprCounter = 0;
            } else {
                l1.setText("Can't perform this operation");
            }
        }
        if (ae.getSource() == b17) {

            if (pminus == 0) {
                if (inp.charAt(0) != '-') {
                    inp = "-" + inp;
                } else {
                    oprCounter = 0;
                }
                t1.setText(inp);
                l1.setText(inp);
                pminus++;
            } else if (pminus == 1) {
                char[] original = inp.toCharArray();
                int size = original.length;
                char[] newString = new char[size - 1];
                for (int i = 1; i < size; i++) {
                    newString[i - 1] = original[i];
                }
                inp = String.valueOf(newString);
                t1.setText(inp);
                l1.setText(inp);
                pminus = 0;
            }
        }

            if (ae.getSource() == b18) {

                num1 = 0;
                num2 = 0;
                res = 0;
                inp = "";
                oup = inp;
                empty = "";
                oprCounter = 0;
                oprAt = 0;
                pminus = 0;
                t1.setText(inp);
                l1.setText("Reset Successful");

            }
            //Check Button
//        if( ae.getSource() == b19){
//
//
//            String n2 = "";
//            String n1 = "";
//            if(!inp.equals(empty)){
//                inp = t1.getText();
//                char[] out = inp.toCharArray();
//                int size = inp.length();
//
//                for(int i=0;i<size;i++){
//                    if(out[i]=='+'||out[i]=='-'||out[i]=='*'||out[i]=='/'){
//                        oprAt = i;//2
//                    }
//                }
//                if(oprAt == 0){
//                    n2 = null;
//                    n1 = null;
//                }
//                if(n1 != null){
//                char[] first = new char[oprAt];
//                for(int i=0;i<oprAt;i++){
//                    first[i] = out[i];
//                }
//                StringBuilder sb = new StringBuilder();
//                for(int i=0;i<first.length;i++){
//                    sb.append(first[i]);
//                }
//                n1 = sb.toString();
//                }
//
//                if (size > oprAt) {
//                    char[] second = new char[size - oprAt - 1];//5-2-1=2
//                    int j=0;
//
//                    for (int i = oprAt + 1; i < size; i++) {
//                        second[j++] = out[i];
//                    }
//                    //n2 = Arrays.toString(second);
//                    StringBuilder sb = new StringBuilder();
//                    for(int i=0;i<second.length;i++){
//                        sb.append(second[i]);
//                    }
//                    n2 = sb.toString();
//
//                }
//
//                if(n1!=null && n2 == null){
//                    l1.setText("Num1 : "+n1+", "+"Num2 : null");
//                }
//
//                else if(n1!=null && n2!=null){
//                    l1.setText("Num1: "+n1+", Num2: "+n2);
//                }
//                else{
//                    l1.setText("No value assigned");
//                }
//
//                }
//
//
//                // n1 = Arrays.toString(first);
//
//
//        }
        }
    }



public class Swings1 {
    public static void main(String[] args){
        new Calculator();
    }
}
