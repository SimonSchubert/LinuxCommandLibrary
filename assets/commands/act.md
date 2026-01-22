# TLDR

**Run** the default workflow

```act```

**List** all available workflows

```act -l```

Run a **specific workflow**

```act -W [.github/workflows/ci.yml]```

Run a **specific job**

```act -j [build]```

Run with **secrets** from file

```act --secret-file [.secrets]```

# SYNOPSIS

**act** [_-W workflow_] [_-j job_] [_-e event_] [_--secret-file file_] [_options_]

# DESCRIPTION

**act** allows you to run GitHub Actions workflows locally using Docker containers. It parses workflow YAML files and executes jobs in containers that simulate the GitHub Actions environment, enabling rapid iteration and debugging without pushing to GitHub.

The tool supports most GitHub Actions features including matrix builds, secrets, environment variables, and artifacts. It downloads and caches action repositories automatically.

# PARAMETERS

**-W** _file_, **--workflows** _file_
> Path to workflow file(s) (default: .github/workflows/)

**-j** _job_, **--job** _job_
> Run a specific job

**-e** _file_, **--eventpath** _file_
> Path to event JSON file

**--secret-file** _file_
> Load secrets from file (KEY=VALUE format)

**-s** _secret_, **--secret** _secret_
> Set a secret (KEY=VALUE)

**--env-file** _file_
> Load environment variables from file

**-P** _platform_, **--platform** _platform_
> Custom Docker image for platform (e.g., ubuntu-latest=nektos/act-environments-ubuntu:18.04)

**-l**, **--list**
> List available workflows and jobs

**-n**, **--dryrun**
> Show what would be run without executing

**-r**, **--reuse**
> Reuse containers between runs

**-b**, **--bind**
> Bind working directory instead of copying

**--container-architecture** _arch_
> Container architecture (amd64, arm64)

# CAVEATS

Not all GitHub Actions features are supported; some hosted runner features like service containers have limitations. Large workflow images can be slow to download initially. Some actions may behave differently locally than on GitHub. Docker must be running.

# HISTORY

**act** was created by Casey Lee (nektos) and first released in **2019**. It was developed to address the slow feedback loop of GitHub Actions by enabling local execution. The project quickly gained popularity in the CI/CD community.

# SEE ALSO

[docker](/man/docker)(1), [gh](/man/gh)(1), [make](/man/make)(1)
