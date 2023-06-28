import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    JButton button=new JButton("click!!");
    MyFrame(){
        button.setBounds(80,100,40,30);

        button.addActionListener(
            (e)->
                System.out.println("Whoopty!!")


        );
        this.add(button);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
    }

}
