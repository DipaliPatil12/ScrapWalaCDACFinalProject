import './App.css';
import Header from './components/Header';
import Navbar from './components/Navbar';
import { Routes,Switch,Route } from 'react-router-dom';
import Home from './components/Home';
import Footer from './components/Footer';
import Why from './components/Why'
import ScrapRates from './components/ScrapRates';

function App() {
   return (
    <div>
      {/* <ScrapRates/> */}
  {/* //  <div className="page-container">
  //   <div className="content-wrap"></div> */}
    {/* <Header /> */}
    {/* <switch> */}
     {/* <Routes exact path ="/" component={ScrapRates}/> */}
     {/* <Redirect to="/"/> */}
     {/* </switch> */}
     <Navbar /> 
     {/* <h1>Hello from react</h1> */}
    <Home/>
    {/* <Blogs/> */}
    {/* <Why/> */}
     <Footer />
    

        <hr />
  // </div>
  );
}

export default App;
