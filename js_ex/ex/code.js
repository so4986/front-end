const labelElement = document.getElementById("text-result");
let value = 0;
function updateLabel() {
    labelElement.textContent = `値：${value}`;
}
document.getElementById("change-text1").addEventListener("click", () => {
    value = 0;
    updateLabel();
});
document.getElementById("change-text2").addEventListener("click", () => {
    value += 1;
    updateLabel();
});
document.getElementById("change-text3").addEventListener("click", () => {
    value -= 1;
    updateLabel();
});
updateLabel();