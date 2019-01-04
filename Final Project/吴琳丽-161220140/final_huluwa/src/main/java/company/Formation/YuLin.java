package company.Formation;

import company.BattleField.Position;
import company.Creature.Creature;

public class YuLin implements Formation {
    public boolean ifEmpty(Position[][] Field, int x, int y) {
        return Field[x][y].empty()&&Field[x-1][y+1].empty()&&Field[x][y+2].empty()&&Field[x][y+4].empty()&&Field[x][y+6].empty()&&Field[x-1][y+3].empty()&&Field[x-1][y+5].empty()&&Field[x-2][y+4].empty()&&Field[x-3][y+3].empty()&&Field[x+1][y+2].empty();
    }

    public void setCreatures(Position[][] Field, int x, int y, Creature[] creatures) {
        while(!(x<=18&&y<=13&&x>=2)){
            return;
        }
        while(!ifEmpty(Field,x,y)){
            return;
        }
        Field[x][y].creature=creatures[0];
        creatures[0].setXY(x,y);
        Field[x][y+2].creature=creatures[1];
        creatures[1].setXY(x,y+2);
        Field[x][y+4].creature=creatures[2];
        creatures[2].setXY(x,y+4);
        Field[x][y+6].creature=creatures[3];
        creatures[3].setXY(x,y+6);
        Field[x-1][y+1].creature=creatures[4];
        creatures[4].setXY(x-1,y+1);
        Field[x-1][y+3].creature=creatures[5];
        creatures[5].setXY(x-1,y+3);
        Field[x-1][y+5].creature=creatures[6];
        creatures[6].setXY(x-1,y+5);
    }
}
