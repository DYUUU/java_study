import React from "react";

function Child({ contents }) {
  const [sec, setSec] = React.useState(60);
  const [min, setmin] = React.useState(30);

  React.useEffect(() => {
  }, [])


  React.useEffect(() => {
    const countdown = setInterval(() => {
      if (parseInt(sec) > 0) {
        setSec(parseInt(sec) - 1);
      }
      if (parseInt(sec) === 0) {
        clearInterval(countdown);
      }
    }, 1000);
    return () => clearInterval(countdown);
  }, [sec])

  React.useEffect(() => {
    console.log(min)
  }, [min])

  return (
    <div className="App">
      <span>Minute:{sec}</span>
      <input type="button" onClick={() => { if (min !== 0) setmin(min - 1) }}></input>
    </div >
  );
}

export default Child;
