package com.deneme.encryptioncommantionapplication.Classes

class RandomPasswordGenerator(
    containNumber: Boolean,
    containUppercaseLetter: Boolean,
    containLowercaseLetter: Boolean,
    passwordsLenght: Int
) {
    val containNumbers = containNumber;
    val containUppercaseLetter = containUppercaseLetter;
    val containLowercaseLetter = containLowercaseLetter;
    val passwordsLenght = passwordsLenght;

    val lowercaseLetters = ('a'..'z').toMutableList();
    val uppercaseLetters = ('A'..'Z').toMutableList();
    val numbers = ('0'..'9').toMutableList();


    private fun selectParameters(): MutableList<Char> {
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

    private fun randomID(): String =
        List(passwordsLenght) { selectParameters().random() }.joinToString("")


}
