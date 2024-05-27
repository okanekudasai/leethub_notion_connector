var romanToInt = function(string) {

  const nums = {
    "I": 1,
    "V": 5,
    "X": 10,
    "L": 50,
    "C": 100,
    "D": 500,
    "M": 1000
  }

  let acc = 0;

  for (let i = 0; i < string.length ; i += 1) {
    if (nums[string[i]] < nums[string[i + 1]]) {
      acc -= nums[string[i]];
    } else {
      acc += nums[string[i]];
    }
  }
  return acc;
};