package japi.window;

public abstract class Window extends JFrame {
  public boolean fullscreen;
  public void setFullscreen(boolean fs) {
    this.fullscreen = fs;
    setUndecorated(fs);
    if (fs) setExtendedState(JFrame.MAXIMIZED_BOTH);
    if (!fs) setExtendedState(new JFrame.getExtendedState());
  }
  public void toggleFullscreen() {
    setFullscreen(!fullscreen);
  }
  
  public void close();
}
