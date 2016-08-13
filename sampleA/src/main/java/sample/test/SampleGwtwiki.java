package sample.test;

import info.bliki.wiki.model.WikiModel;

public class SampleGwtwiki {

	public static void main(String[] args) {

		System.out.println("Start ========================================");

		WikiModel model = new WikiModel("", "");

		for (String wikiText : args) {
			System.out.println("===");
			System.out.println("Before: " + wikiText);
			String html = WikiModel.toHtml(wikiText);
			System.out.println("After: " + html);
		}

		System.out.println("End   ========================================");
	}

}
