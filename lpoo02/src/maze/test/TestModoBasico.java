package maze.test;

import static org.junit.Assert.*;
import org.junit.Test;

import maze.logic.Dragao;
import maze.logic.Heroi;
import maze.logic.Labirinto;
import maze.logic.Point;

public class TestModoBasico {
	char[][] m1 = { { 'X', 'X', 'X', 'X', 'X' }, 
					{ 'X', '.', '.', '.', 'S' },
					{ 'X', 'H', 'X', '.', 'X' }, 
					{ 'X', 'E', '.', 'D', 'X' },
					{ 'X', 'X', 'X', 'X', 'X' } 
				};
	
	Heroi heroi = new Heroi(1,2);
	Dragao dragao = new Dragao(3,3);

	//alinea a
	@Test
	public void testMoverHeroi() {
		Labirinto maze = new Labirinto();
		maze.criarLabirinto(m1);
		maze.moverHeroi(heroi, dragao, 's');
		assertEquals(new Point(3,2), heroi.getHeroiPosicao());
		maze.moverHeroi(heroi, dragao, 'n');
		assertEquals(new Point(3,1), heroi.getHeroiPosicao());
		maze.moverHeroi(heroi, dragao, 'e');
		assertEquals(new Point(3,1), heroi.getHeroiPosicao());
		maze.moverHeroi(heroi, dragao, 'o');
		assertEquals(new Point(2,1), heroi.getHeroiPosicao());
		maze.moverHeroi(heroi, dragao, 'e');
		assertEquals(new Point(3,1), heroi.getHeroiPosicao());		
		dragao.DragaoMorre();
		maze.moverHeroi(heroi, dragao, 'e');
		assertEquals(new Point(4,1), heroi.getHeroiPosicao());
		heroi.setLinha(2);
		heroi.setColuna(1);
		
		maze.moverHeroi(heroi, dragao, 's');
		assertEquals(new Point(1,3), heroi.getHeroiPosicao());
		assertEquals(true, heroi.getArma());
		}
	
	//alinea b
	@Test
	public void testMoverDragao() {
//		Labirinto maze = new Labirinto();
//		maze.criarLabirinto(m1);
//		maze.moverDragao(dragao, heroi, 0);
//		Point p1 = new Point(3,3);
//		assertEquals(p1, dragao.getDragaoPosicao());
	}

}