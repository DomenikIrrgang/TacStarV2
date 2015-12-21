package com.tacstargame.ui.util;

public class Measure {
	public int width = 0;
	public int height = 0;
	
	public Measure(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public boolean equals(Object obj) {
		return width == ((Measure) obj).width && height == ((Measure) obj).height;
	}
        
        public Measure divide(int width, int height) {
            return new Measure(this.width / width, this.height / height);
        }
	
	@Override
	public String toString() {
		return "[" + width + "x" + height + "]";
	}
}
