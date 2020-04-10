package datascience;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class M5KaggleApplication extends Application<M5KaggleConfiguration> {

    public static void main(final String[] args) throws Exception {
        new M5KaggleApplication().run(args);
    }

    @Override
    public String getName() {
        return "M5-Kaggle";
    }

    @Override
    public void initialize(final Bootstrap<M5KaggleConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final M5KaggleConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
