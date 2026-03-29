# TAGLINE

Install packages from apt: protocol URLs

# TLDR

**Install** package via apt: URL

```apturl apt:firefox```

Install **multiple** packages

```apturl "apt:vim,git,curl"```

Install from a specific **repository section**

```apturl "apt:[package]?section=universe"```

# SYNOPSIS

**apturl** [_options_] _apt:package_[,_package_...]

# DESCRIPTION

**apturl** is a simple graphical application that takes an apt-protocol URL as a command line option and handles package installation. When a user clicks an apt: link in a web browser, apturl launches and prompts for confirmation before installing the specified packages.

It has been pre-installed on Ubuntu since version 7.10, providing a user-friendly way to install software without using the command line.

# PARAMETERS

**-p**, **--http-proxy**
> Specify an HTTP proxy for package downloads

**apt:_package_**
> Package to install

**apt:_package1_,_package2_**
> Multiple packages to install

**?channel=**
> Repository or PPA source (e.g., ?channel=lucid-partner)

**?section=**
> Repository section to enable (e.g., ?section=universe)

**?refresh=yes**
> Force a repository refresh before looking for the package

# CAVEATS

Requires a graphical environment (X11/Wayland). Should only be used with trusted links. Verification dialogs should be read carefully. Exit codes: 0 = success, 1 = cancelled, 2 = error, 3 = invalid arguments.

# HISTORY

**apturl** was developed for Ubuntu to simplify software installation, allowing websites to offer direct installation links for Linux packages.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [dpkg](/man/dpkg)(1), [snap](/man/snap)(8)
