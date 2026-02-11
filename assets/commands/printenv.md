# TAGLINE

Display environment variable values

# TLDR

**Print all environment variables**

```printenv```

**Print specific variable**

```printenv [HOME]```

**Print multiple variables**

```printenv [PATH] [USER] [SHELL]```

**Print with null separator** (for xargs)

```printenv -0```

# SYNOPSIS

**printenv** [_options_] [_variable_...]

# DESCRIPTION

**printenv** prints the values of environment variables. When called without arguments, it prints all environment variables. When given variable names as arguments, it prints only those values.

Unlike `echo $VAR`, printenv shows nothing (and returns non-zero) for undefined variables, making it useful for testing variable existence in scripts.

printenv is part of GNU coreutils and provides a straightforward way to inspect the shell environment.

# PARAMETERS

**-0**, **--null**
> End each line with NUL instead of newline.

**--help**
> Display help information.

**--version**
> Display version information.

# CAVEATS

Only shows exported environment variables, not shell-local variables. For shell variables, use `echo $VAR` or `set` command. Variable names are case-sensitive.

# HISTORY

**printenv** has been part of Unix systems since **BSD 4.2** in **1983**. The GNU version is part of **coreutils**. It provides a portable way to access environment variables across different shells.

# SEE ALSO

[env](/man/env)(1), [export](/man/export)(1), [set](/man/set)(1)
