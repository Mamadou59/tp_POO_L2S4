package pfc.strategy;

import pfc.*;

import io.*;

public class InteractiveStart implements Strategy{

	private Shape shape;

	/**
	* Retrieve a position of either 0 1 or 2 given from the standart entry and 
	* put the corresponding shape in the shape attribute.
	* @throws java.io.IOException if not a good argument and ArrayIndexOutOfBoundsException if it is a value other than 0 1 2.
	*/
	public void getInputs(){
		int i;
		try{
			System.out.print("| Faites Votre choix de forme 0->ROCK, 1->PAPER & 2->SCISSORS:  ");
			i = Input.readInt();
			this.shape = Shape.values()[i];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("| Votre choix est invalide! la valeur à choisir est soit 0 1 ou 2");
			getInputs();
		}catch (java.io.IOException e){
			System.out.println("| Vous devez choisir un entier! cet entier est soit 0 1 ou 2");
			getInputs();
		}
	}
	/**
	* @return the chosen shape
	*/
	public Shape chooceShape(){
		getInputs();
		return this.shape;
	}
}