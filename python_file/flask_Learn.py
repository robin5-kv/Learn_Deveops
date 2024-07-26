from flask import Flask

app= Flask(__name__)
@app.route("/")
def basic_hello():

    return "hello world"

app.run('0.0.0.0',port=4000)