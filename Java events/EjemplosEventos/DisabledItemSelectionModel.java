package EjemplosEventos;

import javax.swing.DefaultListSelectionModel;

public class DisabledItemSelectionModel extends DefaultListSelectionModel {

    private boolean[] enabledFlags;

    public DisabledItemSelectionModel(boolean[] enabledFlags) {
        this.enabledFlags = enabledFlags;
    }

        
    @Override
    public void setSelectionInterval(int index0, int index1) {
        if (enabledFlags[index0]) {
            super.setSelectionInterval(index0, index0);
        } else {
            /*
             * The previously selected index is before this one, so walk forward
             * to find the next selectable item.
             */
            if (getAnchorSelectionIndex() < index0) {
                for (int i = index0; i < enabledFlags.length; i++) {
                    if (enabledFlags[i]) {
                        super.setSelectionInterval(i, i);
                        return;
                    }
                }
            } /*
             * Otherwise, walk backward to find the next selectable item.
             */ else {
                for (int i = index0; i >= 0; i--) {
                    if (enabledFlags[i]) {
                        super.setSelectionInterval(i, i);
                        return;
                    }
                }
            }
        }
    }
}
