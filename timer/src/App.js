import logo from './logo.svg';
import './App.css';
import Child  from './component/Child';

function App() {
  return (
    <div className="App">
      Hello World
      <Child contents="Hello World"/>
    </div>
  );
}

export default App;
