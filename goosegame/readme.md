-Nom_binome:Barry & Diallo

-But du TP : Crée le jeu de l'oie

Remarques :
1) Lorsque le joueur revient en arriere (quand il depasse la case 63) sur une case gosse (ex 54) le rebont se fait par l'avant
Exemple :
Si je suis sur la case 62 et mon des est de 10.
J'avance jusqu'a 63 puis je recule de 9, j'arrive sur la case 54, qui me fait avancer de 10. Donc je reviens sur la 62.

2) Nous avons crée une cellule StartCell qui herite de la classe BasicCell
C'est une celulle placé au "depart" a 0 qui a pour difference qu'elle peut acceuillir + 1 joueur 

--Generer la javadoc + l'executable + compilation de tout les fichiers

Depuis le dossier tp9
		make

--Effacer les fichier .class
Depuis le dossier tp9
		make clean

--Executer l'executable
Depuis le dossier tp9
java -jar appli.jar nom1 nom2 .... nomn






--Executer un test :
Depuis le dossier tp9
javac -classpath test-1.7.jar test/nomfichier.java

java -jar test-1.7.jar nomfichier

nomfichier = (TestBasicCell/TestClassicBoard/TestGooseCell/TestPlayer/TestStartCell/TestTeleportCell/TestTrapCell/TestWaitingCell)
