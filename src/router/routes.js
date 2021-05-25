import ImgPage from "../components/ImgInput/ImgPage";
import DrawPage from "../components/GraphDrawPage/DrawPage";
import Landing from "./components/Landing";


export default [
    {path:"/",component:Landing},
    {path: "/Draw" , component: DrawPage},
    {path: "/Image" , component: ImgPage}
]
