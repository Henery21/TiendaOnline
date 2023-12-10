import { useState } from 'react'

import './assets/css/App.css'
// hay que importar el Header 
// hay que REparar el CArbutton por quele falta css 
/// hay que REpara el ScrollingBAr para porne rproductos en pormo 
import ContactForm from './assets/component/ContactForm' //funciona 
import Footer from './assets/component/Footer'//fundciona 
import AboutUsBlock from './assets/component/AboutUsBlock'//funciona
import DairyBrochure from './assets/component/DairyBrochure'//funciona




function App() {

  return (
    <>
      
      <h1>Hola</h1>
      
      <AboutUsBlock />
      <DairyBrochure />
      <ContactForm />
      
     <Footer />   
    </>
  )
}

export default App
