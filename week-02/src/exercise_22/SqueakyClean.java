package exercise_22;

public class SqueakyClean {
	
	
	public static String clean(String identifier) {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		if (!identifier.equals("")) {
			identifier = identifier.replaceAll(" ", "_");
			identifier = identifier.replaceAll("[0-9]", "");
			identifier = identifier.replaceAll("[α-ω]", "");
			identifier = identifier.replaceAll("[\0\r\u007F]", "CTRL");
			
			
			for (int i = 0; i < identifier.length(); i++) {
				if (identifier.charAt(i) == '-') {
					
					stringBuilder.append(String.valueOf(identifier.charAt(i + 1)).toUpperCase());
					i++;
				} else if (Character.isLetter(identifier.charAt(i)) || identifier.charAt(i) == '_') {
					stringBuilder.append(identifier.charAt(i));
				}
			}
			identifier = stringBuilder.toString();
		}
		return identifier;
		
		
	}
}
