# HKAselenium-login-automation

This repository contains a simple Selenium-based Java script for automating the login process on a demo website. The script tests the login functionality using invalid credentials and verifies the resulting error message. This project is designed as a basic introduction to Selenium WebDriver for automating web applications.

A. Features

        - Automates the process of launching a Chrome browser.
        - Navigates to the specified login page.
        - Inputs invalid credentials into the login form.
        - Submits the form and retrieves the error message.
        - Outputs the error message to the console for verification.
        - Closes the browser upon completion.

B. Requirements

        To run this script, ensure you have the following:

               1. **Java Development Kit (JDK)**: Version 8 or later.
               2. **Eclipse IDE**: Or any other Java IDE for development.
               3. **Selenium WebDriver**: Compatible with your browser version.
               4. **Google Chrome**: Installed on your system.
               5. **ChromeDriver**: Matches the version of Chrome installed on your system.

C. Setup

        C.1. Clone this repository to your local machine:
                ```bash
                     git clone https://github.com/yourusername/LoginAutomation.git
        C.2. Open the project in your IDE.
        C.3. Download the appropriate version of ChromeDriver for your operating system from the official site.
        C.4. Update the path to ChromeDriver in the script:
              System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        C.5. Add Selenium WebDriver JAR files to your project build path.

D. How to Run

        D.1. Open your terminal or IDE.
        D.2. Navigate to the LoginAutomation class.
        D.3. Run the script.
        D.4. Observe the error message printed in the console output.

E. Script Description

       The script is located in the packageLoginAutomation package and performs the following steps:

           E.1. Launches the Chrome browser.
           E.2. Navigates to the demo login page: Expand Testing Login.
           E.3. Maximizes the browser window.
           E.4. Fills in invalid credentials:
                   - Username: invalid username
                   - Password: invalidpassword
           E.5. Submits the login form.
           E.6. Retrieves and prints the error message displayed on the page.
           E.7. Closes the browser.

F. Sample Output

       Upon running the script, the console will display an error message similar to:
            - Error Message: Your login credentials are invalid. Please try again.

G. Repository Structure

           LoginAutomation/
           ├── src/
           │   └── packageLoginAutomation/
           │       └── LoginAutomation.java
           ├── server/
           │   └── chromedriver.exe
           └── README.md

H. Troubleshooting

       H.1. Ensure that the chromedriver.exe path is correctly set in the script.
       H.2. Verify that your ChromeDriver version matches your Google Chrome version.
       H.3. Make sure the website URL is accessible and not blocked by your network or firewall.

I. Contributing

      Contributions are welcome! Feel free to fork this repository, submit pull requests, or open issues for improvements.

      
