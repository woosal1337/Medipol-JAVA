package com.company;

public class Main {
    public static void main(String[] args) {

        class PersonAddress {
            public String personName;
            public String personLastName;
            public String personMail;
            public String personNumber;


            public PersonAddress(String personName, String personLastName, String personMail, String personNumber){
                this.personName = personName;
                this.personLastName = personLastName;
                this.personMail = personMail;
                this.personNumber = personNumber;
            }

            public String getpersonName() {
                return personName;
            }

            public String getpersonLastName() {
                return personLastName;
            }

            public String getpersonMail() {
                return personMail;
            }

            public String getpersonNumber() {
                return personNumber;
            }


            public void setpersonName(String personName) {
                this.personName = personName;
            }

            public void setpersonLastName(String personLastName) {
                this.personLastName = personLastName;
            }

            public void setpersonMail(String personMail) {
                this.personMail = personMail;
            }

            public void setpersonNumber(String personNumber) {
                this.personNumber = personNumber;
            }
        }

        

    }
}
