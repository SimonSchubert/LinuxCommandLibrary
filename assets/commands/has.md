# TAGLINE

Check presence of command line tools and their versions

# TLDR

**Check if specific tools are available**

```has [git] [node] [python3]```

**Check a list of tools** and report missing ones

```has [docker] [kubectl] [helm] [terraform]```

**Use in a script** to verify dependencies

```has [make] [gcc] && echo "Ready to build"```

# SYNOPSIS

**has** _command_ [_command_...]

# DESCRIPTION

**has** is a simple shell script that checks the presence of various command-line tools on your PATH and reports their installed versions. It provides a quick way to verify that all required dependencies are available before running a build, deployment, or setup script.

For each command passed as an argument, **has** checks if it exists on the PATH and attempts to determine its version. Found tools are displayed with a green checkmark and their version number, while missing tools are shown with a red cross. The exit status code reflects the number of commands not found.

# CAVEATS

**has** is a single bash script with no dependencies beyond bash itself. Version detection relies on common flags like **--version** and **-v**, which may not work for all tools. Some tools may report version information in non-standard formats.

# HISTORY

**has** was created by **Kunal Dabir** (kdabir) as a lightweight utility for verifying development environment prerequisites. It is implemented as a single **bash** script, making it trivially installable on any Unix-like system.

# SEE ALSO

[which](/man/which)(1), [command](/man/command)(1), [type](/man/type)(1)
