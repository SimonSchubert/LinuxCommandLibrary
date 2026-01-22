# TLDR

**List installed packages**

```npm ls```

**List all depths**

```npm ls --all```

**List specific package**

```npm ls [package-name]```

**List global packages**

```npm ls -g```

**JSON output**

```npm ls --json```

**Production only**

```npm ls --production```

**Show depth**

```npm ls --depth=[2]```

# SYNOPSIS

**npm** **ls** [_package_] [_options_]

# PARAMETERS

_PACKAGE_
> Package to find.

**--all**
> Show all dependencies.

**-g**
> Global packages.

**--json**
> JSON output.

**--depth** _N_
> Tree depth.

**--help**
> Display help information.

# DESCRIPTION

**npm ls** lists installed packages. Shows dependency tree.

The command displays package hierarchy. Identifies dependency versions.

npm ls shows installed packages.

# CAVEATS

Alias: npm list. Tree can be large. Use depth to limit.

# HISTORY

npm ls provides **dependency visualization** for understanding package relationships.

# SEE ALSO

[npm](/man/npm)(1), [npm-explain](/man/npm-explain)(1), [npm-outdated](/man/npm-outdated)(1)

