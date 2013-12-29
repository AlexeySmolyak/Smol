/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smol;

/**
 *
 * @author АЛЕКСЕЙ
 */
public class CeilingFanLowCommand {
    
    CeilingFan ceilingFan;
    int prevSpeed;
    
    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }
    
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        }
        if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        }
        if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        }
        if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }        
    }

}
