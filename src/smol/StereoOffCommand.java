/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smol;

/**
 *
 * @author АЛЕКСЕЙ
 */
public class StereoOffCommand implements Command{
    
    Stereo stereo;
    
    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    
    @Override
    public void execute() {
        stereo.off();
    }
    
    @Override
    public void undo() {
        stereo.on();
    }

}
