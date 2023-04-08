import './App.css';
import React, {useState } from 'react'
import Alert from './components/Alert'
import Navbar from "./components/Navbar";
import TextForm from './components/TextForm';
import About from "./components/About";
import {
  Routes,
  BrowserRouter as Router,
  Route,
} from 'react-router-dom';
function App() {

  const[Mode, setMode] = useState('light');
  const[alert, setAlert]=useState(null);

  const showAlert = (message, type)=>{
    setAlert({
      msg: message,
      type: type
    })
    setTimeout(() => {
      setAlert(null);
    }, 1500
    );
  }
  const toggleMode =()=>{
    if(Mode === 'light'){
      setMode('dark');
      document.body.style.backgroundColor = '#212529' ;
      showAlert("Dark mode has been enabled", "success");
    }
    else{
      setMode('light');
      document.body.style.backgroundColor ='white'
      showAlert("Light mode has been enabled", "success");
    }
  }
  return (
    <>
    <Router>
      <Navbar tittle = "textutils" about = "Aboot" mode = {Mode} toggleMode={toggleMode}/>
      <Alert alert={alert}/>
      <Routes>
          <Route exact path="/about" element={<About mode = {Mode}/>}/>
          <Route exact path="/" element={<TextForm showAlert={showAlert} heading ="Enter the text to analyse below" mode={Mode}/>}/>
        </Routes>
  </Router>
    </>
  );
}

export default App;
