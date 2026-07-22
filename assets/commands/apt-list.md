# TAGLINE

List packages matching criteria from the APT package database

# TLDR

**List all packages** available in configured repositories

```apt list```

List only **installed packages**

```apt list --installed```

List packages with **available upgrades**

```apt list --upgradable```

Show **all available versions** of each package

```apt list --all-versions```

Filter package names with a **shell pattern**

```apt list "[nginx*]"```

Combine **installed** filter with a pattern

```apt list --installed "[python3-*]"```

# SYNOPSIS

**apt list** [_options_] [_pattern_...]

# DESCRIPTION

**apt list** displays a list of packages tracked by the APT package manager. By default, it prints every package known to the configured sources, marking each line with the package name, version, architecture, and a status tag such as **[installed]**, **[installed,automatic]**, or **[upgradable from: ...]**.

The command accepts one or more shell-style patterns to filter the output by package name. Filters can be combined with **--installed**, **--upgradable**, or **--manual-installed** to narrow results to a specific state. Output is meant for interactive consumption and may change between releases.

For scripted use APT prints a warning to stderr; redirect stderr or use **dpkg-query** / **apt-cache pkgnames** when stable output is required.

# PARAMETERS

**--installed**
> Show only packages currently installed on the system.

**--upgradable**
> Show only installed packages for which a newer version is available.

**--manual-installed**
> Show only packages that were installed explicitly (not as a dependency).

**--all-versions**
> Show every available version of each package, not just the candidate.

**-v**, **--verbose**
> Print additional details such as the source repository.

**-q**, **--quiet**
> Suppress progress indicators; quieter output suitable for logs.

**-o** _OPTION=VALUE_
> Set an arbitrary APT configuration option for this invocation.

# CONFIGURATION

**/etc/apt/sources.list**
> Primary list of repositories queried by apt list.

**/etc/apt/sources.list.d/**
> Drop-in directory for additional repository definitions.

**/var/lib/apt/lists/**
> Cached package indexes; refreshed by **apt update** before listing reflects new versions.

# CAVEATS

APT explicitly warns that **apt** does not have a stable CLI; output formatting may change between releases. Use **dpkg-query -l** or **apt-cache** in scripts. Run **apt update** beforehand if recent repository changes should be visible. Pattern arguments are interpreted by the shell, so quote wildcards to prevent local file expansion.

# HISTORY

The **list** subcommand was introduced when **apt** was released in **Debian 8 (Jessie, 2015)** as a friendlier front-end to apt-get and apt-cache. It consolidates functionality previously split between **dpkg -l** and **apt-cache pkgnames** into a single human-oriented command.

# INSTALL

```apt: sudo apt install apt```

```dnf: sudo dnf install apt```

```pacman: sudo pacman -S apt```

```apk: sudo apk add apt```

```brew: brew install apt```

```nix: nix profile install nixpkgs#apt```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[apt](/man/apt)(8), [apt-cache](/man/apt-cache)(8), [apt-get](/man/apt-get)(8), [dpkg-query](/man/dpkg-query)(1), [dpkg](/man/dpkg)(1)
