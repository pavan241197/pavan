package capgemini_labbook2;

public abstract class WrittenItem extends Item {
	protected String author;
	protected abstract String getAuthor();
	public abstract void setAuthor(String author);
}
