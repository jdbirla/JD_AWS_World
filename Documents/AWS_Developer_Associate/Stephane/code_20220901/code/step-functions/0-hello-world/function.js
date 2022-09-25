exports.handler = (event, context, callback) => {
    callback(null, "Hello, " + event.who + "!");
};