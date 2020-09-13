1 create Pattern object :  Pattern.compile( pattern/reg exp)
2 create Matcher object :  pattern.match( target string)


-------------
Character class

[abc]                  either 'a' or 'b' or 'c'
[^abc]                 exept 'a', 'b' and 'c'
[a-z]                  any lower case alphabet symbol
[A-Z]                  any upper case alphabet symbol
[a-zA-Z]                     any alphabet symbol
[0-9]                  any digit from '0' to '9'
[a-zA-Z1-9]            any alpha numeric symbol
[^a-zA-Z1-9]           except  alpha numeric symbol (special character)
--------------
## Pre- Defined Character Classes:
\s     space character
\S     any character except space
\d     any digit form [0-9] 
\D     any character except digit
\w     any word character [any alpha numeric character] [a-zA-Z0-9]
\W     except word character (special character)
.      any symbol including special character also
---------------
## Quantifiers
we can use to specify number of occurrences to match

a     exactly one a
a+    at least one a
a*    any number of a's including zero number also
a?    at most one a   ==> 0 or one a
---------------
## Pattern class spilt method

