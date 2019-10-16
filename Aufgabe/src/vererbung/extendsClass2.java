package vererbung;

//******************** Super Class **************
class TextFormat{
	String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}

	// ************ Html format Class ************
class HtmlTextFormat extends TextFormat{
	
	
	public HtmlTextFormat(String text) {
		this.text = text;
	}
	
	public String fett() {
		return "<b>" + text + "</b>";
	}
	
	public String kursiv() {
		return "<i>" + text + "</i>";
	}
	
	@Override
	public String toString() {
		return "htmlFormat  : "+ this.text;
	}

	//********** Markdown Class *********
}

class MarkdownTextFormat extends TextFormat{


	public MarkdownTextFormat(String text) {
		this.text = text;
	}
	
	public String fett() {
		return "__" + text + "__";
	}
	
	@Override
	public String toString() {
		return "MarkdownFormat  : "+ this.text;
	}
	
	
}

	//***************** Main Class *****************
public class extendsClass2 {
	
	public static void main(String[] args) {
		
		String text = "Heute ist Dienstag";
		
		HtmlTextFormat htmlformat = new HtmlTextFormat(text);
		String h = htmlformat.fett();
		System.out.println("fett html: "+h);
		
		MarkdownTextFormat mdformat = new MarkdownTextFormat(text);
		String mf = mdformat.fett();
		System.out.println("fett Mrakdown: "+mf);
		
		htmlformat.setText("gaadsf");
		String s = htmlformat.getText();
		System.out.println(htmlformat);
		
	}

}
