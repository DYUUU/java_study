import React from "react";

function Child({ contents }) {
  const [a, setA] = React.useState("hi");

  return (
    <div className="App">
      <span>내용:</span>
      {a}
      <input type="button" value="button" onClick={() => { setA("바꿈") }}></input>
    </div>
  );
}

export default Child;
