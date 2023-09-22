package NPCs;

import java.util.HashMap;

import Builders.FrameBuilder;
import Engine.ImageLoader;
import GameObject.Frame;
import GameObject.SpriteSheet;
import Level.NPC;
import Utils.Direction;
import Utils.Point;

public class Textbox6 extends NPC {
	private Direction startFacingDirection;

	public Textbox6(Point location, Direction facingDirection) {
		super(location.x, location.y, new SpriteSheet(ImageLoader.load("Textbox6.png"), 637, 189), "TEXT");

		this.startFacingDirection = facingDirection;
		this.initialize();
	}

	@Override
	public void initialize() {
		super.initialize();
		currentAnimationName = "TEXT";
		

	}

	@Override
	public HashMap<String, Frame[]> loadAnimations(SpriteSheet spriteSheet) {
		return new HashMap<String, Frame[]>() {
			{

				put("TEXT", new Frame[] { new FrameBuilder(spriteSheet.getSprite(0, 0), 100).withScale(1).build() });

			}
		};
	}
}