import {useState} from "react";

function counter(){
    const [count, setCount] = useState(0);

    <>
        <h1>{count}</h1>
        <button onClick={()=>setCount(count + 1)}>
            Increment
        </button>
    </>
}
