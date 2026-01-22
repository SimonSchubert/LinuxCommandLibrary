# TLDR

**Install** package via apt: URL

```apturl apt:firefox```

Install **multiple** packages

```apturl "apt:vim,git,curl"```

Install from **PPA**

```apturl "apt:package?channel=ppa:user/ppa-name"```

# SYNOPSIS

**apturl** _apt:package_[,_package_...]

# DESCRIPTION

**apturl** handles apt: protocol URLs, enabling one-click package installation from web pages. When a user clicks an apt: link, apturl launches and prompts for confirmation before installing the specified packages.

This provides a user-friendly way to install software without using the command line.

# PARAMETERS

**apt:package**
> Package to install

**apt:package1,package2**
> Multiple packages

**?channel=**
> Repository/PPA source

**?section=**
> Repository section

# CAVEATS

Requires graphical environment. Should only be used with trusted links. PPA installations add external repositories. Verification dialogs should be read carefully.

# HISTORY

**apturl** was developed for Ubuntu to simplify software installation, allowing websites to offer direct installation links for Linux packages.

# SEE ALSO

[apt](/man/apt)(8), [software-center](/man/software-center)(1)
