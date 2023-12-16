SELECT m.cart_id
  FROM 
   (SELECT cart_id
      FROM cart_products
     WHERE name = 'Milk') m,
   (SELECT cart_id
      FROM cart_products
     WHERE name = 'Yogurt') y
 WHERE m.cart_id = y.cart_id;