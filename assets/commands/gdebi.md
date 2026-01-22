# TLDR

**Install** local .deb packages resolving dependencies

```gdebi [path/to/package.deb]```

Do not show **progress** information

```gdebi [path/to/package.deb] -q```

Set an **APT configuration option**

```gdebi [path/to/package.deb] -o [APT_OPTS]```

Use **alternative root** dir

```gdebi [path/to/package.deb] --root [path/to/root_directory]```

Display **version**

```gdebi --version```

# SYNOPSIS

**gdebi** [_options_] _package.deb_

# PARAMETERS

**-q**, **--quiet**
> Suppress progress information

**-o**, **--option** _APT_OPTS_
> Set an APT configuration option

**--root** _DIR_
> Use alternative root directory

**-n**, **--non-interactive**
> Run non-interactively (assume yes to all prompts)

**--apt-line**
> Print APT sources.list line for the package

**--version**
> Display version information

# DESCRIPTION

**gdebi** is a tool for installing local .deb packages on Debian-based systems. Unlike **dpkg -i**, gdebi automatically resolves and installs package dependencies from configured APT repositories before installing the local package.

This makes it ideal for installing downloaded .deb files that have dependencies not already satisfied on the system. gdebi will fetch required packages from the repository and install them in the correct order.

A graphical version (**gdebi-gtk**) is also available for desktop use.

# CAVEATS

Requires configured APT repositories to resolve dependencies. Cannot resolve dependencies that aren't available in configured repositories. For packages with complex dependencies, prefer adding a proper repository rather than installing standalone .deb files.

# HISTORY

gdebi was developed for Ubuntu and Debian to solve the common problem of installing downloaded .deb packages that dpkg alone cannot handle due to unmet dependencies. It became a standard tool in Ubuntu's desktop installations.

# SEE ALSO

[dpkg](/man/dpkg)(1), [apt](/man/apt)(8), [apt-get](/man/apt-get)(8)
