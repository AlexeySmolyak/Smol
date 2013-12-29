/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smol;

/**
 *
 * @author АЛЕКСЕЙ
 */
public class CeilingFanOnCommand implements Command{
    
    CeilingFan ceilingFan;
    
    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    
    @Override
    public void execute() {
        ceilingFan.on();
    }
    
    /**
     *
     */
    @Override

   public void undo() {
        ceilingFan.off();
    }

}
