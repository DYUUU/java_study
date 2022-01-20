function Child({ contents }) {
  let arr = [3, 5, 1, 2, 4];
  let obj = { 1: { "index": 3, "value": 1 }, 2: 4, 3: 1, 4: { "index": 5, "value": 4 }, 5: 2 };

  function find(number) {
    let ai = -1;
    let oi = -1;
    for (let i = 0; i < 5; i++) {
      if (arr[i] == number) {
        ai = i + 1;
        break;
      }
    }
    return ai;
  }

  return (
    <div className="App">
      <span>내용:</span>
      {find(4)}
      {obj[4]["index"]}
      {contents}
    </div>
  );
}

export default Child;
