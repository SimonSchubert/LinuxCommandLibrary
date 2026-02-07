# TAGLINE

create new database repository

# TLDR

**Initialize a Dolt repository**

```dolt init```

**Initialize with specific branch name**

```dolt init -b [main]```

# SYNOPSIS

**dolt** **init** [_options_]

# PARAMETERS

**-b**, **--initial-branch** _string_
> Name of initial branch (default "main").

**--name** _string_
> Author name for initial commit.

**--email** _string_
> Author email for initial commit.

# DESCRIPTION

**dolt init** creates a new, empty Dolt repository in the current directory. It initializes the .dolt directory structure containing metadata, configuration, and the underlying storage for version-controlled databases.

This is typically the first command run when starting a new Dolt project. The initialized repository can immediately accept table creation, data insertion, and commits. An initial branch is created (default name "main", customizable with -b).

User identity information (name and email) can be provided during initialization or inherited from global configuration. This identity is used for authorship of all subsequent commits.

# SEE ALSO

[dolt-clone](/man/dolt-clone)(1), [dolt-status](/man/dolt-status)(1)

