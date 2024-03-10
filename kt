<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>For ninotnot</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 50px;
        }
        #password-input {
            margin-top: 20px;
            padding: 10px;
            font-size: 16px;
        }
        #submit-btn {
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
        }
        #gif-container, #video-container {
            display: none;
            margin-top: 30px;
        }
    </style>
</head>
<body>
    <h1>For ninotnot</h1>

    <div id="password-form">
        <label for="password-input">Kode chromosome perempuan (type with uppercase):</label>
        <input type="password" id="password-input" placeholder="Enter password">
        <br>
        <button id="submit-btn" onclick="checkPassword()">Submit</button>
    </div>

    <div id="question-form" style="display: none;">
        <p>Apakah amanda baik hati dan tidak sombong?</p>
        <button id="yes-btn" onclick="showGif()">Yes</button>
        <button id="no-btn" onclick="endStory()">No</button>
    </div>

    <div id="answer-form" style="display: none;">
        <label for="answer">Sebuah kelapa memiliki massa 2 kg berada pada ketinggian 20 meter dengan gravitasi 10 ms, berapa energi potensialnya? (jawab angka aja gausah pake satuan)</label>
        <input type="text" id="answer-input" placeholder="Enter your answer">
        <br>
        <button id="submit-answer-btn" onclick="checkAnswer()">Submit</button>
    </div>

    <div id="gif-container">
        <img src="https://media.giphy.com/media/SwIMZUJE3ZPpHAfTC4/giphy.gif" alt="GIF">
        <br>
        <button id="tap-btn" onclick="showVideo()">Tap In</button>
    </div>

    <div id="video-container" style="display: none;">
        <iframe width="560" height="315" src="https://drive.google.com/file/d/1g-sC9LUr8Ozgh3F0MlVEBcVkZNuzI-cH/preview" frameborder="0" allowfullscreen></iframe>
    </div>

    <script>
        function checkPassword() {
            var passwordInput = document.getElementById("password-input").value.trim();

            if (passwordInput === "XX") {
                // Show the question form after entering the correct password
                document.getElementById("password-form").style.display = "none";
                document.getElementById("question-form").style.display = "block";
            } else {
                alert("Incorrect password. Please try again.");
            }
        }

        function checkAnswer() {
            var answerInput = document.getElementById("answer-input").value.trim();

            if (answerInput === "400") {
                // Show the gif container and tap button
                document.getElementById("answer-form").style.display = "none"; // Hide the answer form
                document.getElementById("gif-container").style.display = "block";
            } else {
                alert("Incorrect answer. Please try again.");
            }
        }

        function showGif() {
            // Show the answer form after entering the correct answer
            document.getElementById("question-form").style.display = "none";
            document.getElementById("answer-form").style.display = "block";
        }

        function showVideo() {
            // Show the video container after tapping
            document.getElementById("gif-container").style.display = "none";
            document.getElementById("video-container").style.display = "block";
        }

        function endStory() {
            alert("Oh, too bad! Maybe next time. Refresh the page to try again.");
        }
    </script>
</body>
</html>
