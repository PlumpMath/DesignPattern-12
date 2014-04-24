package com.subrata.builder;

import java.util.ArrayList;
import java.util.List;

public class SMSMessage {
	private List<Messages> items = new ArrayList<Messages>();

	public void addItem(Messages property) {
		items.add(property);
	}

	public String getText() {
		String allText = "";
		for (Messages item : items) {
			allText += ("<->"+item.getText());
		}
		return allText;
	}

	public void showItems() {
		for (Messages item : items) {
			System.out.print(" type : " + item.getType());
			System.out.print(", text : " + item.getText());
		}
	}
}
