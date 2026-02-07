# TAGLINE

Run managed continuous integration builds.

# TLDR

**Start a build** for a project

```aws codebuild start-build --project-name [my-project]```

**Start a build** with environment variable overrides

```aws codebuild start-build --project-name [my-project] --environment-variables-override name=MY_VAR,value=myvalue```

**Create a project** from JSON configuration

```aws codebuild create-project --cli-input-json file://[project.json]```

**Generate project template** JSON

```aws codebuild create-project --generate-cli-skeleton > [project.json]```

**List all projects**

```aws codebuild list-projects```

**Get build details**

```aws codebuild batch-get-builds --ids [build-id]```

**Stop a running build**

```aws codebuild stop-build --id [build-id]```

**View build logs**

```aws codebuild batch-get-builds --ids [build-id] --query "builds[0].logs"```

# SYNOPSIS

**aws codebuild** _command_ [_options_]

# PARAMETERS

**start-build**
> Start a build run for a project

**start-build-batch**
> Start a batch build

**stop-build**
> Stop a running build

**create-project**
> Create a new build project

**update-project**
> Modify project configuration

**delete-project**
> Remove a build project

**list-projects**
> List all build projects

**batch-get-builds**
> Get details of one or more builds

**batch-get-projects**
> Get details of one or more projects

**list-builds-for-project**
> List builds for a specific project

**--project-name** _name_
> Name of the build project

**--id** _build-id_
> Build identifier

**--ids** _build-ids_
> Space-separated list of build IDs

**--source-version** _ref_
> Source version (branch, tag, commit ID)

**--environment-variables-override** _vars_
> Override environment variables (name=KEY,value=VAL)

**--buildspec-override** _path_
> Override buildspec file

**--cli-input-json** _file_
> Read parameters from JSON file

**--generate-cli-skeleton**
> Output JSON template for project creation

# DESCRIPTION

**aws codebuild** manages AWS CodeBuild, a fully managed continuous integration service that compiles source code, runs tests, and produces deployable artifacts.

**Projects** define the build environment, source location (CodeCommit, S3, GitHub, Bitbucket), build commands (buildspec.yml), and output artifacts. Use **create-project** with a JSON configuration file to define all settings.

**Builds** are triggered with **start-build**, which can override project defaults for source version, environment variables, and buildspec. Builds run in isolated Docker containers with configurable compute resources.

Build output includes logs (stored in CloudWatch Logs and/or S3) and artifacts (stored in S3). Use **batch-get-builds** to retrieve build status, logs location, and timing information.

# CAVEATS

Build timeouts default to 60 minutes; configure appropriately for long builds. IAM service role must have permissions for source access and artifact storage. Build cache helps speed up subsequent builds but must be configured. Concurrent build limits apply per account.

# HISTORY

**AWS CodeBuild** launched in **December 2016** at AWS re:Invent as part of the AWS developer tools suite. It was designed to eliminate the need for managing Jenkins or other CI servers. Build batches for parallel builds were added in **2020**, improving performance for complex build matrices.

# SEE ALSO

[aws](/man/aws)(1), [aws-codepipeline](/man/aws-codepipeline)(1), [aws-codecommit](/man/aws-codecommit)(1), [aws-s3](/man/aws-s3)(1)
