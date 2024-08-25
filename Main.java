class Main
{
    public static void main(String[] args) {

        PasswordChecker pChecker = new PasswordChecker();
        GUI pCheckerGUI = new GUI(pChecker);
        // Set the frame to be visible
        pCheckerGUI.setVisible(true);
    }
}