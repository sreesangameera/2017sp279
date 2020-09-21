public class Document
{
	private String name;
	private String extension;
	private String content;
	private int id;

	public void setName(String name)
	{
		this.name=name;
	}

	 public void setExtension(String extension)
        {
                this.extension=extension;
        }

	 public void setContent(String content)
        {
                this.content=content;
        }

	 public void setId(int id)
        {
                this.id=id;
        }

	public String getName()
	{
		return name;
	}

	public String getExtension()
        {
                return extension;
        }

	public String getContent()
        {
                return content;
        }

	public String getId()
        {
                return id;
        }


	
}
