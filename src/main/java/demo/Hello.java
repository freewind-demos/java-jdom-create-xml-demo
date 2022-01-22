package demo;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class Hello {

  public static void main(String[] args) throws Exception {

    Element carsElement = new Element("cars");
    Document doc = new Document(carsElement);

    //supercars element
    Element level1 = new Element("supercars");
    level1.setAttribute(new Attribute("company", "Ferrari"));

    Element level2 = new Element("carname");
    level2.setAttribute(new Attribute("type", "formula one"));
    level2.setText("Ferrari 101");

    level1.addContent(level2);
    doc.getRootElement().addContent(level1);

    XMLOutputter xmlOutput = new XMLOutputter();
    xmlOutput.setFormat(Format.getPrettyFormat());
    xmlOutput.output(doc, System.out);
  }

}
