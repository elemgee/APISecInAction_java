# API Security in Action (Akka-http Java)
Code and documentation related to the Manning API Security In Action book (MEAP v01). The difference is using Akka-http instead of Spray for examples since Spray is EOL.

I've found the early release of API Security in Action by Neil Madden very helpful in articulating the details about why and how we secure API endpoints.  I have used Spray for projects in the past, but in investigating the current version, I noted that Spray is no longer maintained and has been succeeded by Akka-HTTP. I've been using Akka-HTTP on other projects, but I wanted to apply the patterns in the book to my understanding of APIs in general and Akka-HTTP specifically, so I set out to translate the content from Spray.io to Akka-HTTP. This repository is *ABSOLUTELY NOT* official or related in any way to Neil Madden or Manning Publishing. This is only for my own progress in understanding the issues that Neil writes about and how to apply that in my own environment. Also, since I work primarily in Scala these days, I thought it would be a useful exercise do do this translation to Scala and Java. My intention is that by looking at the process in two languages, I'll understand the process a bit better... either that or I'm just a glutton for punishment. Look for the assembly translation next ...

Any errors found here are my own and entirely unrelated to Neil Madden and Manning Publishing.


## Branches

### master
The master branch is the base at the begining of the code examples. This currently has the maven setup and database initialization through section 2.1.4 of the book


## Release Notes:

*2019-06-12*: This is the first release of the code and it only includes the basic maven setup and database initialization. This is the basis from which the chapters will be branched. The content here is through section 2.1.4 of the book.

There are some changes from the book code owing to my working in OpenJDK 1.8 (instead of Java 11) to support some legacy services that need a refresh. 





