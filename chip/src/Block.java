import javafx.scene.image.ImageView;

public interface Block 
{
	public ImageView getImageView();
	public void setX(int x);
	public void setY(int y);
	public void setPosition(int x, int y);
}