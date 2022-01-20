import logo from './logo.svg';
import './App.css';
import Child from './component/Child'
import Header from './component/Header';
import Footer from './component/Footer';

function App() {
  return (
    <div className="App">
      <Header contents="Header"></Header>
      <Child contents="데이터" />
      <Footer contents="Footer"></Footer>
    </div>
  );
}

export default App;
