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

**-t** _TARGET_
> Concourse target name.

**login**
> Authenticate with Concourse.

**set-pipeline**
> Create or update pipeline.

**trigger-job**
> Start job execution.

**watch**
> Stream job output.

**sync**
> Update fly to match server.

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

[concourse](/man/concourse)(1), [jenkins](/man/jenkins)(1), [gitlab-ci](/man/gitlab-ci)(1)
