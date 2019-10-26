			       	
Author: * Barry Mamadou & Diallo Mamadou*
-----------------------------------------

PROJECT: *Le jeux de l'oie*
---------------------------------

*Présentation et Objectifs du TP*
---------------------------------

Le jeu: 
-------

Ce jeu se présente sous la forme d’un plateau constitué dans la version traditionnelle de 63 cases numérotées à partir de 1 (plus une position de départ qui peut être considérée comme une 64ème case numérotée 0). Pour gagner et finir
la partie, il faut qu’un joueur arrive exactement sur la case 63.

Les différents joueurs, en nombre quelconque, jouent chacun leur tour. Selon la case où il se trouve un joueur a ou non le droit de quitter la case où il se trouve. Si ce n’est pas le cas, il passe son tour. S’il est autorisé à jouer il lance 2 dés à 6 faces et avance son pion d’un nombre de cases égal à la somme des dés pour arriver sur sa case destination. Si son lancer de dés lui fait “dépasser” la dernière case, il revient en arrière du nombre de cases en excès. Par exemple, un joueur situé sur la case 57 fait 9 aux dés, il avance jusque la case 63 en dépensant 6 points et recule ensuite des 3 points restants pour arriver sur la case 60.
Une arrivée sur une case peut avoir plusieurs conséquences :
*elle déclenche un « rebond »:
		si la case est une “case oie”, le joueur double le score du dé et « rebondit » donc en avançant encore son pion d’autant de cases qu’indiqué par les dés ;
		si la case est une “case de téléportation”, le pion « rebondit » jusqu’à une autre case prédéfinie ;
		pour toutes les autres cases, il ne se produit rien de particulier : le joueur reste sur la case, ce qui revient à onsidérer qu’il « rebondit » sur place,ou qu’il fait un « rebond de taille 0 ».

*dans tous les cas, si la case d’arrivée est déjà occupée, le pion du joueur remplace le pion déjà présent et ce dernier est placé 			sur la case précédemment occupée par le joueur. Il n’y a donc toujours qu’au plus un joueur par case, sauf pour la case de 			départ qui est un cas très particulier.

*certaines cases ne pourront être quittées que sous certaines conditions :
		si la case est une “case piège”, le joueur ne pourra plus la quitter tant qu’il restera dans cette case (c’est-à-dire jusqu’à ce qu’un autre joueur tombe également sur cette case et que la première situation décrite se produise) ;
		si la case est une “case d’attente”, le joueur ne peut quitter le case que pendant un nombre de tours prédéfini
		pour chaque case (sauf si un autre joueur arrive sur cette case et le renvoie donc vers sa case initiale, c’est au joueur arrivant de se retrouver en attente pour le nombre de tours initialement prévu pour la case) ;

*Mise en oeuvre:
----------------

Le tp est composé d'un package appellé "goosegame". 
Nous avons une interface "cell" qui definie une case du plateau de jeux. Ensuite nous avons definis une classe ("StartCell") pour representer la case de depart(la case 0) et une autre classe ("BasicCell")  qui definie les autres cases.
A la classe "BasicCell" est rattachées d'autres classes qui definissent les different types de cases.
A cela s'ajoutent les classes pour pouvoir derouler le jeux notamment la classe Game.


*Generer La Documentation*
--------------------------

pour générer  la  documentation  du  paquetage goosegame, se placer dans le dossier *src* et exécuter la commande :
		
			javadoc goosegame -d ../docs

Cette commande va creer un dossier *docs* qui va contenir la documentation du paquetage

*Les fichiers .java dans lesquels sont implémenés les classes*
--------------------------------------------------------------

Pour la compilation des fichiers du paquetage *goosegame* :

Se placer dans le dossier *src* et exécuter la commande suivante qui va creer le dossier *classes* avec les objets .class des différentes classes  :

			javac goosegame/ClassName.java -d ../classes	
			
*EXEMPLE*:

			javac goosegame/Main.java -d ../classes

			javac goosegame/ClassicBoard.java -d ../classes

La seconde commande permet de compiler les sous classes cell

*Les Tests*
-----------

Pour la compilation d'un fichier de *test*:
Les classes de test sont dans le dossier *test*.

Se placer à la racine du TP et en supposant l’existence du dossier *classes* exécuter la commande suivante :

			javac -d classes/ -cp test-1.7.jar:class -sourcepath src:test test/goosegame/*.java test/goosegame/cell/*java

*NB* : * permet de compiler toutes les classes de tests contenues dans le paquetage *goosegame* du dossier *test* et aussi celles du sous paquetage *cell* de *goosegame*.

*Remarque* : le dossier *test* est une structure similaire du paquetage *goosegame* du dossier *src*.

Et pour voir la validité de ces tests sur junit vous pouvez utiliser la commande depuis la racine du TP:

			
			java -jar test-1.7.jar -cp test-1.7.jar:classes goosegame.ClasseName

Pour les tests du paquetage *goosegame* il suffira de remplacer *ClasseName* par l'un des noms ci-dessous:
*TestClassicBoard*
*TestPlayer*

Pour ceux du sous paquetage *cell* vous utiliserez cette commande:

			java -jar test-1.7.jar -cp test-1.7.jar:classes goosegame.cell.ClasseName	

Comme précedement *ClasseName* est à remplacer par l'un des noms :
*TestBasicCell*
*TestGooseCell*
*TestStartCell*
*TestTrapCell*
*TestWaitingCell*
*TestTeleportCell*

*EXEMPLE*
			java -jar test-1.7.jar -cp test-1.7.jar:classes goosegame.TestPlayer

			java -jar test-1.7.jar -cp test-1.7.jar:classes goosegame.cell.TestBasicCell

*La Classe principale Main*
----------------------------

Pour la compilation vous utiliserez ces deux commandes (si celles-ci n'ont pas été executées dans l'exemple ci-dessus) en se plaçant dans le dossier *src* :

			javac goosegame/Main.java -d ../classes

Pour l'exécution, se placer à la racine du TP et exécuter la commande suivante:

			java -classpath classes goosegame.Main nom1 nom2 ...

*NB* nom1 nom2 sont à remplacer par des noms de votre choix à l'éxécution et les ... signifient que vous pouvez rajouter autant de joueurs que vous voulez.

*Création d'archive "jar"*
--------------------------

Placez vous dans le dossier *classes*.  Exécutez la commande :

		jar cvf ../goosegame.jar goosegame

Celle-ci crée l'archive *goosegame.jar* et à  la racine du TP vous pouvez consulter le contenu avec la commande :

		jar tvf goosegame.jar

A la racine du TP utiliser la commande suivante pour l'exécution de la classe main :

		java -classpath goosegame.jar goosegame.Main nom1 nom2 ...

Comme précédement nom1 et nom2 sont à remplacer


*Création des Jar Exécutables*
------------------------------

Les fichiers *manifest-ex* définit la classe *Main* du paquetage *goosegame*.

Dans le dossier *classes*, exécuter la commande:

		jar cvfm ../goosegameExe.jar ../manifest-ex goosegame

La commande crée l'archive *goosegameExe.jar* qui, lors de son appelle exécutera la classe *Main* qui est definie dans le *manifest-ex*

Depuis la racine du TP, consulter le contenue de l'archives par la commande:
	
		jar tvf goosegameExe.jar
	
Depuis la racine du TP, éxécuter la commande :

		java -jar goosegameExe.jar nom1 nom2 ...nomn

*NB*: remplacer nom1, nom2..nomn par les noms de vos choix.

*EXEMPLE* :
		java -jar goosegameExe.jar barry diallo roos








