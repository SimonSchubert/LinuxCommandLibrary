# TAGLINE

Manage continuous delivery pipelines on AWS.

# TLDR

**Start a pipeline execution**

```aws codepipeline start-pipeline-execution --name [MyPipeline]```

**Start with variables**

```aws codepipeline start-pipeline-execution --name [MyPipeline] --variables name=VERSION,value=1.0.0```

**Get pipeline definition**

```aws codepipeline get-pipeline --name [MyPipeline]```

**Get pipeline execution details**

```aws codepipeline get-pipeline-execution --pipeline-name [MyPipeline] --pipeline-execution-id [execution-id]```

**Get current pipeline state**

```aws codepipeline get-pipeline-state --name [MyPipeline]```

**List all pipelines**

```aws codepipeline list-pipelines```

**List pipeline executions**

```aws codepipeline list-pipeline-executions --pipeline-name [MyPipeline]```

**Create a pipeline** from JSON

```aws codepipeline create-pipeline --cli-input-json file://[pipeline.json]```

# SYNOPSIS

**aws codepipeline** _command_ [_options_]

# PARAMETERS

**start-pipeline-execution**
> Manually trigger a pipeline run

**get-pipeline**
> Get pipeline definition and metadata

**get-pipeline-state**
> Get current state of all stages

**get-pipeline-execution**
> Get details of a specific execution

**list-pipelines**
> List all pipelines in the account

**list-pipeline-executions**
> List executions for a pipeline

**create-pipeline**
> Create a new pipeline

**update-pipeline**
> Modify pipeline definition

**delete-pipeline**
> Remove a pipeline

**enable-stage-transition**
> Allow transitions into a stage

**disable-stage-transition**
> Block transitions into a stage

**--name** _pipeline-name_
> Name of the pipeline

**--pipeline-name** _name_
> Pipeline name (alternative parameter)

**--pipeline-execution-id** _id_
> Execution identifier

**--variables** _vars_
> Pipeline variables (name=KEY,value=VAL)

**--source-revisions** _revisions_
> Override source versions for execution

**--stage-name** _name_
> Name of the stage

**--transition-type** _type_
> Inbound or Outbound transition

# DESCRIPTION

**aws codepipeline** manages AWS CodePipeline, a continuous delivery service that automates release pipelines for application updates.

Pipelines consist of **stages** (Source, Build, Test, Deploy) containing **actions** that perform work like pulling code, running builds, or deploying to environments. Stages execute sequentially, with transitions between them.

**start-pipeline-execution** triggers a new run using the latest source revision or specified overrides. Pipelines can also be triggered automatically by source changes, schedules, or webhooks.

**Pipeline modes** control execution behavior: SUPERSEDED (default) cancels older executions when newer ones start, QUEUED processes executions in order, and PARALLEL allows concurrent executions.

Use **disable-stage-transition** to create a manual approval gate or pause deployments for maintenance.

# CAVEATS

Pipelines have concurrent execution limits. Disabling transitions blocks all following stages, not just the next one. Pipeline variables must be defined in the pipeline before use. Execution history is retained for 12 months.

# HISTORY

**AWS CodePipeline** launched in **July 2015** as AWS's continuous delivery service. V2 pipelines with enhanced features including pipeline variables and triggers were introduced in **2023**. The service integrates with CodeCommit, CodeBuild, CodeDeploy, and third-party tools like GitHub and Jenkins.

# SEE ALSO

[aws](/man/aws)(1), [aws-codebuild](/man/aws-codebuild)(1), [aws-codedeploy](/man/aws-codedeploy)(1), [aws-codecommit](/man/aws-codecommit)(1)
