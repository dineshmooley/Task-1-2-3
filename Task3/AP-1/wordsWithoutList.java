public List wordsWithoutList(String[] words, int len) {
  return java.util.Arrays.stream(words).filter(word -> word.length() != len).collect(Collectors.toList());
}
