import React from "react";

function Child({ contents }) {
  const [a, setA] = React.useState("hi");
  const [st, setSt] = React.useState("");

  return (
    <div className="App">
      <span>내용:</span>
      {a}
      <input type="button" value="button" onClick={() => { setA("바꿈"); setSt("yellow") }} style={{ width: "120px", backgroundColor: st }}></input>
    </div >
  );
}

export default Child;
