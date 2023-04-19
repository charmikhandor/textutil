import React from 'react'

export default function About(props) {

  return (
    <>
    <div className="container" style = {{color:props.mode==='dark'?'white':'black'}}>
        <h2 className="my-2">About Us</h2>
        <div className="accordion accordion-flush" id="accordionFlushExample" style = {{color:props.mode==='dark'?'white':'black'}}>
        <div className="accordion-item" style = {{backgroundColor:props.mode==='light'?'white':'grey', 
        color:props.mode==='dark'?'white':'black'}}>
            <h2 className="accordion-header">
            <button className="accordion-button collapsed" style = {{backgroundColor:props.mode==='light'?'white':'grey', 
        color:props.mode==='dark'?'white':'black'}} type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseOne" aria-expanded="false" aria-controls="flush-collapseOne">
                About your text
            </button>
            </h2>
            <div id="flush-collapseOne" className="accordion-collapse collapse" data-bs-parent="#accordionFlushExample">
            <div className="accordion-body">Textutils is a way for you to ananlyse your text quickly and efficiently</div>
            </div>
        </div>
        <div className="accordion-item" style = {{backgroundColor:props.mode==='light'?'white':'grey', 
        color:props.mode==='dark'?'white':'black'}}>
            <h2 className="accordion-header">
            <button className="accordion-button collapsed" style = {{backgroundColor:props.mode==='light'?'white':'grey', 
        color:props.mode==='dark'?'white':'black'}} type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseTwo" aria-expanded="false" aria-controls="flush-collapseTwo">
                Free to use
            </button>
            </h2>
            <div id="flush-collapseTwo" className="accordion-collapse collapse" data-bs-parent="#accordionFlushExample">
            <div className="accordion-body">This app is completely free to use!!</div>
            </div>
        </div>
        <div className="accordion-item" style = {{backgroundColor:props.mode==='light'?'white':'grey', 
        color:props.mode==='dark'?'white':'black'}}>
            <h2 className="accordion-header">
            <button className="accordion-button collapsed" style = {{backgroundColor:props.mode==='light'?'white':'grey', 
        color:props.mode==='dark'?'white':'black'}} type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseThree" aria-expanded="false" aria-controls="flush-collapseThree">
                Browser Compactible
            </button>
            </h2>
            <div id="flush-collapseThree" className="accordion-collapse collapse" data-bs-parent="#accordionFlushExample">
            <div className="accordion-body">Compactible with popular browsers like chrome, firefox and edge</div>
            </div>
        </div>
        </div>
        
    </div>

    </>
  )
}
