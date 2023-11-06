const endpoint = 'http://localhost:8055/channels?page=0';
// const url = new URL("http://localhost:8055/channels?page=0");

fetch('http://localhost:8055/channels?page=0')
  .then(response => response.json()) // Extract JSON data from the response
  .then(datae => console.log(datae)) // Log the extracted data
  .catch(error => console.log(error)); // Handle any errors that occur during the fetch