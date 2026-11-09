# TAGLINE

local .deb package installer with dependency resolution

# TLDR

**Install** local .deb packages resolving dependencies

```gdebi [path/to/package.deb]```

Install **without prompting** (dangerous)

```sudo gdebi --non-interactive [path/to/package.deb]```

**Simulate** only and print the required package changes

```gdebi --apt-line [path/to/package.deb]```

Do not show **progress** information

```gdebi --quiet [path/to/package.deb]```

Set an **APT configuration option**

```gdebi --option [Name=Value] [path/to/package.deb]```

Use **alternative root** directory

```gdebi --root [path/to/root_directory] [path/to/package.deb]```

Display **version**

```gdebi --version```

# SYNOPSIS

**gdebi** [_options_] _package.deb_

# PARAMETERS

**-q**, **--quiet**
> Suppress progress information

**-o**, **--option** _APT_OPTS_
> Set an APT configuration option. May be repeated.

**--root** _DIR_
> Use alternative root directory

**-n**, **--non-interactive**
> Run non-interactively, installing without asking for confirmation. Upstream labels this as dangerous.

**--apt-line**
> Simulate only and print the packages to install and remove in apt-get compatible form

**--version**
> Display version information

**-h**, **--help**
> Display help

# DESCRIPTION

**gdebi** is a tool for installing local .deb packages on Debian-based systems. Unlike **dpkg -i**, gdebi automatically resolves and installs package dependencies from configured APT repositories before installing the local package.

This makes it ideal for installing downloaded .deb files that have dependencies not already satisfied on the system. gdebi will fetch required packages from the repository and install them in the correct order.

A graphical version (**gdebi-gtk**) is also available for desktop use.

# CAVEATS

Installing requires root privileges. Requires configured APT repositories to resolve dependencies. Cannot resolve dependencies that aren't available in configured repositories. For packages with complex dependencies, prefer adding a proper repository rather than installing standalone .deb files. Modern APT can do the same job with **apt install ./package.deb**.

# HISTORY

gdebi was developed for Ubuntu and Debian to solve the common problem of installing downloaded .deb packages that dpkg alone cannot handle due to unmet dependencies. It became a standard tool in Ubuntu's desktop installations.

# SEE ALSO

[dpkg](/man/dpkg)(1), [apt](/man/apt)(8), [apt-get](/man/apt-get)(8)

# RESOURCES

```[Source code](https://launchpad.net/gdebi)```

<!-- verified: 2026-11-09 -->
