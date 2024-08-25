# Password Strength Checker

This project is a Java-based password strength checker that uses a graphical user interface (GUI) built with AWT. The application evaluates the strength of passwords based on various criteria such as length, use of uppercase and lowercase letters, numbers, and special characters. The program provides feedback on the strength of the password, ranging from "Weak" to "Very Strong".

## Features

- **Password Length Check**: Ensures that the password meets a minimum length requirement.
- **Character Variety Check**: Evaluates the use of uppercase letters, lowercase letters, numbers, and special characters.
- **Feedback System**: Provides a rating for the password, ranging from "Weak" to "Very Strong".
- **AWT-Based GUI**: User-friendly graphical interface for entering passwords and viewing feedback.

## Requirements

- Java 19 or higher

## Usage

1. Launch the application, and a GUI window will appear.
2. Enter your password in the input field provided.
3. The application will evaluate the password based on the following criteria:
    - Length (minimum 8 characters recommended)
    - Use of both uppercase and lowercase letters
    - Inclusion of numbers
    - Inclusion of special characters (e.g., `!@#$%^&*`)
4. The program will then display a strength rating in the GUI:
    - **Weak**: Password is too short and lacks variety in character types.
    - **Moderate**: Password meets some criteria but could be stronger.
    - **Strong**: Password meets most criteria.
    - **Very Strong**: Password meets all criteria and is highly secure.

## Example

After entering a password like `P@ssw0rd!` in the GUI:

- **Password Strength**: Is A Valid

## Contributing

1. Fork the repository.
2. Create a new branch: `git checkout -b feature-branch-name`
3. Make your changes and commit them: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin feature-branch-name`
5. Submit a pull request.

## Contact

For any inquiries or issues, feel free to reach out:
- GitHub: [m-musona](https://github.com/m-musona)
