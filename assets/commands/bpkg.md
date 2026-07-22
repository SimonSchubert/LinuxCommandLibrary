# TAGLINE

Package manager for bash scripts.

# TLDR

**Install a package globally**

```bpkg install [package-name] -g```

**Install a specific version**

```bpkg install [package-name]@[version]```

**Install package locally** (in ./deps/)

```bpkg install [package-name]```

**Install dependencies** from bpkg.json

```bpkg getdeps```

**Run a package script**

```bpkg run [script-name]```

**Run a script with arguments**

```bpkg run [script-name] "[arg1]" "[arg2]"```

**List available scripts**

```bpkg run --list```

**Get package info**

```bpkg package```

# SYNOPSIS

**bpkg** [_-hV_] _command_ [_arguments_]

# DESCRIPTION

**bpkg** is a lightweight bash package manager that fetches and installs shell scripts from GitHub repositories. It handles downloading, setting permissions, and organizing scripts either globally or on a per-project basis.

Packages are configured using a **bpkg.json** file that defines metadata, dependencies, and executable scripts. The tool works similarly to npm for Node.js or pip for Python.

# SUBCOMMANDS

**install**
> Install a package (globally with -g, locally without)

**getdeps**
> Install dependencies defined in bpkg.json

**run**
> Execute a script defined in the package

**package**
> Display package metadata

**update**
> Update the local bpkg index of available packages

**source**
> Source a package's bash files into the current shell

**init**
> Interactively create a bpkg.json file

**json**
> Parse and query JSON (used internally)

**show**
> Show package readme or details from the index

**list**
> List packages available in the local index

**term**
> Terminal utilities

# PARAMETERS

**-g, --global**
> Install package globally to ${PREFIX:-/usr/local/bin}

**-d, --dev**
> Install development dependencies as well

**-l, --list**
> List available commands (with run)

**-h, --help**
> Show help message

**-V, --version**
> Show version information

**@version**
> Specify package version (e.g., package@1.0.0)

# CAVEATS

Packages must have a valid **bpkg.json** or **package.json** file. Global installation requires appropriate write permissions to the target directory. Dependencies are installed recursively in deps/ subdirectories.

# HISTORY

bpkg was created as a simple package manager specifically for bash scripts, inspired by package managers like npm. It provides a standardized way to share and reuse shell script utilities across projects.

# INSTALL

```dnf: sudo dnf install bpkg```

```nix: nix profile install nixpkgs#bpkg```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[bash](/man/bash)(1), [npm](/man/npm)(1), [basher](/man/basher)(1)

# RESOURCES

```[Source code](https://github.com/bpkg/bpkg)```

```[Homepage](https://bpkg.sh)```

<!-- verified: 2026-06-19 -->
