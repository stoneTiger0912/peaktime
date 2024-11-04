const { contextBridge, ipcRenderer } = require("electron");

contextBridge.exposeInMainWorld("electronAPI", {
  sendWebSocketMessage: (message) =>
    ipcRenderer.send("websocket-message", message),
  onWebSocketMessage: (callback) =>
    ipcRenderer.on("websocket-message", (event, message) => callback(message)),
});
