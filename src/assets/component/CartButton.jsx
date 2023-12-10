import React, { useState } from 'react';
import '../css/CartButton'// Ajusta r el css para que funcione

const CartButton = () => {
  const [cartItems, setCartItems] = useState([]); // Puedes mantener los elementos del carrito en el estado

  const handleAddToCart = (item) => {
    setCartItems([...cartItems, item]);
  };

  const handleRemoveFromCart = (index) => {
    const updatedCart = [...cartItems];
    updatedCart.splice(index, 1);
    setCartItems(updatedCart);
  };

  return (
    <div className="cart-button-container">
      <button className="cart-button">Carrito ({cartItems.length})</button>
      {cartItems.length > 0 && (
        <div className="cart-dropdown">
          <ul>
            {cartItems.map((item, index) => (
              <li key={index}>
                {item.name} - <span onClick={() => handleRemoveFromCart(index)}>Eliminar</span>
              </li>
            ))}
          </ul>
        </div>
      )}
    </div>
  );
};

export default CartButton;
