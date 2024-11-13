# dmn10migration

[Link to zulip issue](https://kie.zulipchat.com/#narrow/channel/232677-drools/topic/Error.20when.20migrating.20to.20new.20version.2E)

## There are two projects in this repo

### CollectiveAgreementWS 
This is the web service that calls the dmn model

### collectiveagreementengine
This is the project that contains the model and creates the maven artifact that CollectiveAgreementWS depends on

###  Notes
In this project the web service works!   I am going back to my main project to see what the difference is.  The collective agreementengine is still failing with the versioning problem.  I hope this provides some insight on migration issues.  I really hope that you can help me migrate this!
