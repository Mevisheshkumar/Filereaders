NotesApp - Java FileWriter and FileReader Example This Java application demonstrates how to use FileWriter to write notes to a text file and BufferedReader with FileReader to read those notes from the file.

Features Write multiple lines of text to a file named notes.txt.

Read and display the contents of the file line-by-line.

Uses try-with-resources to handle file I/O safely.

🛠 Technologies Used Java SE (Standard Edition)

FileWriter and FileReader from java.io package

BufferedReader for efficient reading How It Works The program writes three lines of text to notes.txt.

It then reads the file using BufferedReader and prints each line to the console.

How to Run Make sure you have Java installed on your system.

Save the code in a file called NotesApp.java.

Open terminal or command prompt and compile the file:

bash Copy Edit javac NotesApp.java Run the program:

bash Copy Edit java NotesApp

Output Example sql Copy Edit Notes written to file successfully.

Reading notes from file: These are my Java notes. Java supports file I/O using FileWriter and FileReader. BufferedReader makes reading easier and faster. Notes The file notes.txt will be created in the same directory as the Java program.

If the file already exists, its content will be overwritten.
