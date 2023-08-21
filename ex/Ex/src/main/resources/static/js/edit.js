
const changeButton = document.getElementById('changeButton');
const confirmButton = document.getElementById('confirmButton');
const output = document.getElementById('output');

let originalText = '';
let editedText = '';

editButton.addEventListener('click', () => {
  originalText = textInput.value;
  editedText = originalText;
  textInput.value = editedText;
  output.textContent = '';
});

changeButton.addEventListener('click', () => {
  editedText = editedText.toUpperCase();
  textInput.value = editedText;
  output.textContent = '';
});

confirmButton.addEventListener('click', () => {
  if (editedText.includes('CONDITION')) {
    output.textContent = 'Condition confirmed!';
  } else {
    output.textContent = '';
  }
});
