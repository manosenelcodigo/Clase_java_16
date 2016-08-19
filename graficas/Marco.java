
package graficas;

import javax.swing.JFrame;


public class Marco extends JFrame {
    
    public Marco()
    {
        setBounds(200,50,1024,768);
       
        setTitle("#manosenelcódigo");
        setResizable(true);
        add(new Panel());
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setVisible(true);
    }
}
