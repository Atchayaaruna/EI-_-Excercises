package Behavioral.Memento;
public class TextMemento{
    private final String state;
    public TextMemento(String state){
        this.state=state;
    }  
    public String getState(){
        return state;
    }
}
