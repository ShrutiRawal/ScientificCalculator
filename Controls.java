import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Controls extends JPanel{
    private GridLayout frame = new GridLayout(6,4);
    private static float num1;
    private static float num2;
    private static float res;
    private static int operation;
    public static String answer="";
    
    Controls(){
        this.setSize(300,150);
        
        JButton btnadd = new JButton("+");
        JButton btnsub = new JButton("-");
        JButton btnmul = new JButton("*");
        JButton btndiv = new JButton("/");
        JButton btn0 = new JButton("0");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btndot = new JButton(".");
        JButton btnequal = new JButton("=");
        JButton btntan = new JButton("tan");
        JButton btnsin = new JButton("sin");
        JButton btncos = new JButton("cos");
        JButton btnfact = new JButton("!");
        JButton btnsqrt = new JButton("sqrt");
        JButton btncbrt = new JButton("cbrt");
        JButton btnpower = new JButton("^");        
        JButton btnlog = new JButton("log");
        
        
        
        //////////////////// actions
        
        btnadd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                float val1 = Float.valueOf(Calculator.screen.getText());
                Controls.answer = "";               
                Controls.num1 = val1;
                Controls.operation = 1;
            }
            
        });
        
        btnsub.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                float val1 = Float.valueOf(Calculator.screen.getText());
                Controls.answer = "";   
                Controls.num1 = val1;
                Controls.operation = 2;
            }
            
        });
        
        btnmul.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                float val1 = Float.valueOf(Calculator.screen.getText());
                Controls.answer = "";   
                Controls.num1 = val1;
                Controls.operation = 3;
            }
            
        });
        
        btndiv.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                float val1 = Float.valueOf(Calculator.screen.getText());
                Controls.answer = "";   
                Controls.num1 = val1;
                Controls.operation = 4;
            }
            
        });
        
        btnsqrt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                float val1 = Float.valueOf(Calculator.screen.getText());
                Controls.answer = "";               
                Controls.num1 = val1;
                Controls.operation = 5;
            }
            
        });
        
        btnpower.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                float val1 = Float.valueOf(Calculator.screen.getText());
                Controls.answer = "";               
                Controls.num1 = val1;
                Controls.operation = 6;
            }
            
        });
        
        btnlog.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                float val1 = Float.valueOf(Calculator.screen.getText());
                Controls.answer = "";               
                Controls.num1 = val1;
                Controls.operation = 7;
            }
            
        });
        
        btnsin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                float val1 = Float.valueOf(Calculator.screen.getText());
                Controls.answer = "";               
                Controls.num1 = val1;
                Controls.operation = 8;
            }
            
        });
        
        btncos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                float val1 = Float.valueOf(Calculator.screen.getText());
                Controls.answer = "";               
                Controls.num1 = val1;
                Controls.operation = 9;
            }
            
        });
        
        btntan.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                float val1 = Float.valueOf(Calculator.screen.getText());
                Controls.answer = "";               
                Controls.num1 = val1;
                Controls.operation = 10;
            }
            
        });
        
        btncbrt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                float val1 = Float.valueOf(Calculator.screen.getText());
                Controls.answer = "";               
                Controls.num1 = val1;
                Controls.operation = 11;
            }
            
        });
        
        btnfact.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                float val1 = Float.valueOf(Calculator.screen.getText());
                Controls.answer = "";               
                Controls.num1 = val1;
                Controls.operation = 12;
            }
            
        });
        
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Calculator.screen.setText("");
                Controls.answer+="1";
                Calculator.screen.setText(Controls.answer);
            }
            
            
            
        });
        
        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Calculator.screen.setText("");
                Controls.answer+="2";
                Calculator.screen.setText(Controls.answer);
            }
            
            
            
        });
        
        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Calculator.screen.setText("");
                Controls.answer+="3";
                Calculator.screen.setText(Controls.answer);
            }
            
            
            
        });
        
        btn4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Calculator.screen.setText("");
                Controls.answer+="4";
                Calculator.screen.setText(Controls.answer);
            }
            
            
            
        });
        
        btn5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Calculator.screen.setText("");
                Controls.answer+="5";
                Calculator.screen.setText(Controls.answer);
            }
            
            
            
        });
        
        btn6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Calculator.screen.setText("");
                Controls.answer+="6";
                Calculator.screen.setText(Controls.answer);
            }
            
            
            
        });
        
        btn7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Calculator.screen.setText("");
                Controls.answer+="7";
                Calculator.screen.setText(Controls.answer);
            }
            
            
            
        });
        
        btn8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Calculator.screen.setText("");
                Controls.answer+="8";
                Calculator.screen.setText(Controls.answer);
            }
            
            
            
        });
        
        btn9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Calculator.screen.setText("");
                Controls.answer+="9";
                Calculator.screen.setText(Controls.answer);
            }
            
            
            
        });
        
        btn0.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Calculator.screen.setText("");
                Controls.answer+="0";
                Calculator.screen.setText(Controls.answer);
            }
            
            
            
        });
        
        btndot.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Calculator.screen.setText("");
                Controls.answer+=".";
                Calculator.screen.setText(Controls.answer);
            }
            
            
            
        });
        
        btnequal.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                float val2 = Float.valueOf(Calculator.screen.getText());
                Controls.num2 = val2;
                switch(Controls.operation){
                    case 1: Controls.res=Controls.add();
                    break;
                    case 2: Controls.res = Controls.sub();
                    break;
                    case 3: Controls.res = Controls.mult();
                    break;
                    case 4: Controls.res = Controls.div();
                    break;
                    case 5: Controls.res = Controls.sqRoot();
                    break;
                    case 6: Controls.res = Controls.power();
                    break;
                    case 7: Controls.res = Controls.log();
                    break;
                    case 8: Controls.res = Controls.sinVal();
                    break;
                    case 9: Controls.res = Controls.cosVal();
                    break;
                    case 10: Controls.res = Controls.tanVal();
                    break;
                    case 11: Controls.res = Controls.cbRoot();
                    break;
                    case 12: Controls.res = Controls.factorial();
                    break;
                }
                
                Calculator.screen.setText(String.valueOf(Controls.res));  
            }           
            
        });
        
        
        
        
        frame.setHgap(10);
        frame.setVgap(10);
        
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
        this.add(btnadd);
        this.add(btn4);
        this.add(btn5);
        this.add(btn6);
        this.add(btnsub);
        this.add(btn7);
        this.add(btn8);
        this.add(btn9);
        this.add(btnmul);
        this.add(btn0);
        this.add(btndot);
        this.add(btnequal);
        this.add(btndiv);
        this.add(btntan);
        this.add(btnsin);
        this.add(btncos);
        this.add(btnfact);
        this.add(btnpower);
        this.add(btnlog);
        this.add(btncbrt);
        this.add(btnsqrt);
        
        
        this.setLayout(frame);
        
    }
    
    
    public static float add() {
        return (num1+num2);
    }
    public static float sub() {
        return (num1-num2);
    }
    public static float mult() {
        return (num1*num2);
    }
    public static float div() {
        return (num1/num2);
    }
    public static float sqRoot(){
         return (float)Math.sqrt(num1);   
    }
    public static float power(){
         return (float)Math.pow(num1,num2);   
    }
    public static float log(){
         return (float)Math.log(num1);   
    }
    public static float cbRoot(){
         return (float)Math.cbrt(num1);   
    }
    public static float sinVal(){
         return (float)Math.sin(num1);   
    }
    public static float cosVal(){
         return (float)Math.cos(num1);   
    }
    public static float tanVal(){
         return (float)Math.tan(num1);   
    }
    public static float factorial(){ 
         int res = 1, i; 
         for (i=2; i<=num1; i++){
             res *= i;
         }
         return (float)res; 
    } 
}