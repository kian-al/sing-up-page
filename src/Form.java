import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form implements ActionListener {
    JFrame form;
    JTextField fullname;
    JTextField firstaddres;
    JTextField secendaddres;
    JTextField age;
    JTextField height;
    JTextField weight;
    JButton singup;
    int Age;
    int Height;
    Double Weight;


    public Form() {
    }

    public void setupformsingup() {
        form = new JFrame("Singup Form");
        form.setSize(400, 600);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setResizable(false);
        form.setLayout(null);
        form.setVisible(true);
    }

    public void createtextfild() {
        fullname = new JTextField("please enter your fullname");
        fullname.setBounds(55, 40, 280, 40);
        form.add(fullname);
        firstaddres = new JTextField("please enter the first addres");
        firstaddres.setBounds(55, 110, 280, 40);
        form.add(firstaddres);
        secendaddres = new JTextField("please enter the secend addres");
        secendaddres.setBounds(55, 180, 280, 40);
        form.add(secendaddres);
        age = new JTextField("please enter your age");
        age.setBounds(55, 250, 280, 40);
        form.add(age);
        height = new JTextField("please enter your height");
        height.setBounds(55, 320, 280, 40);
        form.add(height);
        weight = new JTextField("please enter your weight");
        weight.setBounds(55, 390, 280, 40);
        form.add(weight);
        fullname.addActionListener(this);
        firstaddres.addActionListener(this);
        secendaddres.addActionListener(this);
        age.addActionListener(this);
        height.addActionListener(this);
        weight.addActionListener(this);

    }

    public void createbutton() {
        singup = new JButton("ثبت نام");
        singup.setBounds(120, 450, 150, 50);
        form.add(singup);
        singup.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        boolean result = false;
        if (actionEvent.getSource() == singup) {
            if (fullname.getText().length() > 3) {
                if (!firstaddres.getText().equals(secendaddres.getText())) {
                    try {
                        Age = Integer.parseInt(age.getText());
                        if (Age > 18) {
                            Height = Integer.parseInt(height.getText());
                            if (Height > 100) {
                                Weight = Double.parseDouble(weight.getText());
                                if (Weight > 40.0) {
                                    result = true;
                                }
                            }
                        }
                    } catch (NumberFormatException e) {
                        result = false;
                    }
                }
            }

            if (actionEvent.getSource() == singup) {
                if (result == true) {
                    System.out.println("--------------------------");
                    System.out.println("| "+fullname.getText()+" |");
                    System.out.println("--------------------------");
                    System.out.println("| "+firstaddres.getText()+" |");
                    System.out.println("--------------------------");
                    System.out.println("| "+secendaddres.getText()+" |");
                    System.out.println("--------------------------");
                    System.out.println("| "+age.getText()+" |");
                    System.out.println("--------------------------");
                    System.out.println("| "+height.getText()+" |");
                    System.out.println("--------------------------");
                    System.out.println("| "+weight.getText()+" |");
                    System.out.println("--------------------------");
                }else {
                    System.out.println("error , please try again");
                }
            }
        }
    }
}
