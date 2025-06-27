import javax.swing.*;
import java.awt.event.*;

public class PopupMenuExample1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Popup Menu Example");
        JPopupMenu popupMenu = new JPopupMenu();

        // Adding menu items
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        JMenuItem cut = new JMenuItem("Cut");
        popupMenu.add(copy);
        popupMenu.add(paste);
        popupMenu.add(cut);

        // Adding separator
        popupMenu.addSeparator();

        JMenuItem exit = new JMenuItem("Exit");
        popupMenu.add(exit);

        // Adding MouseListener to trigger popup
        frame.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) { showPopup(e); }
            public void mouseReleased(MouseEvent e) { showPopup(e); }
            
            private void showPopup(MouseEvent e) {
                if (e.isPopupTrigger()) {  // Checks if it's a right-click
                    popupMenu.show(frame, e.getX(), e.getY());
                }
            }
        });

        // Adding ActionListener for menu items
        copy.addActionListener(e -> System.out.println("Copy selected"));
        paste.addActionListener(e -> System.out.println("Paste selected"));
        cut.addActionListener(e -> System.out.println("Cut selected"));
        exit.addActionListener(e -> System.exit(0));

        // Setting up the frame
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
