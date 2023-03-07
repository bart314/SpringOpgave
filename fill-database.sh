# Aanmaken van vijf studenten

curl -X POST -d '{"name":"kareltje", "dob":"2010-05-01", "email":"kareltje@host.com"}' -H "Content-Type: application/json" http://localhost:8080/api/v1/student
curl -X POST -d '{"name":"Femke", "dob":"2011-02-12", "email":"femke@roos.nl"}' -H "Content-Type: application/json" http://localhost:8080/api/v1/student
curl -X POST -d '{"name":"Marit", "dob":"2013-05-11", "email":"marit@roos.nl"}' -H "Content-Type: application/json" http://localhost:8080/api/v1/student
curl -X POST -d '{"name":"Wietske", "dob":"2015-11-27", "email":"wietske@roos.nl"}' -H "Content-Type: application/json" http://localhost:8080/api/v1/student
curl -X POST -d '{"name":"Jan", "dob":"2011-02-11", "email":"jan@host.com"}' -H "Content-Type: application/json" http://localhost:8080/api/v1/student
curl -X POST -d '{"name":"Karel", "dob":"2010-04-13", "email":"kareltje@host.com"}' -H "Content-Type: application/json" http://localhost:8080/api/v1/student

#Aanmaken van vijf courses

curl -X POST -d '{"courseName":"Java en JPA"}' -H "Content-Type:application/json" http://localhost:8080/api/v1/course
curl -X POST -d '{"courseName":"ChatGPT en herten"}' -H "Content-Type:application/json" http://localhost:8080/api/v1/course
curl -X POST -d '{"courseName":"De rol van de esthetiek in het postmodernisme"}' -H "Content-Type:application/json" http://localhost:8080/api/v1/course
curl -X POST -d '{"courseName":"Discrete wiskunde en motoren"}' -H "Content-Type:application/json" http://localhost:8080/api/v1/course
curl -X POST -d '{"courseName":"Oliebollen in de middeleeuwen"}' -H "Content-Type:application/json" http://localhost:8080/api/v1/course


