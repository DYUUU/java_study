import logo from './logo.svg';
import './App.css';
import Child from './component/Child'
import Header from './component/Header';
import Footer from './component/Footer';

function App() {
  return (
    <div className="App">
      {/* <Header contents="Header"></Header> */}
      <Child contents="데이터가 바뀜" object={{ "key": 1, value: "obj" }} />
      {/* <Footer contents="Footer"></Footer> */}
    </div>
  );
}

export default App;
