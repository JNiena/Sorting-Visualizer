package app;

import app.api.Renderable;
import com.badlogic.gdx.graphics.Color;
import space.earlygrey.shapedrawer.ShapeDrawer;

public class Array implements Renderable {

	private int[] columns;
	private int selectedIndex;
	private int width;
	private int height;
	private Color primary;
	private Color secondary;
	private int spacing;

	public Array(int[] columns, int width, int height, Color primary, Color secondary) {
		this.columns = columns;
		this.selectedIndex = 0;
		this.width = width;
		this.height = height;
		this.primary = primary;
		this.secondary = secondary;
	}

	public void set(int[] columns) {
		this.columns = columns;
	}

	public int[] get() {
		return this.columns;
	}

	public void selectIndex(int index) {
		this.selectedIndex = index;
	}

	@Override
	public void render(ShapeDrawer renderer) {
		int columnWidth = width / columns.length;
		int columnHeight = height / ArrayUtilities.maximum(columns);
		for (int i = 0; i < columns.length; i++) {
			renderer.filledRectangle(i * columnWidth + i, 0, columnWidth, columns[i] * columnHeight, primary);
		}
		renderer.filledRectangle(selectedIndex * columnWidth + selectedIndex, 0, columnWidth, columns[selectedIndex] * columnHeight, secondary);
	}

}