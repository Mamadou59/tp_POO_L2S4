			       	Author : Diallo Mamadou and Barry Mamadou
				PROJECT: TP5 battleship

**************************************************************************************************

			     Présentation et Objectifs du TP

**************************************************************************************************
Ce TP batailleNavale a pour objectif la gestion d'un jeu présenté sous forme de plateau représenté par une grille rectangulaire pouvant contenir des navires à faire couler.
Les bateaux sont larges d’une case et longs d’un nombre variable de cases (tout de depend de on nombre de points de vie). Ils peuvent être posés verticalement ou horizontalement sur le plateau.

Des navires ne peuvent se chevaucher mais peuvent se suivre voire se toucher.
Ces contraintes sont gérées par les différentes methodes (levant des exceptions si necessaire) présentées dans les différentes classes .

**************************************************************************************************

			  	Generer La Documentation

**************************************************************************************************

pour  générer  la  documentation  du  paquetage battleship de tous ses sous-paquetages, se placer dans le dossier src et exécuter la commande suivante en supposant l'existence du dossier docs :
		
			“javadoc battleship battleship.util -d ../docs”

**************************************************************************************************

		 Les fichiers .java dans lesquels sont implémenés les classes

**************************************************************************************************
			   Pour la compilation des fichiers du paquetage battlship :

Se placer dans le dossier src et exécuter la commande suivante en supposant l'existence du dossier classes :

			javac battleship/ClassName.java -d ../classes	
			
EXEMPLE:
			javac battleship/GameMain.java -d ../classes

NB : ClassName.java : un fichier .java qui est du paquetage battleship

Les classes Position.java et Cell.java du paquetage util seront aussi compilées car elle sont importées dans au moins l'un des fichiers SomeFile.java. Sinon exécuter la commande :

			javac battleship/util/ClassName.java -d ../classes


NB : ici ClassName.java un fichier .java du paquetage battleship.util


**************************************************************************************************

					Les Tests

**************************************************************************************************
			   Pour la compilation d'un fichier de test:

Se placer à la racine du TP et en supposant l’existence du dossier classes exécuter la commande suivante :

			javac -d classes/ -cp test-1.7.jar:class -sourcepath src:test test/battleship/util/CellTest.java

Remarque: Dans le dossier test une structure similaire du paquetage du dossier src est definie c'est à dire  que le test de la classe Cell qui se trouve dans src/battleship/util se trouve dans test/battleship/util avec comme nom de Classe "CellTest".

Et pour voir la validité de ces tests sur junit vous pouvez utiliser la commande depuis la racine du TP:
			
			java -jar test-1.7.jar -cp test-1.7.jar:classes battleship.util.CellTest


**************************************************************************************************

				La Classe principale GameMain

**************************************************************************************************

Pour compiler la classe principale GameMain.java du paquetage battleship, se placer dans le dossier src et exécuter la commande suivante :

			javac battleship/GameMain.java -d ../classes

Pour son exécution, se placer à la racine du TP et exécuter la commande suivante  :

			java -classpath classes battleship.GameMain 

**************************************************************************************************

					Création d'archive "jar"

**************************************************************************************************
Placez vous dans le dossier classes.  Exécutez la commande :

				jar cvf ../battleship.jar battleship io
Crée l'archive battleship.jar et à  la racine du TP vous pouvez consulter le contenue avec la commande :

		jar tvf battleship.jar

Assurez vous d'être à la racine du TP et utiliser la commande suivante pour son éxecution :

		java -classpath battleship.jar battleship.GameMain


**************************************************************************************************

					Création du Jar Exécutable

**************************************************************************************************
Le fichier manifest definit la classe GameMain du paquetage battleship.

En se plaçant dans le dossier classes, exécuter la commande :

		jar cvfm ../battleship.jar ../manifest-ex battleship io

cela crée la même archive battleship.jar en ajoutant les informations sur le fichier manifest.
Les informations sont stockées dans le fichier META-INF/MANIFEST.MF de l’archive.
Vous pouvez maintenant vous placez dans la racine du TP et consulter le contenue de cette archive par la commande:
	
		jar tvf battleship.jar
	
Assurez vous maintenant d'être bien à la racine du TP puis éxécuter la commande :

		java -jar battleship.jar







