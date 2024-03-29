package com.mkyong;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.util.value.ValueMap;

/**
 * Este panel lo estamos reutilizando de dos lugares distintos...
 * @author dciocca
 *
 */
public class Ejemplo2Panel extends Panel {

	public Ejemplo2Panel(String id) {
		super(id);
		add(new Label("message", "Esto es un segundo ejemplo de panel interno.."));
		add(new SimpleForm("form"));
	}


	/**
	 * inner form
	 * 
	 * @author dciocca
	 */
	public final class SimpleForm extends Form<Void>{

		private final ValueMap properties = new ValueMap();

		private TextField textField;

		public SimpleForm(final String id)
		{
			super(id);
			textField = new TextField<String>("field", new PropertyModel<String>(properties, "field"));
			add(textField);
		}

		@Override
		public final void onSubmit()
		{
			//setResponsePage(new SecondPage(getPageParameters()));
			System.out.println("SUBMIT....");
			System.out.println("TEXT FIELD: " + textField.getValue());
		}
	}


}
