# Parents Evening Organiser Application

Welcome to the Parents Evening Organiser (PEO) system, designed for managing parents' evenings in schools. This Java-based application simplifies the scheduling and conducting of meetings between teachers and parents, with a focus on functionality, user experience, and system organization.

## Project Overview
The PEO system facilitates seamless interaction for administrators, teachers, and parents through distinct interfaces:
- AdministratorScreen: Allows school administrators to set up the system, manage teacher and parent details, and view meeting logs.
- TeacherScreen: Provides teachers with tools to set their availability, manage appointments, and conduct virtual meetings with parents.
- ParentScreen: Enables parents to book appointments with teachers, receive notifications, and participate in scheduled meetings with teachers.
The system simulates a real-time environment without persistent storage, using simulated video-conferencing capabilities for online meetings.

## Key Features
- Role-based Interfaces: Administrator, Teacher, and Parent interfaces tailored for specific user roles.
- Appointment Management: Booking, viewing, and canceling appointments for parents; managing availability for teachers.
- Meeting Simulation: Simulated video-conferencing for virtual meetings between parents and teachers.
- State Management: System transitions through states from Dormant to ParentsEveningOn, following specific timelines for booking, meeting preparation, and conducting parents' evenings.

## License
This project is licensed under the [MIT License](./LICENSE.txt).
