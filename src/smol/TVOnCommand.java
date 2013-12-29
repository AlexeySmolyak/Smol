/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smol;

/**
 *
 * @author АЛЕКСЕЙ
 */
public class TVOnCommand implements Command{
    
    TV tv;
    
    public TVOnCommand(TV tv) {
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.on();
    }
    
    /**
     *
     */
    @Override
    public void undo() {
        tv.off();
    }

}
