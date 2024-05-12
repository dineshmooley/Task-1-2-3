public String oneTwo(String str) {
    String result = "";

    for (int i = 0; i < str.length() - 2; i += 3) {
        String group = str.substring(i, i + 3);
        result += group.charAt(1);
        result += group.charAt(2);
        result += group.charAt(0);
    }

    return result;
}
