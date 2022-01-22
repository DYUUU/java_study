import React from "react";

function Child({ contents }) {
  const [a, setA] = React.useState("hi");

  return (
    <div className="App">
      <span>내용:</span>
      {a}
      <input type="button" value="button" onClick={() => { setA("바꿈") }} style={{ width: "120px", backgroundColor: "yellow" }}></input>
    </div >
  );
}

export default Child;
