public int triangle(int rows) {
  if(rows == 1 || rows == 0)  return rows;
  return rows + triangle(rows - 1);
}
