public List<String> noX(List<String> strings) {
  return strings.stream().map(s -> s.replaceAll("x", "")).collect(Collectors.toList());
}
