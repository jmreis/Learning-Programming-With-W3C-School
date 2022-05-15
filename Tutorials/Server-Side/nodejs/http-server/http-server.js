var http = require('http')

// Creating a server object
http.createServer(function (req, res) {
    res.write("Hello World") // Response for client
    res.end() // End the response
}).listen(8080) // Server listen on port 8080