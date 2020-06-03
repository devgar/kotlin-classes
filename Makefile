

run:    o.jar
	java -jar o.jar

build:  o.jar
o.jar:  main.kt
	kotlinc main.kt -include-runtime -d o.jar

clean:
	rm *.jar
