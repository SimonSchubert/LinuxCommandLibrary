# TLDR

**Set** an environment variable

```export [VARIABLE]=[value]```

**Unset** an environment variable

```export -n [VARIABLE]```

Export a **function** to child processes

```export -f [FUNCTION_NAME]```

**Append** a pathname to PATH

```export PATH=$PATH:[path/to/append]```

**Print** list of exported variables

```export -p```

# SYNOPSIS

**export** [_options_] [_name_[=_value_]]

# DESCRIPTION

**export** marks shell variables for export to child processes. Exported variables become environment variables visible to all commands run from the shell.

Built-in shell command for managing the process environment.

# PARAMETERS

**-n**
> Remove export property from variable

**-f**
> Export shell functions

**-p**
> Print all exported variables

# CAVEATS

Shell built-in command. Changes only affect current shell and its children. Variables set without export are local to the shell. Use in shell scripts and startup files.

# SEE ALSO

[env](/man/env)(1), [set](/man/set)(1), [bash](/man/bash)(1)
