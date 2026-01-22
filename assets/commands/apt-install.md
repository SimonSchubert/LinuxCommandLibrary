# TLDR

**Install** a package or update it to the latest version

```sudo apt install [package]```

Display **verbose version information** during installation

```sudo apt install -V [package]```

Install a **specific version** of a package

```sudo apt install [package]=[version]```

Install **without prompting** for confirmation

```sudo apt install -y [package]```

**Reinstall** an already installed package

```sudo apt install --reinstall [package]```

# SYNOPSIS

**apt install** [_options_] _package_...

# DESCRIPTION

**apt install** is the standard command for installing packages on Debian-based distributions. It handles dependency resolution, downloads packages from configured repositories, and installs them on the system.

If the specified package is already installed, the command will upgrade it to the latest available version. Multiple packages can be specified in a single command.

# PARAMETERS

**-y, --yes**
> Automatic yes to prompts; assume "yes" as answer to all prompts

**-V, --verbose-versions**
> Show full versions for upgraded and installed packages

**--reinstall**
> Reinstall packages even if they are already up-to-date

**--no-install-recommends**
> Do not install recommended packages

**-d, --download-only**
> Download packages but do not install them

# CAVEATS

Requires root privileges. The command may remove conflicting packages to satisfy dependencies. Use **apt-get install** in scripts for more stable output formatting.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [dpkg](/man/dpkg)(1)
