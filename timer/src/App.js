import logo from './logo.svg';
import './App.css';
import Child  from './component/Child';

function App() {
  return (
    <div className="App">
      메인 App.js
      <br/>
      <Child contents="부모클래스에서 자식 클래스에서 보낸 내용"/>
    </div>
  );
}

export default App;
