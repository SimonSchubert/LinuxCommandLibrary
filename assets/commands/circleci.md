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

Requires API token from CircleCI Personal API Tokens page. Config stored in ~/.circleci/cli.yml.

# CAVEATS

Local execution runs single jobs only, not workflows. Caching not supported locally. Some CircleCI features require cloud execution.

# SEE ALSO

[docker](/man/docker)(1), [git](/man/git)(1)
