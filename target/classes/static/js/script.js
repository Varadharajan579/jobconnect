// Add a confirmation popup before submitting
document.addEventListener("DOMContentLoaded", function () {
    const form = document.querySelector("form");
    if (form) {
        form.addEventListener("submit", function (event) {
            const confirmed = confirm("Are you sure you want to submit this form?");
            if (!confirmed) {
                event.preventDefault(); // Stop submission
            }
        });
    }
});
