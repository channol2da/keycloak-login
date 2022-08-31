import React, {useEffect, useState} from 'react';
import axios from "axios";

function App() {
    const [id, setId] = useState("");
    const [password, setPassword] = useState("");

    const [msg, setMsg] = useState("");

    useEffect(() => {
        /*...*/
    }, [msg])

    const loginFunc = (e) => {
        e.preventDefault(); // Submit 후 Reload 막기
        /*...*/
        let body = {
            id,
            password
        };

        axios.post("/api/login", body)
            .then((res) => {
                console.log(res.data)
            });
    }

    return (
        <>
            <h1>Login Component</h1>
            <form onSubmit={loginFunc}>
                <label htmlFor="id"> ID: </label>
                <input type="text" id="id"
                       value={id} onChange={(e) => setId(e.target.value)}/><br />
                <label htmlFor="id"> PW: </label>
                <input type="password"
                       value={password} onChange={(e) => setPassword(e.target.value)}/><br />
                <button type="submit"> Login</button><br />
                {msg}
            </form>
        </>
    );
}

export default App