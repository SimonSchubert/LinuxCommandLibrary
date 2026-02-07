# TAGLINE

CLI for CircleCI continuous integration platform

# TLDR

**Configure CLI with API token**

```circleci setup```

**Validate config file**

```circleci config validate```

**Run job locally**

```circleci local execute --job [build]```

**Process config file**

```circleci config process [.circleci/config.yml]```

**Create new project**

```circleci project create```

**List contexts**

```circleci context list [github] [org-name]```

**List orbs**

```circleci orb list```

**Get namespace info**

```circleci namespace info [namespace]```

# SYNOPSIS

**circleci** [_options_] _command_ [_arguments_]

# DESCRIPTION

**circleci** is the official CLI for CircleCI, enabling local job execution, config validation, pipeline management, and interaction with CircleCI resources from the terminal.

The CLI is particularly useful for validating and processing configuration files before pushing changes, running jobs locally in Docker containers for faster development iteration, and managing orbs, contexts, and project settings. It integrates with the CircleCI API for pipeline and workflow management.

Local execution requires Docker and runs individual jobs in containers that mirror the cloud environment, though some features like caching and workflows are not available locally.

# COMMANDS

**setup**
> Configure CLI with API token

**config validate**
> Validate config.yml syntax

**config process**
> Process and expand config

**local execute**
> Run jobs locally

**project**
> Manage projects

**context**
> Manage contexts and environment variables

**orb**
> Manage orbs

**namespace**
> Manage namespaces

**pipeline**
> Manage pipelines

**version**
> Show version

# PARAMETERS

**--token** _token_
> CircleCI API token

**--host** _url_
> CircleCI host URL

**--debug**
> Enable debug output

**--skip-update-check**
> Skip update check

# LOCAL EXECUTION

```circleci local execute --job build -e VAR=value```

Note: Workflows, caching, and some features are not supported locally.

# CONFIGURATION

**~/.circleci/cli.yml**
> CLI configuration including API token and host URL.

**.circleci/config.yml**
> Project-level CircleCI pipeline configuration defining jobs, workflows, and orbs.

# CAVEATS

Local execution runs single jobs only, not workflows. Caching not supported locally. Some CircleCI features require cloud execution.

# SEE ALSO

[docker](/man/docker)(1), [git](/man/git)(1)
