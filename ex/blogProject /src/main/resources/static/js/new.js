const saveButton = document.getElementById('save');
const backButton = document.getElementById('back');

saveButton.addEventListener('click', (event) => {
    event.preventDefault();

    const title = document.getElementById('title').value;
    const date = document.getElementById('date').value;
    const category = document.getElementById('category').value;
    const image = document.getElementById('image').value;
    const details = document.getElementById('details').value;

    if (title.trim() === '' || date === '' || category.trim() === '' || details.trim() === '') {
        alert('必須項目を記入してください');
    } else {
        // ここでメモの内容を保存する処理を追加できます
        alert('メモが保存されました！');
    }
});

backButton.addEventListener('click', () => {
    // メモ一覧などに戻る処理を追加できます
    alert('戻る');
});