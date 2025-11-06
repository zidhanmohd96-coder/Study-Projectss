document.getElementById('generate').onclick = function() {
    const min = parseInt(document.getElementById('min').value);
    const max = parseInt(document.getElementById('max').value);
  
    
  
    const randomNumber = Math.floor(Math.random() * (max - min + 1)) + min;
    document.getElementById('randomNumber').textContent = randomNumber;
    document.getElementById('result').classList.remove   ('hidden');
  }