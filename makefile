start:
	echo "Testing Loop:\n"
	echo "	Test PHP version:"
	php -v
	php -f php/loop.php
	node js/loop.js
	go run go/loop.go
	javac java/Loop.java
	cd java && 	java Loop

