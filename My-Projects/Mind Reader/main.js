document.getElementById('mybtn').onclick = function() {
   const inputArea = document.getElementById('inputArea');
   const loadingArea = document.getElementById('loadingArea');
   const output = document.getElementById('output');
   const retryBtn = document.getElementById('retryBtn');
 
   // Hide input area and show loading area
   inputArea.classList.add('hidden');
   loadingArea.classList.remove('hidden');
 
   setTimeout(() => {
     // After 2 seconds, hide loading and show the output
     const number = document.getElementById('myinput').value;
 
     loadingArea.classList.add('hidden');
     output.textContent = `You thought of: ${number}`;
     output.classList.remove('hidden');
     output.classList.add('show');
     retryBtn.classList.remove('hidden');
   }, 2000); // 2 seconds delay to simulate loading
 }
 
 document.getElementById('retryBtn').onclick = function() {
   const inputArea = document.getElementById('inputArea');
   const output = document.getElementById('output');
   const retryBtn = document.getElementById('retryBtn');
 
   // Hide output and retry button, show input area
   output.classList.remove('show');
   output.classList.add('hidden');
   retryBtn.classList.add('hidden');
   inputArea.classList.remove('hidden');
 }