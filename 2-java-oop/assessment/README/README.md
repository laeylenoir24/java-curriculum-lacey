#Shopping Cart#

##Display Menu
- displayMenu()
  - print menu heading
  - print display option
- if cart is not empty:
  - print remove item
  - print add discount
  - print checkout
- else:
  - print cannot remove, cart empty
  - print add discount
  - cannot checkout, cart empty
-print exit

##Display Cart
- handleDisplayCart(cart)
  - print cart heading
- if cart is empty:
  - print empty cart message
- else:
  - for each item in cart:
    - print itemName + itemCount + itemPrice

- total = cart.getTotal()
  - print total message
- if cart has discount:
  - print discount applied message

##Add an item
- handleAddItem(inventory, cart)
  - print items header
- for each item available:
  - print itemName + itemPrice + inStock
- prompt for item to add
- if item is null:
  - print item not found message
  - return
- if inStock = false:
  - print out of stock message
- prompt for quantity
- if quantity > inventory:
  - print not enough message
  - return
- print quantity + itemName + added

##Remove an item
- handleRemoveItem(cart, inventory)
  - print remove message
- if cart is empty:
  - print empty cart message
  - return
- for each item in cart:
  - print itemName + itemCount + itemPrice
- prompt for itemName
- if item is null:
  - print item not found
  - return
- prompt quantity to remove
- if quantityToRemove > quantityInCart:
  - print input higher than cart quantity
  - return
- print quantityToRemove + itemName removed from cart

##Rewards Program Discount
- handleApplyDiscount(cart)
- if activeDiscount is !null:
  - print discount already applied
  - print only one discount allowed
  - return
- print discount header
- print percent off option
- print BOGO option
- print cancel option
- prompt discount choice
- if choice == 1:
  - discount = percentage discount
- else if choice == 2:
  - discount = BOGO
- else if choice == 3:
  - print no discount applied
  - return
- else:
  - print invalid input message
  - return
- print discount applied message

##Checkout
- handleCheckout(cart)
- if cart is empty:
  - print cannot checkout
  - return
- print receipt heading
- subtotal = 0 
- lineTotal = itemCount * itemPrice
- print lineTotal
- subtotal += lineTotal
- print subtotal
- print total due

##Exit
- exitProgram()
- print thank you message
- exit