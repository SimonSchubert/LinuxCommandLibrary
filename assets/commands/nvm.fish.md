# TAGLINE

Node Version Manager for Fish shell

# TLDR

**Install** a specific Node.js **version**

```nvm install [version]```

**Install** the latest **LTS** version

```nvm install lts```

**Install** version from **.nvmrc** or **.node-version** file

```nvm install```

**Use** a specific installed version

```nvm use [version]```

**List installed** versions

```nvm list```

**List all available** remote versions

```nvm list-remote```

**Set default** version for new shells

```set --universal nvm_default_version [version]```

**Uninstall** a version

```nvm uninstall [version]```

# SYNOPSIS

**nvm** [_command_] [_version_]

# PARAMETERS

**install** _VERSION_
> Install a Node.js version. Accepts specific versions (v18.4.0), partial versions (v18), or aliases (latest, lts).

**use** _VERSION_
> Activate an installed Node.js version in the current environment.

**list**
> List installed Node.js versions, including system Node if present.

**list-remote**
> Show all available Node.js versions from the mirror.

**current**
> Show the currently active Node.js version.

**uninstall** _VERSION_
> Remove an installed Node.js version.

# CONFIGURATION

**$nvm_default_version**
> Default Node.js version for new shell sessions. Set with `set --universal nvm_default_version VERSION`.

**$nvm_default_packages**
> Packages to auto-install with each new Node.js version. Set with `set --universal nvm_default_packages yarn np`.

**$nvm_data**
> Storage location for Node.js binaries. Defaults to `$XDG_DATA_HOME/nvm` (~/.local/share/nvm).

**$nvm_mirror**
> Node.js binary download mirror. Defaults to https://nodejs.org/dist.

# DESCRIPTION

**nvm.fish** is a pure Fish shell implementation of Node Version Manager, created by **jorgebucaran**. It provides a lightweight way to install, switch between, and manage multiple Node.js versions directly within the Fish shell.

Unlike the original bash-based nvm, nvm.fish is written entirely in Fish with no external dependencies. It supports **.nvmrc** and **.node-version** files for automatic version switching per project, and is XDG Base Directory compliant.

Installation is typically done via **Fisher** (`fisher install jorgebucaran/nvm.fish`) or by manually copying the functions and completions.

# CAVEATS

Fish shell specific and not compatible with bash nvm or its configuration. The **nvm install** command activates the installed version only in the current environment; use **$nvm_default_version** to persist across sessions. Requires Fish 3.x or later.

# HISTORY

**nvm.fish** was created in **2016** by **jorgebucaran** as a native Fish shell implementation of Node Version Manager, inspired by the original **nvm.sh** by creationix and ljharb.

# SEE ALSO

[nvm](/man/nvm)(1), [fish](/man/fish)(1), [fnm](/man/fnm)(1), [node](/man/node)(1), [fisher](/man/fisher)(1)

