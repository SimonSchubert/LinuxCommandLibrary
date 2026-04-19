# TAGLINE

CLI for Concourse CI system

# TLDR

**Set build target**

```fly -t [target] set-pipeline```

**Trigger job**

```fly -t [target] trigger-job -j [pipeline/job]```

**Watch job logs**

```fly -t [target] watch -j [pipeline/job]```

**Login to Concourse**

```fly -t [target] login -c [https://ci.example.com]```

**Sync fly version**

```fly -t [target] sync```

# SYNOPSIS

**fly** [_options_] _command_ [_arguments_]

# PARAMETERS

_COMMAND_
> Operation: login, set-pipeline, trigger-job, watch, etc.

**-t**, **--target** _TARGET_
> Concourse target name saved in ~/.flyrc.

**login**
> Authenticate with a Concourse server (use **-c** _url_ for concourse URL, **-n** _team_ for team).

**logout**
> Clear saved token for a target.

**targets**
> List all configured targets and their token expiration.

**set-pipeline**
> Create or update a pipeline from YAML (**-p** _pipeline_ **-c** _config.yml_).

**get-pipeline**
> Output a pipeline's current configuration (**-p** _pipeline_).

**destroy-pipeline**
> Remove a pipeline (**-p** _pipeline_).

**unpause-pipeline**, **pause-pipeline**
> Enable or disable a pipeline.

**trigger-job**
> Start job execution (**-j** _pipeline/job_).

**watch**
> Stream a build's output (**-j** _pipeline/job_ or **-b** _build_).

**execute**
> Run a one-off task locally (**-c** _task.yml_).

**sync**
> Update local fly binary to match server version.

**--help**
> Display help information.

# DESCRIPTION

**fly** is the CLI for Concourse CI, a container-based continuous integration system. It manages pipelines, triggers builds, and interacts with Concourse servers.

The tool handles pipeline configuration, job management, and build monitoring. Each Concourse instance is registered as a named target for easy switching between CI servers.

fly enables scriptable CI/CD workflows and provides real-time access to build logs and status.

# CAVEATS

Version must match server. Targets need periodic re-authentication. Pipeline YAML syntax is specific.

# HISTORY

fly is the CLI for **Concourse CI**, created by Pivotal (now VMware). Concourse pioneered treating CI pipelines as code with a focus on containers and reproducibility.

# SEE ALSO

[concourse](/man/concourse)(1), [jenkins](/man/jenkins)(1), [flyctl](/man/flyctl)(1)
