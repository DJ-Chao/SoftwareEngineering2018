import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class greenKey implements Key
{
	int scale = 25;
	int x = 0;
	int y = 0;
	Image blockImage = new Image("file:/Users/Dchao88/git/SoftwareEngineering2018/chip/chipsChallenge/src/textures/greenKey.png", scale, scale, true, true);
	ImageView blockImageView = new ImageView(blockImage);
	
	@Override
	public ImageView getImageView() 
	{
		return blockImageView;
	}

	@Override
	public void setX(int x) {
		this.x = x;
		this.blockImageView.setX(x);
	}

	@Override
	public void setY(int y) {
		this.y = y;
		this.blockImageView.setY(y);
	}

	@Override
	public void setPosition(int x, int y) {
		this.x = x;
		this.blockImageView.setX(x);
		this.y = y;
		this.blockImageView.setY(y);
	}
}