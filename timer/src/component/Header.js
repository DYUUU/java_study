function Header({ contents }) {
  return (
    <div className="App" style={{ background: "yellow" }}>
      <div>헤더입니다 ㅎㅎ</div>
      {contents}
      <div>끝입니다 ㅎㅎ</div>
    </div>
  );
}

export default Header;
