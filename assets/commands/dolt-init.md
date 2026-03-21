# TAGLINE

Create a new Dolt data repository

# TLDR

**Initialize a Dolt repository in the current directory**

```dolt init```

**Initialize with a specific initial branch name**

```dolt init -b [main]```

**Initialize with author name and email**

```dolt init --name "[John Doe]" --email "[john@example.com]"```

**Initialize with a custom date for the initial commit**

```dolt init --date "[2024-01-01T00:00:00]"```

# SYNOPSIS

**dolt** **init** [_options_]

# PARAMETERS

**-b**, **--initial-branch** _string_
> Name of the initial branch. If not provided, uses `init.defaultbranch` from global config (default "main").

**--name** _string_
> Author name for the initial commit. If not provided, uses `user.name` from global config.

**--email** _string_
> Author email for the initial commit. If not provided, uses `user.email` from global config.

**--date** _string_
> Date to use for the initial commit. If not specified, the current system time is used.

**--fun**
> Create the repository with a fun initial commit message.

# DESCRIPTION

**dolt init** creates a new, empty Dolt repository in the current directory. It initializes the `.dolt` directory structure containing metadata, configuration, and the underlying storage for version-controlled SQL databases.

This is typically the first command run when starting a new Dolt project. The initialized repository can immediately accept table creation, data insertion, and commits. An initial branch is created (default name "main", customizable with `-b`).

User identity information (name and email) can be provided during initialization or inherited from global configuration. This identity is used for authorship of all subsequent commits.

The command will fail if the current directory already contains an initialized Dolt repository.

# SEE ALSO

[dolt-clone](/man/dolt-clone)(1), [dolt-status](/man/dolt-status)(1), [dolt-commit](/man/dolt-commit)(1), [dolt-sql](/man/dolt-sql)(1), [git-init](/man/git-init)(1)
