import React, {useState} from 'react'



export default function TextForm(props) {
    const handleUpClick = () =>{
        console.log("click");
        let newText = text.toUpperCase();
        setText(newText);
        props.showAlert("Converted to uppercase", "success")
    }
    const handleLowClick = () =>{
        console.log("click");
        let newText = text.toLowerCase();
        setText(newText);
    }
    const handleCapClick = () =>{
        console.log("click");
        let text1 = text;
        text1 = String(text1).toLowerCase();
        text1 = String(text1).split('. ');
        for(var i=0; i<text1.length; i++){
            text1[i] = text1[i].charAt(0).toUpperCase()+text1[i].slice(1);
        }
        let newText = text1.join(". ");
        setText(newText);
    }

    const handleOnChange = (event) =>{
        console.log("chnage");
        setText(event.target.value);
    }
    const [text, setText] = useState('');
  return (
    <>
    <div className="container" style={{color:props.mode==='dark'?'white':'black'}}>
        <div className="mb-3">
        <label htmlFor="myBox" className="form-label">{props.heading}</label>
        <textarea className="form-control" value = {text} style={{backgroundColor:props.mode==='light'?'white':'grey', 
        color:props.mode==='dark'?'white':'black'}} onChange={handleOnChange} id="myBox" rows="8" ></textarea>
        </div>
        <button className="btn btn-primary mx-2" onClick={handleUpClick}>Convert to Uppercase</button>
        <button className="btn btn-primary mx-2" onClick={handleLowClick}>Convert to Lowercase</button>
        <button className="btn btn-primary my-2" onClick={handleCapClick}>Convert to CapitalCase</button>
        
    </div>
    <div className="container my-3" style={{color:props.mode==='dark'?'white':'black'}}>
        <h2>Your text summary</h2>
        <p>{text.split(" ").length} word and {text.length} characters</p>
        <p>{0.008 *text.split(" ").length} Minutes to read</p>
        <h3>Preview</h3>
         <p>{text.length>0?text:"Enter something in the textbox above to preview here"}</p>
    </div>
    </>
  )
}
