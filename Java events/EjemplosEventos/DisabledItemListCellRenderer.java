package EjemplosEventos;


import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComponent;
import javax.swing.JList;

public class DisabledItemListCellRenderer extends DefaultListCellRenderer {

    private boolean[] enabledFlags;

    public DisabledItemListCellRenderer(boolean[] enabledFlags) {
        this.enabledFlags = enabledFlags;
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Component comp = super.getListCellRendererComponent(list, value, index, false, false);
        JComponent jc = (JComponent) comp;
        if (enabledFlags[index]) {
            if (isSelected & cellHasFocus) {
                comp.setForeground(Color.RED);
                comp.setBackground(Color.YELLOW);
            } else {
                comp.setForeground(Color.BLACK);
            }
//            if (!isSelected) {
//                if ((value.toString()).trim().equals("yellow")) {
//                    comp.setForeground(Color.orange);
//                    comp.setBackground(Color.magenta);
//                }
//            }
            return comp;
        }
        comp.setEnabled(false);
        return comp;
    }
}