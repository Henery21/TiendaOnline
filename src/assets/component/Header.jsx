import React from 'react';
// hay que hacer bien el css de  este por que esta mal el qeu yo tengo 

const Header = () => {
  return (
    <header>
      <div className="header-content">
        <div className="logo-section">
          <img src={viteLogo} alt="Vite logo" className="logo" />
          <img src={reactLogo} alt="React logo" className="logo react" />
        </div>
        <div className="links-section">
          <nav>
            <ul>
              <li>
                <a href="/">Inicio</a>
              </li>
              <li>
                <a href="/productos">Productos</a>
              </li>
              <li>
                <a href="/contacto">Contacto</a>
              </li>
              {/* Agrega más enlaces según tus necesidades */}
            </ul>
          </nav>
        </div>
        <div className="login-section">
          <a href="/login">Login</a>
        </div>
      </div>
    </header>
  );
};

export default Header;