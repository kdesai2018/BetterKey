package ui;

import javax.swing.JComponent;

public class FrameWrapper<C extends JComponent> extends EasyJFrame {

	private static final long serialVersionUID = -8344421539521111117L;

	protected C component;

	public FrameWrapper(String title, int width, int height, boolean closeOnX, boolean showImmediately) {
		super(title, width, height, closeOnX, showImmediately);
		component = null;
	}

	public void setComponent(C comp) {
		component = comp;
		getContentPane().add(comp);
	}

	public C getComponent() {
		return component;
	}

}
