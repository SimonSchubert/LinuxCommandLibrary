# TLDR

**Search for a binary in available packages**

```scout bin [command_name]```

**Search for a Java class**

```scout java [class_name]```

**Search for an autoconf macro**

```scout autoconf [macro_name]```

**Search for a Python module**

```scout python [module_name]```

**Search using a specific repository**

```scout -r [repo_name] bin [command_name]```

# SYNOPSIS

**scout** [_module_] [_options_] [_search_term_]

# PARAMETERS

**bin**
> Search for binaries/executables in packages

**java**
> Search for Java classes in packages

**python**
> Search for Python modules in packages

**autoconf**
> Search for autoconf macros in packages

**-r** _repo_, **--repo**=_repo_
> Specify repository to search (default: zypp)

**-p**, **--package**
> Display package names only

**-l**, **--listrepos**
> List available repositories

# DESCRIPTION

**Scout** is an openSUSE command-line utility for searching packages by various attributes such as binaries, Java classes, Python modules, and autoconf macros. It powers the "command-not-found" feature in bash and zsh.

When you type an unknown command, the shell automatically invokes scout to find which package provides it and suggests installation via zypper. Scout searches package indexes without requiring packages to be installed.

The tool integrates with the zypp package management system and can query multiple repositories.

# CAVEATS

Scout relies on pre-built indexes that may not include all packages or the latest additions. The command-not-found handler is automatically enabled in bash and zsh on openSUSE systems.

# HISTORY

Scout was developed by the **openSUSE** project to provide helpful suggestions when users type commands that are not installed. The project has been succeeded by **cnf** (command-not-found) in newer openSUSE releases.

# SEE ALSO

[zypper](/man/zypper)(8), [cnf](/man/cnf)(1), [pkgfile](/man/pkgfile)(1), [apt-file](/man/apt-file)(1)
