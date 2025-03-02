package planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane {

    private ExperimentalTypes experimentalTypes;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String modelOfExperimentalPlane, int maxSpeed, int maxFlightDistance, int maxLoadCapacity,
                             ExperimentalTypes experimentalTypes, ClassificationLevel classificationLevel) {
        super(modelOfExperimentalPlane, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalTypes = experimentalTypes;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + getModel() + '\'' +
                '}';
    }
}
