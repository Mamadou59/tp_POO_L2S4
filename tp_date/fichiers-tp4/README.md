------------------------------------------------------------------------

TITRE DU PROJET : Tp4 POO
BUT POURSUIVI : Réalisation des modules premettant de manipuler un date.
VERSION ou DATE : 23/02/2019
COMMENT INVOQUER CE PROJET :
AUTEURS : Diallo Mamadou & Barry Mamadou
INSTRUCTIONS Ŕ L'USAGER :

--------------------------------------------------------------------
Ce module défini les dates et  quelques méthodes applicables sur celles-ci. Un objet date est caractérisé par le numero de jour, le nom du mois qui est aussi un objet et de l'année.

NB: les mois seront définis par "Month.nomDuMois".

--------------------------------------------------------------------
Des méthodes ont été définies et leurs utilisation nécesitent la création d'un objet de type "Date", qui peut être construit de deux façons l'une à partir de trois paramètres numéro du jour, d'un objet "Month" d'écrit ci-dessus et d'une année l'autre à partir d'une d'un objet "Date" déjà crée donc ces deux objets "Date" seront identiques mais ne designéront pas le même objet. D'autres méthodes pour manipuler cette date par exemple récuperer la date du jour suivant, connaitre la différence de jours entre deux date, connaître la date aprés quelques jours et aussi voir si deux dates sont identiques.

--------------------------------------------------------------------
Pour recuperer le dossier vous untiliserez la commande:
"git pull"
Ou
"git clone https://gitlab-etu.fil.univ-lille1.fr/diallom/diallo-barry-rendus-poo.git"
Puis placez-vous dans le dossier "src"
Vous rearquerez que sur chaque commande on rajoute "example.Robot.java","example.Robot","example" ou "example/Robot.java qui concerne là le paquetage "example" contenant les différentes classes pour la partie example du tp.

La commande "javadoc date date.util example example.util -d ../docs" génére la documentation des differentes méthodes des deux paquetages et leurs sous paquetages.

La commande "javac date/DateMain.java example/Robot.java -d ../classes" compile les différentes classes du package date etant donné que la classe DateMain se trouve dans le paquetage "date" et elle utilise toutes les autres classes du paquetage et du sous paquetage "util". et celles du paquetage "example"

Maintenant placez-vous dans la racine du tp

La commande "javac -classpath test-1.7.jar test/DateTest.java test/RobotTest.java" compile la classe DateTest et la classe RobotTest.

Et celles-ci "java -jar test-1.7.jar DateTest" et "java -jar test-1.7.jar RobotTest" permettent de voir la validité des tests de chaque classe sur Junit.

La commande: "java -classpath classes date.DateMain" permet de voir l'exécution de la classe 'DateMain'.

La commande: "java -classpath classes example.Robot" permet de voir l'exécution du main contenu dans le classe "Robot".

Génération du fichier .jar
--------------------------
Placez-vous dans le dossier "classes" puis exécuter la commande: "jar cvf ../appli.jar date example", dans la racine principale un fichier appli.jar est alors crée, pour le consulter vous pouvez utiliser la commande "jar tvf appli.jar" Vous troverez de dans des fichiers .class issus des paquetages "date" et "example".

Pour exécuter les classes main des deux paquetage vous pouvez utliser les commande "java -classpath appli.jar date.DateMain" et "java -classpath appli.jar example.Robot".

L'éxtraction se fait avec la commande "jar xvf appli.jar".

Le jar exécutable
-----------------

Placez-vous dans le dossier "classes", tapper d'abord la commande: "jar cvf ../appli.jar date" puis "jar cvfm ../appli.jar ../manifest-ex date" Revenez sur la racine principale et exécuter la commande : "java -jar appli.jar".

NB: le jar exécutable est juste pour le paquetage "date".


