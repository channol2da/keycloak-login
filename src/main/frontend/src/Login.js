// import React, {useState, useEffect} from "react";
// // import {loginUser} from "./userSlice";
// import axios from "axios";
//
// function LoginComponent(){
//     const [id, setId] = useState("");
//     const [password, setPassword] = useState("");
//
//     const [msg, setMsg] = useState("");
//
//     useEffect(() => {
//         /*...*/
//     }, [msg])
//
//     const loginFunc = (e) => {
//         e.preventDefault();
//         /*...*/
//     }
//
//     return (
//         <>
//             <h1>Login Component</h1>
//             <form onSubmit={loginFunc}>
//                 <label htmlFor="id"> ID: </label>
//                 <input type="text" id="id" /><br />
//                 <label htmlFor="id"> PW: </label>
//                 <input type="password" /><br />
//                 <button type="submit"> Login</button><br />
//                 {msg}
//             </form>
//         </>
//     );
// }
//
// export default LoginComponent