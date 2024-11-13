package ca.queensu.collagreesrv;

import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.event.rule.DebugAgendaEventListener;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.dmn.api.core.DMNModel;
import org.kie.dmn.api.core.DMNRuntime;

public class CheckSROR {

    public boolean run() {

        KieServices kieServices = KieServices.Factory.get();
        KieContainer kContainer;
        try {
            kContainer = kieServices.newKieContainer(
                    kieServices.newReleaseId("ca.queensu", "sror", "1.0-SNAPSHOT"));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        KieBase kBase = kContainer.getKieBase();
        KieSession kSession = kBase.newKieSession();

        try {
            DMNRuntime dmnRuntime = kSession.getKieRuntime(DMNRuntime.class);

            DMNModel dmnModel = dmnRuntime.getModel("https://kiegroup.org/dmn/_691425E9-D743-4F6F-9019-2607F6766BFD",
                    "sror");

            kSession.addEventListener(new DebugAgendaEventListener());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
