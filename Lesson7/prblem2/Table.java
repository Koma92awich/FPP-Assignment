package SwingHomeWork;

public class Table {

	private static final int CHAR_START_NUM = 97;

	private static final int SIZE = 26;

	private Entry[] entries = new Entry[SIZE];

	public String get(char c) {

		int charNum = c;

		charNum -= CHAR_START_NUM;

		if (charNum >= 0 && charNum < SIZE) {

			return entries[charNum].str;

		}

		return null;

	}

	public void add(char c, String s) {

		int charNum = c;

		charNum -= CHAR_START_NUM;

		if (charNum >= 0 && charNum < SIZE) {

			entries[charNum] = new Entry(c, s);

		}

	}

	public String toString() {

		StringBuilder strings = new StringBuilder();

		for (Entry entry : entries) {

			if (entry != null) {

				strings.append(entry + "\n");

			}

		}

		return strings.toString();

	}

	private class Entry {

			private char ch;

			private String str;



			Entry(char ch, String str) {

				this.ch = ch;

				this.str = str;

			}



			public String toString() {

				return ch + " -> " + str;

			}

		}
}