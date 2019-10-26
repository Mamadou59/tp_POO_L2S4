			       	
Author: *Diallo Mamadou & Barry Mamadou*
-----------------------------------------

PROJECT: *TP6 Rental agency*
---------------------------------

*Présentation et Objectifs du TP*
---------------------------------

Ce TP *rental agency* a pour objectif la gestion d'une agence de location de vehicules avec differentes contraintes un client ne peut louer deux vehicules à la fois, deux clients ne peuvent louer le même vehicule, l'agence ne peut faire louer que des vehicules qu'elle contienne et aussi plusieurs autres à voir lors de l'éxecution. Disposant de plusieurs type de vehicules et d'agences de locations avec dieffentes contraintes ce qui introduit l'utilisation des interfaces, l'heritage,ect.
 
Ces contraintes sont gérées par les différentes methodes (levant des exceptions si necessaire) présentées dans les différentes classes .

*Generer La Documentation*
--------------------------

pour générer  la  documentation  du  paquetage rental, se placer dans le dossier *src* et exécuter la commande suivante en supposant l'existence du dossier *docs* :
		
			javadoc rental -d ../docs

*Les fichiers .java dans lesquels sont implémenés les classes*
--------------------------------------------------------------

Pour la compilation des fichiers du paquetage *rental* :

Se placer dans le dossier *src* et exécuter la commande suivante en supposant l'existence du dossier *classes* :

			javac rental/ClassName.java -d ../classes	
			
*EXEMPLE*:

			javac rental/RentalAgencyMain.java -d ../classes

			javac rental/VehicleMain.java -d ../classes

*NB* : *ClassName.java* une classe du paquetage *rental* et aussi ces deux commandes donées comme exemples compilerons toutes les autres classes car celles-ci sont utilisées au moins une fois dans l'une des deux classes *RentalAgencyMain* ou *VehicleMain*.

*Les Tests*
-----------

Pour la compilation d'un fichier de *test*:

Se placer à la racine du TP et en supposant l’existence du dossier *classes* exécuter la commande suivante :

			javac -d classes/ -cp test-1.7.jar:class -sourcepath src:test test/rental/*.java

*NB* : * permet de compiler toutes les classes de tests contenues dans le paquetage *rental* du dossier *test*.

*Remarque* : Dans le dossier *test* une structure similaire du paquetage *rental* du dossier *src* est definie .

Et pour voir la validité de ces tests sur junit vous pouvez utiliser la commande depuis la racine du TP:
			
			java -jar test-1.7.jar -cp test-1.7.jar:classes rental.ClasseName

*NB* : *ClassName* est à remplacer par l'un des noms ci-dessous ;

*BrandFilterTest*

*MaxPriceFilterTest*

*VehicleTest*

*ClientTest*

*RentalAgencyTest*

*YearFilterTest*


*Les deux Classes principales RentalAgencyMain & VehicleMain*
-------------------------------------------------------------

Pour la compilation vous utiliserez ces deux commandes (si celles-ci n'ont pas été executées dans l'exemple ci-dessus) en se plaçant dans le dossier *src* :

			javac rental/RentalAgencyMain.java -d ../classes

			javac rental/VehicleMain.java -d ../classes

Celle-ci permet de compiler les deux à la fois.
	
			javac rental/*Main.java -d ../classes

Pour l'exécution, se placer à la racine du TP et exécuter les commandes suivantes:

			java -classpath classes rental.RentalAgencyMain

			java -classpath classes rental.VahicleMain

*Création d'archive "jar"*
--------------------------

Placez vous dans le dossier *classes*.  Exécutez la commande :

		jar cvf ../rentalAgency.jar rental

Celle-ci crée l'archive *rentalAgency.jar* et à  la racine du TP vous pouvez consulter le contenue avec la commande :

		jar tvf rentalAgency.jar

Assurez vous d'être à la racine du TP et utiliser les commandes suivantes pour l'exécution des deux classes main qui y sont:

		java -classpath rentalAgency.jar rental.RentalAgencyMain

		java -classpath rentalAgency.jar rental.VehicleMain


*Création des Jar Exécutables*
------------------------------

Les fichiers *manifest-ex* et *manifest1-ex* definissent les classes *RentalAgencyMain* et *VehicleMain* du paquetage *rental*.

En se plaçant dans le dossier *classes*, exécuter les commandes:

		jar cvfm ../rentalAgencyExec.jar ../manifest-ex rental

		jar cvfm ../vehicleExec.jar ../manifest1-ex rental

La prémière commande crée l'archive *rentalAgencyExec.jar* qui lors de son exécution exécutera la classe *RentalAgencyMain* qui est definie dans le *manifest-ex* et la seconde crée l'archive *vehicleExec.jar* qui aussi exécutera la classe *VehicleMain* qui est definie dans le *manifest1-ex*.

Vous pouvez vous placez maintenant dans la racine du TP et consulter le contenue de ces archives par les commandes:
	
		jar tvf rentalAgencyExec.jar

		jar tvf vehicleExec.jar
	
Assurez vous maintenant d'être bien à la racine du TP puis éxécuter les commandes :

		java -jar rentalAgencyExec.jar

		java -jar vehicleExec.jar 

		java -jar vehicleExec.jar maxPriceFilter

NB: Vous remplacerez *maxPriceFilter* par un prix de votre choix!








