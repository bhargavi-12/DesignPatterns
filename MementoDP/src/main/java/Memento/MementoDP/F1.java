package Memento.MementoDP;

public class F1 {
private Object obj;
	
	public void save(F2 fileWriter){
		this.obj=fileWriter.save();
	}
	
	public void undo(F2 fileWriter){
		fileWriter.undoToLastSave(obj);
	}

}


