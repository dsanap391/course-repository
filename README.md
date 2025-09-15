API Documentation

1. Entity Structure
Course Entity
Fields:
- id (Long)
- name (String)
- description (String)
- students (List<Student>)

Student Entity
Fields:
- id (Long)
- name (String)
- email (String)
- course (Course)

2. Entity Relationship (Mapping)
  Entity	    Relation Type	      Target      Entity	Description
  Course	    OneToMany	          Student	    One course can have many students
  Student	    ManyToOne	          Course	    Many students belong to one course

4. API Endpoints
Course APIs
1. POST /api/courses
   - Create a new course
   - Request Body: { "name": "Java", "description": "Backend course" }
   - Response: 201 Created

2. GET /api/courses
   - Get all courses
   - Response: 200 OK [{id, name, description} ........]

3. GET /api/courses/{id}
   - Get a course by ID
   - Response: 200 OK {id, name, description, students:[]}

4. PUT /api/courses/{id}
   - Update a course
   - Request Body: { "name": "Advanced Java", "description": "Updated course" }
   - Response: 200 OK

5. DELETE /api/courses/{id}
   - Delete a course by ID
   - Response: 204 No Content

Student APIs
1. POST /api/students
   - Create a new student and assign to course
   - Request Body: { "name": "Devansh Sanap", "email": "devansh.sanap25@gmail.com", "courseId": 1 }
   - Response: 201 Created

2. GET /api/students
   - Get all students
   - Response: 200 OK [{id, name, email, course}...........]

3. GET /api/students/{id}
   - Get a student by ID
   - Response: 200 OK {id, name, email, course}

4. PUT /api/students/{id}
   - Update a student
   - Request Body: { "name": "Datta Sanap", "email": "Datta.sanap@gmail.com", "courseId": 1 }
   - Response: 200 OK

5. DELETE /api/students/{id}
   - Delete a student by ID
   - Response: 204 No Content





