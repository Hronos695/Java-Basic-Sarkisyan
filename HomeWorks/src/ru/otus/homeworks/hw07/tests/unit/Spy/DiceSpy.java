package ru.otus.homeworks.hw07.tests.unit.Spy;

import ru.otus.homeworks.hw07.game.Dice;

public class DiceSpy implements Dice {
    private int value;
    private int player1 = 0;
    private int player2 = 0;
    int counter = 0;

    public DiceSpy(int value){
        this.value = value;
    }

    public DiceSpy(int player1,int player2){
        this.player1 = player1;
        this.player2 = player2;
    }

//    @Override
   public int roll() {

        if(player1 == 0 && player2 == 0){
            return value;
        }else{
            if(counter == 0 ){
                counter++;
                return player1;
            }else{
                return  player2;
            }
        }
    }
   }