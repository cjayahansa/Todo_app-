

This is a basic **Todo Application** built with **Spring Boot** and a simple frontend. It allows users to manage tasks by adding, viewing, toggling completion, and deleting them.

---

## Features

- Add a new task.
- View all tasks.
- Mark tasks as completed or incomplete.
- Delete tasks.

---

## How to Use

### 1. **Clone the Project**
   ```bash
   git clone https://github.com/cjayahasa/simple-todo-app.git
   cd simple-todo-app
   ```

### 2. **Set Up the Database**
   - By default, the app uses **MySQL**.
   - Create a database named `todo_app` in MySQL.
   - Update the `application.properties` file in the `src/main/resources` folder with your database credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/todo_app
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     ```

### 3. **Build the Project**
   Use Maven to build the project:
   ```bash
   mvn clean install
   ```

---

## API Endpoints

| Method | URL               | Description                |
|--------|-------------------|----------------------------|
| GET    | `/api/tasks`      | Get all tasks              |
| POST   | `/api/tasks`      | Add a new task             |
| PUT    | `/api/tasks/{id}` | Toggle task completion     |
| DELETE | `/api/tasks/{id}` | Delete a task              |

---

## Example Request

### Add a Task (POST `/api/tasks`)
```json
{
  "title": "Buy groceries",
  "completed": false
}
```

---

## Frontend

- The frontend is a simple HTML/CSS/JavaScript interface.
- Open the `index.html` file in your browser to interact with the app.
- The frontend communicates with the backend using the API endpoints listed above.

## Screenshot

Here's what the app looks like:

![Todo App Screenshot](https://github.com/cjayahansa/Todo_app-/blob/main/Screenshot%202025-04-10%20120455.png)---
