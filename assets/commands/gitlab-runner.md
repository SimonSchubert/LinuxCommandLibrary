# TLDR

**Register a new runner**

```sudo gitlab-runner register```

**List configured runners**

```gitlab-runner list```

**Start the runner service**

```sudo gitlab-runner start```

**Stop the runner service**

```sudo gitlab-runner stop```

**Run a single build** (for testing)

```gitlab-runner run-single -u [gitlab_url] -t [token] --executor [shell]```

**Verify runner configuration**

```gitlab-runner verify```

**Unregister a runner**

```sudo gitlab-runner unregister --name [runner_name]```

**Check runner status**

```gitlab-runner status```

# SYNOPSIS

**gitlab-runner** _command_ [_options_]

# PARAMETERS

**register**
> Register a new runner with GitLab instance.

**list**
> List all configured runners.

**start**
> Start the runner service.

**stop**
> Stop the runner service.

**restart**
> Restart the runner service.

**status**
> Show runner service status.

**run**
> Run the runner in foreground.

**run-single**
> Run a single build for testing.

**verify**
> Verify runner connections to GitLab.

**unregister**
> Remove a runner from GitLab.

**install**
> Install as system service.

**uninstall**
> Remove system service.

**--debug**
> Enable debug logging.

**--config** _file_
> Use alternate config file.

**--working-directory** _path_
> Set custom working directory.

# DESCRIPTION

**gitlab-runner** is the agent that runs CI/CD jobs for GitLab. It connects to a GitLab instance, receives job requests, executes them in isolated environments, and reports results back. Runners can be shared across projects or dedicated to specific ones.

The runner supports multiple executors that define how jobs run: **shell** (directly on host), **docker** (in containers), **docker-machine** (auto-scaled Docker), **kubernetes** (in K8s pods), **virtualbox**, **parallels**, and **ssh**. Docker executor is most common for isolated, reproducible builds.

Configuration is stored in **config.toml** (typically at /etc/gitlab-runner/config.toml). Each registered runner appears as a `[[runners]]` section with its URL, token, executor, and settings. The config can be edited manually or regenerated with register.

Registration requires a GitLab URL and registration token (found in project/group/admin CI settings). During registration, you specify the executor, tags (for job matching), and executor-specific settings like Docker image.

Runners can run as a system service or in foreground for debugging. For production, install as a service to ensure it starts on boot and restarts on failure.

# CAVEATS

Shell executor provides no isolation between jobs. Docker executor requires Docker installed. Registration tokens should be kept secret. Runners have access to whatever secrets are passed to jobs. Resource limits should be configured to prevent runaway jobs.

# HISTORY

**GitLab Runner** was developed by GitLab Inc. as part of their CI/CD platform, which became part of GitLab around **2015** when GitLab CI was integrated into the main product. The runner has evolved from simple shell execution to supporting multiple sophisticated executors, making it one of the most versatile CI job runners available.

# SEE ALSO

[docker](/man/docker)(1), [gitlab-ctl](/man/gitlab-ctl)(8), [jenkins](/man/jenkins)(1), [github-actions](/man/github-actions)(1)
