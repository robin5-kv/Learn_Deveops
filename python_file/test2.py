import requests as req

url_endpoint= "https://api.github.com/repos/robin5-kv/learning-java/commits"
response_1 =req.get(url_endpoint)
List_1 = response_1.json()
print(len(List_1))
for value in range(len(List_1)):
    print( "The date commited on my repository learinig java is" +List_1[value]["commit"]["author"]["date"])
print("completed")


####
