import com.company.Main;

import javax.swing.text.View;

public class Knight{
    public double armor;
    public double lance;
    public void attack() {
        System.out.println("Attack!");
        new Thread(new Main()).start();

    }
    
}
