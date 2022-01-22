import React from "react";
// 이걸 하는 이유는??

function Child({contents}) {
  const [a, setA] = React.useState("변수 A  ")
  const [b, setB] = React.useState("변수 B  ")
  // 이것의 의미는? 꼭 상수로 주어야 하는건가?
  // 변수의 자료형이 아무거나 올 수 있다면 아무거나 쓸 수 있는 것인가...?
  return (
    <div className="App">
      {contents}
      <br/>
      {a}      
      <input type="button" value="button" onClick={()=>{setA("변수 A 변경되었습니다. ")}}>

      </input>
      <br/>
      {b}
      <input type="button" value="button" onClick={()=>{setB("변수 B 변경되었습니다. ")}}></input>
    </div>
  );
}

export default Child;
