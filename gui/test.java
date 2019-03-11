package com.ly;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class test extends JFrame{

    int size=9;
    public static JButton []jbs=new JButton[9];
    public static String s = "123124124";
    public static boolean w = false,c = false,h = false,t = false,n = false;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        test d3=new test();       
    }

     public test(){  

        //JTextField jt1=new JTextField();
        //JTextArea jt2=new JTextArea();   
        //JScrollPane jsp=new JScrollPane(jt2);
        // this.add(jt1);
        // this.add(jt2);
        // this.add(jsp);
        // jt2.setText("aaa");

            
            jbs[0]=new JButton("input1");
            jbs[1]=new JButton("input2");
            jbs[2]=new JButton("ouput");
            jbs[3]=new JButton("-w");
            jbs[4]=new JButton("-c");
            jbs[5]=new JButton("-h");
            jbs[6]=new JButton("-t");
            jbs[7]=new JButton("-n");
            jbs[8]=new JButton("exit");

            //add事件监听
            Monitor1 input1 = new Monitor1();
            jbs[0].addActionListener(input1);
            Monitor2 input2 = new Monitor2();
            jbs[1].addActionListener(input2);
            Monitor3 output = new Monitor3();
            jbs[2].addActionListener(output);
            Monitor4 wm = new Monitor4();
            jbs[3].addActionListener(wm);
            Monitor5 cm = new Monitor5();
            jbs[4].addActionListener(cm);
            Monitor6 hm = new Monitor6();
            jbs[5].addActionListener(hm);
            Monitor7 tm = new Monitor7();
            jbs[6].addActionListener(tm);
            Monitor8 nm = new Monitor8();
            jbs[7].addActionListener(nm);
            Monitor9 exitm = new Monitor9();
            jbs[8].addActionListener(exitm);

            for(int i=0;i<size;i++)
            {
                jbs[i].setFont(new Font("Times New Roman", Font.PLAIN, 20));
            }
            
            this.setLayout(new GridLayout(3,3));
            for(int i=0;i<size;i++)
                this.add(jbs[i]);
            this.setTitle("longest word");
            this.setSize(300,300);
            this.setLocation(200,200);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
        }
}

//input1
class Monitor1 implements ActionListener{
    public void actionPerformed(ActionEvent event){
        JFrame f  = new JFrame();
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(f);   

        File fo = jfc.getSelectedFile();
        String pathname = fo.getAbsolutePath();

        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) 
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//input2
class Monitor2 implements ActionListener{
    public void actionPerformed(ActionEvent event){
        test.s=JOptionPane.showInputDialog("please input text");
        System.out.println(test.s);
    }
}

//output
class Monitor3 implements ActionListener{
    public void actionPerformed(ActionEvent event){
        System.out.println(test.s);
        JOptionPane.showMessageDialog(null, test.s);
    }
}

//-w
class Monitor4 implements ActionListener{
    public void actionPerformed(ActionEvent event){
        if(test.w == true){test.w = false;test.jbs[3].setForeground(Color.black);}
        else {test.w = true;test.jbs[3].setForeground(Color.red);}
    }
}

//-c
class Monitor5 implements ActionListener{
    public void actionPerformed(ActionEvent event){
        if(test.c == true){test.c = false;test.jbs[4].setForeground(Color.black);}
        else {test.c = true;test.jbs[4].setForeground(Color.red);}
    }
}

//-h
class Monitor6 implements ActionListener{
    public void actionPerformed(ActionEvent event){
       if(test.h == true){test.h = false;test.jbs[5].setForeground(Color.black);}
        else {test.h = true;test.jbs[5].setForeground(Color.red);}
    }
}

//-t
class Monitor7 implements ActionListener{
    public void actionPerformed(ActionEvent event){
       if(test.t == true){test.t = false;test.jbs[6].setForeground(Color.black);}
        else {test.t = true;test.jbs[6].setForeground(Color.red);}
    }
}

//-n
class Monitor8 implements ActionListener{
    public void actionPerformed(ActionEvent event){
        if(test.n == true){test.n = false;test.jbs[7].setForeground(Color.black);}
        else {test.n = true;test.jbs[7].setForeground(Color.red);}
    }
}

//exit
class Monitor9 implements ActionListener{
    public void actionPerformed(ActionEvent event){
        System.exit(0);
    }
}



