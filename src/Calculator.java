import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String str="";
	private JButton[] buttons;
	public static final String[] names=
		{"1","2","3","+","4","5","6","-","7","8","9","*","0",".","=","/"};
	private GridLayout gridLayout;
	Panel p1 = new Panel();
	private double num1;
	private double num2;
	private String op;
	private double result;

	public Calculator(){
		
		//creat JTextField
		JTextField txt=new JTextField();
		txt.setPreferredSize(new Dimension(400,150));
		txt.setFont(new Font("Serif",Font.PLAIN,40));
		
		JPanel p2 = new JPanel(new GridLayout (1, 2));
		
		JButton clear = new JButton("C");
		clear.setFont(new Font("Serif",Font.PLAIN,20));
		p2.add(clear);
		
		JButton back = new JButton("CE");
		back.setFont(new Font("Serif",Font.PLAIN,20));
		p2.add(back);
		
		p2.setPreferredSize(new Dimension(400,50));
		
		JPanel p1=new JPanel(new GridLayout(4,4,5,5));
		buttons=new JButton[16];
		for(int count=0;count<16;count++)
		{
			buttons[count]=new JButton(names[count]);
			p1.add(buttons[count]);
			buttons[count].setFont(new Font("Serif",Font.PLAIN,20));
		}
		setLayout(gridLayout);
		
		//--------------------------------------------------------------
		//digit 0~9
        buttons[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	str+="1";
				txt.setText(txt.getText()+"1");
            }
        });
        buttons[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	str+="2";
				txt.setText(txt.getText()+"2");
            }
        });
        buttons[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	str+="3";
				txt.setText(txt.getText()+"3");
            }
        });
        
        buttons[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	str+="4";
				txt.setText(txt.getText()+"4");
            }
        });
        buttons[5].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	str+="5";
				txt.setText(txt.getText()+"5");
            }
        });
        buttons[6].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	str+="6";
				txt.setText(txt.getText()+"6");
            }
        });
       
        buttons[8].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	str+="7";
				txt.setText(txt.getText()+"7");
            }
        });
        buttons[9].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	str+="8";
				txt.setText(txt.getText()+"8");
            }
        });
        
        buttons[10].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	str+="9";
				txt.setText(txt.getText()+"9");
            }
        });
	
	//--------------------------------------------------------------
	//operation
	//add
	buttons[3].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
        	num1=Double.parseDouble(txt.getText());
        	txt.setText(txt.getText()+"+");
        	op="+";
        	str="";
        }
    });
	
	//subtraction
	 buttons[7].addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
         {
        	 num1=Double.parseDouble(txt.getText());
        	 txt.setText(txt.getText()+"-");
        	 op="-";
        	 str="";
         }
     });
	 
	 //mutiplication
	 buttons[11].addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	        	num1=Double.parseDouble(txt.getText());
	        	txt.setText(txt.getText()+"*");
	        	op="*";
	        	str="";
	        }
	    });
	 
	//division
		 buttons[15].addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e)
		        {
		        	num1=Double.parseDouble(txt.getText());
		        	txt.setText(txt.getText()+"/");
		        	op="/";
		        	str="";
		        }
		    });
		 
	//--------------------------------------------------------------
	//equal
		 buttons[14].addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e)
		        {
		        	num2=Double.parseDouble(str);
		        	switch(op)
		        	{
		        	case "+":result=num1+num2;break;
		        	case "-":result=num1-num2;break;
		        	case "*":result=num1*num2;break;
		        	case "/":result=num1/num2;break;
		        	}
		        	txt.setText(Double.toString(result));
		      
		        }
		    });
		 
		//--------------------------------------------------------------
		 //dot
		 buttons[13].addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e)
		        {
		        	txt.setText(txt.getText()+".");
		        	str+=".";
		        }
		    });
		
		 //--------------------------------------------------------------
		 //clear
		 clear.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e)
		        {
		        	txt.setText("");
		        	str+="";
		        }
		    });
		 
		 /*//back
		 back.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e)
		        {
		        	str
		        }
		    });*/
		 
		 JPanel p=new JPanel(new BorderLayout());
		 p.add(txt,BorderLayout.NORTH);
		 p.add(p1,BorderLayout.CENTER);
		 p.add(p2,BorderLayout.SOUTH);
		 add(p);
		 setLayout (new GridLayout (1, 1));
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator frame=new Calculator();
	    frame.setTitle("计算器");
	    frame.setBounds(100, 100, 400, 500);//设置框架位置和大小
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
}
