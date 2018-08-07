/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HMS_Home;

import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author Prabas Gayadeeptha
 */
public class HMS_Methods {

    public void unmovableInternal(JInternalFrame jif) {
        for (MouseListener listener : ((javax.swing.plaf.basic.BasicInternalFrameUI) jif.getUI()).getNorthPane().getMouseListeners()) {
            ((javax.swing.plaf.basic.BasicInternalFrameUI) jif.getUI()).getNorthPane().removeMouseListener(listener);
        }
    }
}
