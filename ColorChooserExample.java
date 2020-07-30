    import java.awt.event.*;    
    import java.awt.*;    
    import javax.swing.*;     
    public class ColorChooserExample extends JFrame implements ActionListener {    
    JButton b;  
    JButton d;
    Container c;    
    ColorChooserExample(){    
        
    	c=getContentPane();    
        c.setLayout(new FlowLayout());
        
        b=new JButton("background color");
        d=new JButton("text color");
        b.addActionListener(this);
        d.addActionListener(this);  
        c.add(b);
        c.add(d);        
    }    
    public void actionPerformed(ActionEvent e) {    
    Color initialcolor=Color.RED;    
    Color color=JColorChooser.showDialog(this,"Select textcolor",initialcolor); 
    Color color2=JColorChooser.showDialog(this,"Select backgroundcolor",initialcolor); 
    if (e.getSource()==b) {
    b.setBackground(color2);
    b.setForeground(color);
    
    }
    else
       {
       d.setBackground(color2);
   	  d.setForeground(color);
      }    
    }
    
    public static void main(String[] args) {    
        ColorChooserExample ch=new ColorChooserExample();    
        ch.setSize(400,400);    
        ch.setVisible(true);    
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);    
    }    
    }    