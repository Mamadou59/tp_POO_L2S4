CC = javac
CCD = javadoc
src_dir = goosegame
class_dir = classes/goosegame


all :
	rm -rf classes
	mkdir classes
	cd src ; javac $(src_dir)/Main.java -d ../classes
	cd src ; javadoc -d ../docs -subpackages goosegame
	cd classes; jar cvfm ../goosegame.jar ../manifest-ex goosegame -C .. docs -C .. test



clean:
	rm -rf classes/goosegame/*.class
	rm -rf classes/goosegame/cell/*.class
