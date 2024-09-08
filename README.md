# Chat Room

## Overview
**Chat Room** is a real-time chat application built using Spring Boot, HTML, Bootstrap, WebSockets, and JavaScript. The application allows users to communicate with each other through an interactive and dynamic chat interface.

## Features
- Real-time messaging using WebSockets.
- User-friendly interface built with Bootstrap.
- Lightweight and scalable backend powered by Spring Boot.
- Responsive design for seamless use on various devices.
- Instant message broadcasting without page refresh.
  
## Technologies Used
- **Backend**: Spring Boot (Java)
- **Frontend**: HTML5, CSS3, Bootstrap
- **Real-time communication**: WebSockets
- **Client-side scripting**: JavaScript

## Installation

### Prerequisites
Before you begin, ensure you have met the following requirements:
- Java 8 or later
- Maven 3.6+
- A web browser

### Steps to Run the Application
1. **Clone the repository:**
   ```bash
   git clone https://github.com/Pankaj726655/Chatroom.git
   ```

2. **Navigate to the project directory:**
   ```bash
   cd chat-room
   ```

3. **Build the project:**
   ```bash
   mvn clean install
   ```

4. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

5. Open your browser and go to `http://localhost:9090` to start the chat (You can change it by editing application.properties file).

## Usage
1. Enter your name in the chat box.
2. Start sending messages to the chat room.
3. All users connected to the chat room will receive the messages instantly.

## Future Improvements
- User authentication.
- Private messaging.
- Support for emojis and media sharing.

## Contributing
Feel free to fork this repository, raise issues, or submit pull requests. Contributions are always welcome!
