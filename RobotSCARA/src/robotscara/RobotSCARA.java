package robotscara;
import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.behaviors.mouse.MouseWheelZoom;
import com.sun.j3d.utils.behaviors.vp.OrbitBehavior;
import com.sun.j3d.utils.geometry.*;
import javax.media.j3d.*;
import javax.swing.*;
import java.awt.*;
import com.sun.j3d.utils.universe.SimpleUniverse;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.media.j3d.Transform3D;
import javax.vecmath.Color3f;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3f;

/**
 *
 * @author Michał
 */
public class RobotSCARA extends Applet implements ActionListener, KeyListener{
    
    SimpleUniverse universe;
    BranchGroup group;
    Transform3D transform = new Transform3D();
    TransformGroup trgroup;
    String WINDOW_NAME = "Robot SCARA";
    int SIZE_X_OF_MAIN_FRAME = 1000;
    int SIZE_Y_OF_MAIN_FRAME = 1000;
    
    RobotSCARA()
    {
        
        // Tworzenie Platformy
        JFrame.setDefaultLookAndFeelDecorated(false);
        JFrame mainframe = new JFrame(WINDOW_NAME);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setSize(new Dimension(SIZE_X_OF_MAIN_FRAME,SIZE_Y_OF_MAIN_FRAME));
        mainframe.setBackground(Color.white);
        mainframe.setResizable(true);
        mainframe.setLayout(new BorderLayout());
        
        GraphicsConfiguration configurationOfUniverse = SimpleUniverse.getPreferredConfiguration();

        Canvas3D canvas3D = new Canvas3D(configurationOfUniverse);
        mainframe.add(BorderLayout.CENTER, canvas3D);
        
        
        // panele 

        Panel northPanel = new Panel();
        northPanel.setBackground(Color.white);
        mainframe.add("North", northPanel);
        
        Panel southPanel = new Panel();
        southPanel.setBackground(Color.white);
        mainframe.add("South", southPanel);
        
        Panel controlPanel = new ControlPanelControls().controlPanel();
        mainframe.add("East", controlPanel);
        
        
        
        
        mainframe.setVisible(true);
        mainframe.setLocationRelativeTo(null);    // gdzie się pojawia okno główne
        universe = new SimpleUniverse(canvas3D);   
    }
   
    
    
    
    public static void main(String[] args) {
        new RobotSCARA();
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
