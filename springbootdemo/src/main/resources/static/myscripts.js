
   const baseUrl = "http://localhost:8080/products";

   // Add Product
   document.getElementById("addForm").onsubmit = 
   function(e) {
       e.preventDefault(); //Calling preventDefault() during any stage of event flow cancels the event, 
	   					   //meaning that any default action normally taken by the implementation as a result of the event will not occur.
       const id = document.getElementById("addId").value;
       const name = document.getElementById("addName").value;
       const price = document.getElementById("addPrice").value;

       fetch(baseUrl, {
           method: "POST",
           headers: { "Content-Type": "application/json" },
           body: JSON.stringify({ id, name, price })
       }).then(() => alert("Product Added!"));
   };

   // Update Product
   document.getElementById("updateForm").onsubmit = function(e) {
       e.preventDefault();
       const id = document.getElementById("updateId").value;
       const name = document.getElementById("updateName").value;
       const price = document.getElementById("updatePrice").value;

       fetch(`${baseUrl}/${id}`, {
           method: "PUT",
           headers: { "Content-Type": "application/json" },
           body: JSON.stringify({ name, price })
       }).then(() => alert("Product Updated!"));
   };

   // Delete Product
   document.getElementById("deleteForm").onsubmit = function(e) {
       e.preventDefault();
       const id = document.getElementById("deleteId").value;

       fetch(`${baseUrl}/${id}`, {
           method: "DELETE"
       }).then(() => alert("Product Deleted!"));
   };

   function getAllProducts() {
       fetch(baseUrl)
           .then(response => response.json())
           .then(data => {
               const tableBody = document.getElementById("productTableBody");
               tableBody.innerHTML = "";

               if (data.length === 0) {
                   tableBody.innerHTML = `<tr><td colspan="3" class="text-muted">No products found.</td></tr>`;
                   return;
               }

               data.forEach(product => {
                   const row = document.createElement("tr");
                   row.innerHTML = `
                       <td>${product.id}</td>
                       <td>${product.name}</td>
                       <td>₹${product.price}</td>
                   `;
                   tableBody.appendChild(row);
               });
           });
   }

   
   