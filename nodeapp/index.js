const express = require("express");
const app = express();
const port = 9000;

app.get("/", (req, res) => {
    res.send("Hello World!");
});

app.get("/audio", (req, res) => {
    res.send("Audio");
});

app.get("/video", (req, res) => {
    console.log("[video] ")
    res.send(404)
    res.send({ data: "Video", quality: "poor" });
});

app.get("/chat", (req, res) => {
    res.send("Chat");
});

app.listen(port, () => {
    console.log(`Example app listening on port ${port}`);
});