const solution = (numbers) => {
  const sum = numbers.reduce((prev, curr) => prev + curr, 0);
  return sum / numbers.length;
}