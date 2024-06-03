
# Producer-Consumer Problem Solution

This project is a Java implementation of the producer-consumer problem using a shared print queue. The project includes multiple producer threads (representing computers adding print jobs) and consumer threads (representing printers processing print jobs).

## Table of Contents
- [Overview](#overview)
- [Structure](#structure)
- [Usage](#usage)
- [License](#license)

## Overview
The producer-consumer problem is a classic example of a multi-threading issue where synchronization is required to ensure that producers (computers) do not try to add print jobs to a full queue, and consumers (printers) do not try to remove print jobs from an empty queue.

## Structure
The project consists of the following classes:

- **SharedQueue**: A singleton class that represents the shared print queue with a fixed capacity.
- **Printer**: A runnable class that simulates a printer processing print jobs from the shared queue.
- **PrintJob**: A simple class that represents a print job with an ID.
- **Computer**: A runnable class that simulates a computer adding print jobs to the shared queue.
- **Main**: The main class that initializes and starts the producer and consumer threads.

## Usage
To run the project, compile all the Java files and run the `Main` class. The program will start two computer threads and three printer threads. The computers will prompt for job IDs to add to the print queue, and the printers will process these jobs.

### Compilation
```bash
javac SharedQueue.java Printer.java PrintJob.java Computer.java Main.java
```

### Execution
```bash
java Main
```

### Example
After starting the program, you will be prompted to enter job IDs for the computers to add to the queue. The printers will automatically process these jobs and print messages to the console.

## License
This project is licensed under the Creative Commons Zero v1.0 Universal. See the LICENSE file for more details.

## Contribution
Feel free to fork this repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.

## Contact
For any questions or inquiries, please open an issue in the repository.
