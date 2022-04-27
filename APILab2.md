* Submitting a request with the data contained within the request body. There are many forms of data, as well as various methods of transmitting data.

1. The response for https://postman-echo.com/basic-auth is 401 unauthorized.

2. The response for https://reqres.in/api/users is 200 OK with one list inside the data.

3. The response for https://reqres.in/api/users/3 is 200 OK with no list. The property keys are 7 which are: “id”,” email”,” first_name“, “ last_name”, “ avatar “, “ URL ”, and “ text”.

4. Deleted the user id 9 using the URL https://reqres.in/api/users/9 and the response is 204 No Content. The user in the URL https://reqres.in/api/users is 12. There was no trace of the deleted user record in the URL.

5. The response for https://reqres.in/api/users/40 is 404 Not Found. It only contains “{}” and no property inside the URL.

6. The response for https://reqres.in/api/users Verb: POST Request Body: is 201 Created. The available property(Key) names in the response body are "id": "534", "createdAt": "2022-04-26T22:06:25.467Z", "name": "yourname",  and  "job": "dreamjob". The response Header Etag is W/"33-Ih5b99RbhQWFWxxrrR0cJZC3ohk"

7. The response for https://reqres.in/api/login is 400 Bad Request and the response code is “error” : Missing password”.

8. The response for https://reqres.in/api/login is 200 OK with an etag W/"1d-lGCrvD6B7Qzk11+2C98+nGhhuec". With a response "token": "QpwL5tke4Pnpja7X4".

9. The response for https://swapi.dev/api/planets is 200 OK with 21 list of response body.

10. The response for https://swapi.dev/api/planets/3/ is 200 OK with 2 list and 14 property in the body.
*   "name": "Yavin IV",
*   "rotation_period": "24",
*    "orbital_period": "4818",
*   "diameter": "10200",
*   "climate": "temperate, tropical",
*   "gravity": "1 standard",
*    "terrain": "jungle, rainforests",
*    "surface_water": "8",
*    "population": "1000",
*    "residents": [],
*    "films":  "https://swapi.dev/api/films/1/"
*    "created": "2014-12-10T11:37:19.144000Z",
*    "edited": "2014-12-20T20:58:18.421000Z",
*    "url": "https://swapi.dev/api/planets/3/"

11. The response for https://swapi.dev/api/starships is 200 OK with 22 list on the current page.
* "count":
 * "next":
* "Previous"
 * "results":
 * "name":
* "model":
* "manufacturer":
* "cost_in_credits":
* "length":
 * "max_atmosphering_speed":  
* "Crew":
 * "Passengers":
 *"cargo_capacity":
* "consumables":
* "hyperdrive_rating":
* "MGLT":
 * "starship_class":
* "pilots":
* "Films":
* "created":
* "edited":
 * "url":

12. The response for https://swapi.dev/api/starships/9/ is 200 OK with 2 lists in the response body.

13. The response for https://swapi.dev/api/films is 200 OK with 31 list in the response body.
list all attributes and write their data types:
* String: 5
* Objects: 1
* Number(s): 2 
* Null: 2
* Array/list : 31

14. The response for https://swapi.dev/api/species is 200 OK with 21 lists including 1 parent list.

15. The response for https://restful-booker.herokuapp.com/booking is 200 OK with 1 list and 67 arrays. 

16. The response for https://restful-booker.herokuapp.com/booking/23 is 200 OK which contains the following:
* "firstname": "\"Emily\"",
*  "lastname": "\"Morin\"",
*   "totalprice": 522,
*   "depositpaid": true,
*   "bookingdates": {
*       "checkin": "2022-04-26",
*       "checkout": "2022-05-10"
*  },
*  "additionalneeds": "\"Late Checkout\"”
17. The response for https://restful-booker.herokuapp.com/booking/3 is 200 OK which contains the following:
* "firstname": "Susan",
*  "lastname": "Jackson",
*  "totalprice": 796,
*   "depositpaid": false,
*   "bookingdates": {
*       "checkin": "2017-12-02",
*       "checkout": "2020-01-22"
18. The response for https://jsonplaceholder.typicode.com/users is 200 OK which contains one list.

19. The response for https://swapi.dev/api/species is 200 OK which is 21 list in the response body.

20. Used the JSON pathfinder and entered the following codes:
 {
   "studio": {
      "movie": [
         {
            "category": "history",
            "director": "John",
            "title": "History",
            "rating": 6.60
         },
         {
            "category": "comedy",
            "director": "Paul",
            "title": "Laugh",
            "rating": 4.00
         },
         {
            "category": "fiction",
            "director": "Jack",
            "title": "Wake",
            "isbn": "87877676879",
            "rating": 8.01
         },
         {
            "category": "drama",
            "director": "Edward",
            "title": "Wuthering Heights",
            "isbn": "8754543578",
            "rating": 4.50
         }
      ],
      "music": {
         "song": "pale",
         "rate": 5.4
      }
   },
   "ranking": 20
}
* A. Studio, Movie, Music, and ranking
* B. Pale
* C. History - 6.6
Comedy - 4
Fiction - 8.01
Drama - 4.5
Pale - 5.4
* D. Categories - History, Comedy, Fiction, and Drama
Directors - John, Paul, Jack, and Edward
Titles - History, Laugh, Wake, and Wuthering Heights
Isbn - 87877676879 and 8754543578
Ratings  - 6.6, 4, 8.01, and 4.5
* E. Titles - History, Laugh, Wake, and Wuthering Heights
* F. Wake
* G. Drama
* H. Wake and Wuthering Heights

21. The response for http://dummy.restapiexample.com/api/v1/employees is 200 OK with one list in the body response. There are 5 available property(Key) names in the response body.
Number - "id": 2,
           * String - "employee_name": "Garrett Winters",
           * Number - "employee_salary": 170750,
           * Number - "employee_age": 63,String - "profile_image": ""
           
22. The response for http://dummy.restapiexample.com/api/v1/employee/3 is 200 OK with 5 datas in the response body.

23. The response for http://dummy.restapiexample.com/api/v1/create is 200 OK. The ID property is visible and the ID property is 7304.

24. The response for http://dummy.restapiexample.com/api/v1/delete/2 is 200 OK.
"status": "success",
  * "data": "2",
  *  "message": "Successfully! Record has been deleted"
There are still 24 employees on the list and there is no sign of deletion on the list.

25. The response for https://reqres.in/api/register is 400 Bad Request which contains the following: "error": "Note: Only defined users succeed registration"

26. The response for https://reqres.in/api/unknown/2 is 200 OK.

27. The response for https://restful-booker.herokuapp.com/ping is 201 Created which contains the following: Created

28. The response for https://reqres.in/api/users?delay=3 is 200 OK with a delayed response of 3 seconds.

29. The response for https://swapi.dev/api/vehicles/schema/ is 404 NOT FOUND which contains the following: "detail": "Not found"

30. The response for https://swapi.dev/api/starships/schema/ is 404 NOT FOUND which is the Client server's error. This contains the following: "detail": "Not found"



