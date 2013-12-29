/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smol;

/**
 *
 * @author АЛЕКСЕЙ
 */
public class TVOffCommand implements Command{
    
    TV tv;
    
    public TVOffCommand(TV tv) {
        this.tv = tv;
    }
    
    /**
     *
     */
    @Override
    public void execute() {
        tv.off();
    }
    
    @Override
    public void undo() {
        tv.on();
    }

}
