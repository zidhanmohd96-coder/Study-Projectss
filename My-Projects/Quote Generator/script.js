const quotes = [
    { text: "The only way to do great work is to love what you do.", author: "Steve Jobs" },
    { text: "Life is what happens when you're busy making other plans.", author: "John Lennon" },
    { text: "In the end, it's not the years in your life that count. It's the life in your years.", author: "Abraham Lincoln" },
    // Add more quotes as needed
  ];
  
  let savedQuotes = [];
  
  function generateQuote() {
    const quoteText = document.getElementById('quoteText');
    const quoteAuthor = document.getElementById('quoteAuthor');
  
    const randomIndex = Math.floor(Math.random() * quotes.length);
    const randomQuote = quotes[randomIndex];
  
    quoteText.textContent = randomQuote.text;
    quoteAuthor.textContent = `- ${randomQuote.author}`;
  }
  
  function saveQuote() {
    const quoteText = document.getElementById('quoteText').textContent;
    const quoteAuthor = document.getElementById('quoteAuthor').textContent;
  
    if (quoteText && quoteAuthor) {
      savedQuotes.push({ text: quoteText, author: quoteAuthor });
      alert('Quote saved!');
    } else {
      alert('No quote to save!');
    }
  }
  
  function shareQuote() {
    const quoteText = document.getElementById('quoteText').textContent;
    const quoteAuthor = document.getElementById('quoteAuthor').textContent;
  
    if (quoteText && quoteAuthor) {
      const shareText = `"${quoteText}" ${quoteAuthor}`;
      navigator.clipboard.writeText(shareText).then(() => {
        alert('Quote copied to clipboard!');
      });
    } else {
      alert('No quote to share!');
    }
  }
  
  function showSavedQuotes() {
    const savedQuotesContainer = document.getElementById('savedQuotesContainer');
    const savedQuotesList = document.getElementById('savedQuotesList');
  
    savedQuotesList.innerHTML = '';
    savedQuotes.forEach(quote => {
      const li = document.createElement('li');
      li.textContent = `"${quote.text}" ${quote.author}`;
      savedQuotesList.appendChild(li);
    });
  
    savedQuotesContainer.style.display = 'block';
  }
  
  document.getElementById('homeIcon').addEventListener('click', () => {
    document.querySelector('.container').style.display = 'block';
    document.getElementById('savedQuotesContainer').style.display = 'none';
  });
  
  document.getElementById('savedQuotesIcon').addEventListener('click', () => {
    document.querySelector('.container').style.display = 'none';
    showSavedQuotes();
  });
  
  document.getElementById('saveButton').addEventListener('click', saveQuote);
  document.getElementById('shareButton').addEventListener('click', shareQuote);