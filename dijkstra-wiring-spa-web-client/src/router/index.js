import { createRouter, createWebHistory } from 'vue-router'
import ImgPage from "../components/ImgInput/ImgPage";
import DrawPage from "../components/GraphDrawPage/DrawPage";
import LandingPage from "../components/LandingPage";


const index = [
    {path:"/",component:LandingPage},
    {path: "/Draw" , component: DrawPage},
    {path: "/Image" , component: ImgPage}
]
const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes: index
})

export default router

