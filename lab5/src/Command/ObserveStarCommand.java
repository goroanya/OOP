package Command;

public class ObserveStarCommand implements Command {
    private String star;
    private Observatory observatory;

    public ObserveStarCommand(String star, Observatory observatory) {
        this.star = star;
        this.observatory = observatory;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public Observatory getObservatory() {
        return observatory;
    }

    public void setObservatory(Observatory observatory) {
        this.observatory = observatory;
    }

    @Override
    public void execute() {
        if (this.observatory != null) this.observatory.observe(this.star);
    }
}
