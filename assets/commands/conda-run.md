# TAGLINE

environment command executor

# TLDR

**Run a command** in an environment

```conda run -n [env_name] [command]```

**Run Python script** in environment

```conda run -n [env_name] python [script.py]```

**Run with live output**

```conda run --live-stream -n [env_name] [command]```

# SYNOPSIS

**conda** **run** [_options_] _command_

# PARAMETERS

**-n**, **--name** _name_
> Run in named environment.

**-p**, **--prefix** _path_
> Run in environment at path.

**--live-stream**
> Stream output in real-time.

**--no-capture-output**
> Don't capture stdout/stderr.

# CONFIGURATION

**~/.condarc**
> User-level conda configuration for channels, package settings, and solver options.

**/opt/conda/.condarc**
> System-wide conda configuration.

# DESCRIPTION

**conda run** executes a command within a conda environment without activating it. This is useful for scripts and automation where you need to run commands in different environments.

# SEE ALSO

[conda](/man/conda)(1), [conda-activate](/man/conda-activate)(1)
