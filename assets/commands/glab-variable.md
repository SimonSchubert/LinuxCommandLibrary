# TAGLINE

Manage GitLab CI/CD variables from the command line

# TLDR

**List** variables for the current project

```glab variable list```

List variables for a **group**

```glab variable list -g [group]```

**Print** one variable

```glab variable get [key]```

**Set** a variable

```glab variable set [key] "[value]"```

Set a **masked**, **protected** variable for one environment

```glab variable set [key] "[value]" -m -p -s "[scope]"```

Store the value as a **file** variable

```glab variable set [key] "[value]" -t file```

**Export** project variables as shell assignments

```glab variable export -F env```

**Delete** a variable

```glab variable delete [key]```

# SYNOPSIS

**glab variable** _command_ [_flags_]

# PARAMETERS

**list**
> List variables. **-g** selects a group instead of the current project.

**get** _key_
> Print the value of one variable.

**set** _key_ _value_
> Create or update a variable. **-m** masks it in job logs. **-p** makes it available only on protected branches and tags. **-s** limits it to an environment scope. **-t** sets the type: **file**, or an environment variable (the default).

**export**
> Print variables as assignments. **-F env** writes them in a form a shell can source.

**delete** _key_
> Delete a project variable.

**-h**, **--help**
> Show help and exit.

# DESCRIPTION

**glab variable** manages CI/CD variables for a GitLab project or group. It is a subcommand of **glab**, not a separate program. Commands that do not pass **-g** use the project that matches the git remote in the current directory.

A masked variable is hidden in job logs. A protected variable is exposed only to pipelines on protected refs. A file variable is written to a temporary file when a job starts, and the job sees the path instead of the raw text. The default type is an environment variable injected into the job.

# CAVEATS

**get** and **export** print secret values to the terminal. Group variables and project variables are different stores; **-g** is required to see the group ones. A protected variable is missing from pipelines that do not run on a protected ref.

# INSTALL

```apt: sudo apt install glab```

```dnf: sudo dnf install glab```

```pacman: sudo pacman -S glab```

```apk: sudo apk add glab```

```zypper: sudo zypper install glab```

```brew: brew install glab```

```nix: nix profile install nixpkgs#glab```

<!-- packages: 2026-11-26 -->

# SEE ALSO

[glab](/man/glab)(1), [glab-repo](/man/glab-repo)(1), [glab-label](/man/glab-label)(1)

# RESOURCES

```[Source code](https://gitlab.com/gitlab-org/cli)```

```[Documentation](https://docs.gitlab.com/cli/variable/)```

<!-- verified: 2026-11-26 -->
