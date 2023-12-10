import React from 'react';
 // Ajusta el nombre del archivo CSS según tu preferencia

const DairyBrochure = () => {
  return (
    <div className="dairy-brochure">
      <h2>Clasificaciones de Productos Lácteos</h2>
      <div className="dairy-section">
        <h3>Leche</h3>
        <p>Encuentra nuestra variedad de leches frescas y nutritivas.</p>
      </div>
      <div className="dairy-section">
        <h3>Quesos</h3>
        <p>Explora una amplia selección de quesos, desde suaves hasta intensos.</p>
      </div>
      <div className="dairy-section">
        <h3>Yogures</h3>
        <p>Descubre yogures con sabores deliciosos y opciones saludables.</p>
      </div>
      {/* Puedes agregar más secciones según tus clasificaciones */}
    </div>
  );
};

export default DairyBrochure;
