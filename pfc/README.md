			       	Author : Diallo Mamadou & Barry Mamadou

				PROJECT: TP6 pfc(pierre feuille ciseaux)

**************************************************************************************************

			     Présentation et Objectifs du TP

**************************************************************************************************
Ce TP pfc a pour objectif la gestion du jeux de pierre feuille ciseaux entre deux joueurs, un joueur dispose trois façons de choisir la forme à jouer et apès chaque tour il peut obtenir deux points si sa forme gagne sur celle du second, 0 pour ce dernier et un point pour chacun s'ils jouent tout les deux la même forme. 
Cette forme peut-être choisie aléatoirement, une seule forme jusqu'à la fin du jeux ou à chaque tour choisir sa forme depuis l'entrée standard.

**************************************************************************************************

			  	Generer La Documentation

**************************************************************************************************

pour  générer  la  documentation  du  paquetage pfc de tous ses sous-paquetages, se placer dans le dossier src et exécuter la commande suivante en supposant l'existence du dossier docs :
		
			“javadoc pfc pfc.strategy -d ../docs”

**************************************************************************************************

		 Les fichiers .java dans lesquels sont implémetées les classes

**************************************************************************************************
			 Pour la compilation des fichiers du paquetage pfc :

Se placer dans le dossier src et exécuter la commande suivante en supposant l'existence du dossier classes :

			javac pfc/ClassName.java -d ../classes	
			
EXEMPLE:
			javac pfc/GameMain.java -d ../classes

NB : ClassName.java : un fichier .java qui est du paquetage pfc et on peut evidement se contenter juste de la commande précedente pour compiler toutes les autres classes sauf celles des tests. 

Les classes FixedStart.java, InteractiveStart.java, RandomStrat.java et l'interface Strategy.java du paquetage strategy seront aussi compilées car elle sont importées dans au moins l'un des fichiers SomeFile.java. Sinon exécuter la commande :

			javac pfc/startegy/ClassName.java -d ../classes


NB : ici ClassName.java un fichier .java du paquetage pfc.strategy


**************************************************************************************************

					Les Tests

**************************************************************************************************
			   Pour la compilation d'un fichier de test:

Se placer à la racine du TP et en supposant l’existence du dossier classes exécuter la commande suivante :

		javac -d classes/ -cp test-1.7.jar:class -sourcepath src:test test/pfc/ClassTest.java
Ou celle-ci pour les tests dans le packetage strategy.
		javac -d classes/ -cp test-1.7.jar:class -sourcepath src:test test/pfc/strategy/ClassTest.java

NB: ClassTest.java doit être remplacer par 'PlayerTest.java', 'ShapeTest.java' ou 'StrategyTest.java' seule cette dernière se trouve dans le packetage strategy.

Remarque: Dans le dossier test une structure similaire du paquetage du dossier src est definie c'est à dire  que le test de la Player qui se trouve dans src/pfc se trouve dans test/pfc avec comme nom de Classe "PlayerTest".

Et pour voir la validité de ces tests sur junit vous pouvez utiliser la commande depuis la racine du TP:

		java -jar test-1.7.jar -cp test-1.7.jar:classes pfc.ClassTest
			
		java -jar test-1.7.jar -cp test-1.7.jar:classes pfc.strategy.ClassTest

NB: ClassTest est aussi a remplacé par 'PlayerTest', 'ShapeTest' ou 'StrategyTest' comme à la compilation.


**************************************************************************************************

				La Classe principale GameMain

**************************************************************************************************

Pour compiler la classe principale GameMain.java du paquetage pfc, se placer dans le dossier src et exécuter la commande suivante :

		javac pfc/GameMain.java -d ../classes

Pour son exécution, se placer à la racine du TP et exécuter les commandes suivantes  :
Sans paramètre avec cette commande on peut jouer par defaut à 5 tours et avec un nom defini par defaut.

		java -classpath classes pfc.GameMain 

Avec un second paramètre on peut jouer le nombre de tours qu'on veut avec toujours le même nom defini par defaut.

		java -classpath classes pfc.GameMain nbTour

NB: 'nbTour' est à remplacer par un entier.
Avec un troisième paramètre 'namePlayer' qui est à remplacer par un nom, on peut donc changer le nom "Mamadou" qui est celui par defaut.

		java -classpath classes pfc.GameMain nbTour namePlayer

**************************************************************************************************

					Création d'archive "jar"

**************************************************************************************************
Placez vous dans le dossier classes.  Exécutez la commande :

		jar cvf ../pfc.jar pfc io

Celle-ci crée l'archive pfc.jar et à la racine du TP vous pouvez consulter le contenue avec la commande :

		jar tvf pfc.jar

Assurez vous d'être à la racine du TP et utiliser les commandes suivantes pour son éxecution :

		java -classpath pfc.jar pfc.GameMain

Celle-ci pour definir soit même le nombre de tours à jouer 
		
		java -classpath pfc.jar pfc.GameMain nbTour

Et cette dernière pour en plus definir le nom du joueur

		java -classpath pfc.jar pfc.GameMain nbTour namePlayer

NB: Comme précement nbTour et namePlayer sont à remplacer.

**************************************************************************************************

					Création du Jar Exécutable

**************************************************************************************************
Le fichier manifest definit la classe GameMain du paquetage pfc.

En se plaçant dans le dossier classes, exécuter la commande :

		jar cvfm ../pfc.jar ../manifest-ex pfc io

cela crée la même archive pfc.jar en ajoutant les informations sur le fichier manifest.
Les informations sont stockées dans le fichier META-INF/MANIFEST.MF de l’archive.
Vous pouvez maintenant vous placez dans la racine du TP et consulter le contenue de cette archive par la commande:
	
		jar tvf pfc.jar
	
Assurez vous maintenant d'être bien à la racine du TP puis éxécuter la commande :

		java -jar pfc.jar 

Comme précedement vous pouvez choisir le nombre de tours à jouer et changer le nom du joueur testez les deux commandes l'une après l'autre en remplaçant 'nbTour' par un entier et namePlayer par un nom.

		java -jar pfc.jar nbTour
		java -jar pfc.jar nbTour namePlayer








