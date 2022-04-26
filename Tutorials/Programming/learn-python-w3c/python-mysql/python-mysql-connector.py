#!/usr/bin/env python3
# Demo of mysql connection


def main():

    mydb = mysql.connector.connect(
            host="localhost",
            user="test",
            password="test123"
        )   
    print(mydb)


if __name__ == "__main__":
    main()
