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

**dolt init** creates an empty Dolt repository in the current directory. Initializes the .dolt directory structure for version-controlled database storage.

# SEE ALSO

[dolt-clone](/man/dolt-clone)(1), [dolt-status](/man/dolt-status)(1)

