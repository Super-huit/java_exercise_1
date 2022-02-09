chmod 751 src
chmod 751 bin
cd src
chmod 751 HelloWorld.java
cd ..
javac -d bin $(find ./src/ -type f -name '*.java')
java -cp bin HelloWorld