import React from 'react';

const AboutUsBlock = () => {
  const blockStyle = {
    backgroundImage: 'url("ruta_de_la_imagen.jpg")', // Reemplaza con la ruta correcta de tu imagen
    backgroundSize: 'cover',
    backgroundPosition: 'center',
    color: '#fff',
    padding: '50px',
    textAlign: 'center',
  };

  return (
    <div style={blockStyle}>
      <h2>Conoce Más de Nosotros</h2>
      <p>
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla
        facilisi. Curabitur imperdiet felis a eros cursus, vel interdum ipsum
        dictum.
      </p>
      {/* Puedes agregar más contenido según tus necesidades */}
    </div>
  );
};

export default AboutUsBlock;
