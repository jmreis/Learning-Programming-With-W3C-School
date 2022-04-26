#!/usr/bin/env python3
# Demo of mysql connection

mydb = mysql.connector.connect(
        host="localhost",
        user="test",
        password="test123"
    )
print(mydb)
