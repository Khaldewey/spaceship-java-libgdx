package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class SpaceShip extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img, tNave;
	private Sprite nave;
	private float posX,posY;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("bg.png");
		tNave = new Texture("spaceship.png");
		nave = new Sprite(tNave);
		posX = 0;
		posY = 0;
	}
	@Override
	public void render () {
		this.moveNave();
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.draw(nave, posX, posY);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		tNave.dispose();
	} 

	private void moveNave(){
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
			if(posX < Gdx.graphics.getWidth()- nave.getWidth()){
				posX += 10;
			}
			
		}
		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
			if(posX > 0){
				posX -= 10;
			}
			
		}
		if(Gdx.input.isKeyPressed(Input.Keys.UP)){
			if(posY < 720 - 110){
				posY += 10;
			}
			
		}
		if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
			if(posY > 0){
				posY -= 10;
			}
			
		}
	}
}
