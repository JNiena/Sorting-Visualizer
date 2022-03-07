package app.api;

import com.badlogic.gdx.ApplicationAdapter;

public class Application extends ApplicationAdapter {

	private KeyboardHandler keyboardHandler;
	private Renderer renderer;

	@Override
	public final void create() {
		keyboardHandler = new KeyboardHandler();
		renderer = new Renderer();
		start();
	}

	@Override
	public final void render() {
		renderer.render();
		keyboardHandler.update();
		update();
	}

	@Override
	public final void dispose() {
		exit();
	}

	public void start() {

	}

	public void update() {

	}

	public void exit() {

	}

	protected KeyboardHandler getKeyboardHandler() {
		return this.keyboardHandler;
	}

	protected Renderer getRenderer() {
		return this.renderer;
	}

}