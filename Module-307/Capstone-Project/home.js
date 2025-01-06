
const grid = document.querySelector('.js-products-grid');
const wishlistQuantity = document.querySelector('.js-wishlist-quantity');
const cartQuantity = document.querySelector('.js-cart-quantity');

let productsHTML = '';
products.forEach((product) => {
   productsHTML += `
    <div class="product-container">
          
          <button class="fav-btn js-fav-btn" data-product-id="${product.id}">
            <i class="bi bi-heart"></i>
          </button>
          <div class="product-image-container">
            <img class="product-image"
              src="${product.image}">
            
          </div>

          <div class="product-name limit-text-to-2-lines">
            ${product.name}
          </div>

          <div class="product-rating-container">
            <img class="product-rating-stars"
              src="images/ratings/rating-${product.rating.stars * 10}.png">
            <div class="product-rating-count link-primary">
              ${product.rating.count}
            </div>
          </div>

          <div class="product-price">
            $${(product.priceCents / 100).toFixed(2)}
          </div>

          <div class="product-quantity-container">
            <select class = "js-num" data-product-id="${product.id}">
              <option selected value="1">1</option>
              <option value="2">2</option>
              <option value="3">3</option>
              <option value="4">4</option>
              <option value="5">5</option>
              <option value="6">6</option>
              <option value="7">7</option>
              <option value="8">8</option>
              <option value="9">9</option>
              <option value="10">10</option>
            </select>
          </div>

          <div class="product-spacer"></div>

          <div class="added-to-cart">
            <img src="images/icons/checkmark.png">
            Added
          </div>

          <button class="add-to-cart-button button-primary js-add-to-cart"
          data-product-id="${product.id}">
            Add to Cart
          </button>

    </div>`; 
});
grid.innerHTML = productsHTML;
document.querySelectorAll('.js-add-to-cart').forEach((button) => {
  button.addEventListener('click', () => {
    let currentQuantity = 0;
    const productId = button.dataset.productId;
    let matchingItem;
    const numList  = document.querySelectorAll('.js-num');
    numList.forEach((node) =>{
      if(node.dataset.productId === productId){
         currentQuantity = node.value ;
      }
    });
    cart.forEach((item) => {
      if(productId === item.productId){
        matchingItem = item;
      }
    });
    if(matchingItem){
      matchingItem.quantity += Number(currentQuantity);
    }else{
      cart.push({
        productId: productId,
        quantity: Number(currentQuantity),
      });
    } 
    let totalQuantity = 0;
    cart.forEach((item) => {
      totalQuantity += Number(item.quantity);
    });
    cartQuantity.innerHTML = totalQuantity;
    // console.log('# of items in a cart: ' + totalQuantity);
    // console.log(cart);
    // console.log("currentQuantity selected is  =  " + currentQuantity);
    
  });
  
});
document.querySelectorAll('.js-fav-btn').forEach((button) => {
  button.addEventListener('click', () => {

    const productId = button.dataset.productId;
          
    if(wishlist.includes(productId)){
     wishlist.pop(productId);
      button.innerHTML = `<i class="bi bi-heart"></i>`;
      wishlistQuantity.innerHTML = wishlist.length;
    }else{
      wishlist.push(productId);
      button.innerHTML = `<i class="bi bi-heart-fill"></i>`;
      wishlistQuantity.innerHTML = wishlist.length;

    } 
    
    // document.querySelector('.js-cart-quantity').innerHTML = totalQuantity;
    // console.log('# of items in a cart: ' + totalQuantity);
    console.log(wishlist);
  });
  
});