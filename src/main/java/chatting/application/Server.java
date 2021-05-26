package chatting.application;

import javax.swing.*;

public class Server extends JFrame {

    JPanel p1;
    Server(){

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("chatting/application/icons/3.png"));
        JLabel l1=new JLabel(i1);
        l1.setBounds(5,5,30,40);
        add(l1);
        setLayout(null);
        setSize(400,550);
        setLocation(400,200);
        setVisible(true);





    }

    public static void main(String[] args){
        new Server().setVisible(true);

    }
}
