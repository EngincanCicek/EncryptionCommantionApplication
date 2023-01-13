package com.deneme.encryptioncommantionapplication.Classes

class RandomPasswordGenerator(
    containNumber: Boolean,
    containUppercaseLetter: Boolean,
    containLowercaseLetter: Boolean,
    passwordsLenght: Int
) {
    // Random password generation class. The parameters in it are about how many characters
    // the password will have and what kind of characters it will consist of.

    val containNumbers = containNumber;
    val containUppercaseLetter = containUppercaseLetter;
    val containLowercaseLetter = containLowercaseLetter;
    val passwordsLenght = passwordsLenght;

    val lowercaseLetters = ('a'..'z').toMutableList();
    val uppercaseLetters = ('A'..'Z').toMutableList();
    val numbers = ('0'..'9').toMutableList();


    private fun selectParameters(): MutableList<Char> {
        // This method adds user selected options
        val selectedCharArray = mutableListOf<Char>();

        if (containNumbers) {
            selectedCharArray.addAll(numbers);
        }
        if (containUppercaseLetter) {
            selectedCharArray.addAll(uppercaseLetters);

        }
        if (containLowercaseLetter) {
            selectedCharArray.addAll(lowercaseLetters);

        }
        return selectedCharArray;

    }

    fun randomID(): String =
        List(passwordsLenght) { selectParameters().random() }.joinToString("");
    // This method return the password last



}
