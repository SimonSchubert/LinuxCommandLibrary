# TAGLINE

Pull Git repositories and run each one's deploy script

# TLDR

Watch `/etc/deployments.csv` and deploy into `/var/deployment`

```deployment```

Use another **list** and another **home** directory

```deployment -d [path/to/deployments.csv] -H [path/to/directory]```

Clone anything that is missing, then exit

```deployment -c```

Print the commands **without running** them

```deployment -n```

Wait this many **seconds** after each repository

```deployment --delay [60]```

Copy every repository `dist` directory under the home `dist` directory

```deployment -D```

Write a health timestamp after a fully successful pass

```deployment --health-file [/tmp/deployment-health]```

# SYNOPSIS

**deployment** [**-c**|**--clone-only**] [**-n**|**--dry-run**] [**-D**|**--global-dist**] [**-d**|**--deployments** _file_] [**-H**|**--home** _dir_] [**--delay** _seconds_] [**--health-file** _path_]

# PARAMETERS

**-d**, **--deployments** _file_

> CSV of deployments. The default is `/etc/deployments.csv`

**-H**, **--home** _dir_

> Base directory for rows whose path does not start with `/`. The default is `/var/deployment`

**-c**, **--clone-only**

> Clone repositories that are not on disk yet, then exit. Do not pull or build

**-n**, **--dry-run**

> Print commands instead of running them. This does not predict **rsync** or what **--global-dist** would copy

**-D**, **--global-dist**

> After a build, copy that repository's `dist` directory into the home directory's `dist` directory

**--delay** _seconds_

> Pause after each pull and build. The default is 30. The first pass does not wait

**--health-file** _path_

> After a pass that succeeds for every row, write an expiry timestamp to this file. Startup and deploy errors remove the file. **--dry-run** and **--clone-only** leave it alone. An empty list never counts as healthy. The expiry budget is the number of rows times **--delay** times 2

# DESCRIPTION

**deployment** is a long-running Python program that keeps a list of Git checkouts up to date and runs a `deploy` script at the root of each one. It is aimed at publishing sites and other build products. Python 3.9 or newer, **git**, and **rsync** are required. There is no distro package. The usual install is to copy `deployment.py` onto `PATH` as **deployment** and run it under systemd or in a container that includes the build tools those scripts need.

Each CSV row is `path,repository_url`. A path that starts with `/` is absolute. Any other path is relative to the home directory. A checkout with no executable `deploy` script is only pulled. A `deploy` script is arbitrary code: **chmod +x** it, and do not point the list at a repository you do not trust.

The published container image (`chrissx/deployment`) expects the list at `/etc/deployments.csv` and data under `/var/deployment`, and it turns on `--health-file /tmp/deployment-health`. The image is based on Ubuntu and includes Node. It is not a general-purpose build environment.

# CONFIGURATION

**/etc/deployments.csv**

> Default deployment list. One `path,repository_url` row per checkout.

**/var/deployment**

> Default home for relative paths, and the place **--global-dist** collects `dist` trees.

**deploy**

> Executable script at the root of a repository. Typical contents install dependencies and run the project's build. If the file is missing, **deployment** only runs `git pull`.

# CAVEATS

`deploy` scripts run with the privileges of the **deployment** process. Do not use this tool on untrusted repositories. Build tools can leave zombie processes. A container should use an init process so those children are reaped.

**--dry-run** cannot show the full effect of **rsync** or **--global-dist**. **--health-file** stays untouched during a dry run or a clone-only pass, and an empty CSV never becomes healthy.

The name is a generic English word. This page is the chrissxMedia deploy loop, not a Kubernetes or CI product that happens to be called deployment.

# HISTORY

**deployment** is maintained by chrissxMedia as a small Git-driven publisher for their own sites and for projects they host. The Docker image that pairs it with Node 24 is newer than the systemd unit and is still lightly tested upstream.

# SEE ALSO

[git](/man/git)(1), [rsync](/man/rsync)(1), [make](/man/make)(1)

# RESOURCES

```[Source code](https://github.com/chrissxMedia/deployment)```

<!-- verified: 2026-11-07 -->
