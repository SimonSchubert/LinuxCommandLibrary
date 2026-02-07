# TAGLINE

Print the bin directory path

# TLDR

**Print local bin directory** path

```bun pm bin```

**Print global bin directory** path

```bun pm bin -g```

# SYNOPSIS

**bun** **pm** **bin** [**-g**]

# PARAMETERS

**-g**, **--global**
> Print the global bin directory instead of local.

# DESCRIPTION

**bun pm bin** prints the path to the directory where package executables are installed. By default, it shows the local project's node_modules/.bin directory. With **-g**, it shows the global bin directory.

# SEE ALSO

[bun](/man/bun)(1), [bun-pm](/man/bun-pm)(1)
