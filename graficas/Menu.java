
package graficas;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Menu extends JMenuBar
{
    public Menu()
    {
        JMenu configuracion=new JMenu(); 
        configuracion.setText("Configuración");
        JMenuItem usuarios=new JMenuItem();
        usuarios.setText("Usuarios");
        JMenuItem ayuda=new JMenuItem();
        ayuda.setText("Ayuda");
        configuracion.add(usuarios);
        configuracion.add(ayuda);
        
        
        JMenu mantenedores=new JMenu();
        mantenedores.setText("Mantenedores");
        JMenuItem productos=new JMenuItem();
        productos.setText("Productos");
        JMenuItem clientes=new JMenuItem();
        clientes.setText("Clientes");
        JMenuItem proveedores=new JMenuItem();
        proveedores.setText("Proveedores");
        
        mantenedores.add(productos);
        
        mantenedores.add(proveedores);
        mantenedores.add(clientes);
        
        
        JMenu reportes=new JMenu();
        reportes.setText("Reportes");
        JMenuItem pdf=new JMenuItem();
        pdf.setText("Reportes en PDF");
        JMenuItem txt=new JMenuItem();
        txt.setText("TXT");
        reportes.add(pdf);
        reportes.add(txt);
        //txt.add(mantenedores);
        
        
        add(configuracion);
        add(mantenedores);
        add(reportes);
                
    }
    
    
}
