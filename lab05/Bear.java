package lab05;


public class Bear extends Animal {
	private boolean hibernating;

	public Bear(String name) {
		super(name);
		hibernating = false;
	}

	public void hibernate() {
		hibernating = true;
	}

	@Override
	public String exercise() {
		if(this.hibernating)
    		return super.getName() + " is hibernating and can't exercise.";
    	return super.exercise();
	}

}