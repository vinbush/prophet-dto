package edu.baylor.ecs.cloudhubs.prophetdto.mermaid;

public class MermaidEdge {

    private String from;

    private String to;

    public MermaidEdge(){}

    public MermaidEdge(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public boolean exists(String from, String to){
        if (from.equals(this.from) && to.equals(this.to)){
            return true;
        }

        if (from.equals(this.to) && to.equals(this.from)){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "MermaidEdge{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
