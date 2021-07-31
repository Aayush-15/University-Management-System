/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university_management_system;

/**
 *
 * @author Aayush
 */
public class University_Management_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoadScreen screen = new LoadScreen();
        AdminSignIn sign = new AdminSignIn();
        screen.setVisible(true);
        try {
            for (int row = 0; row <=100; row++) {
                Thread.sleep(50);
                screen.loadingnumber.setText(Integer.toString(row)+"%");
                screen.loadingprogress.setValue(row);
                if (row == 100) {
                    
                    screen.setVisible(false);
                    sign.setVisible(true);
                }
            }
        } catch (InterruptedException e) {
        }
    }
    
}
