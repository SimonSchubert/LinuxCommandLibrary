# TAGLINE

reconfigure installed Debian packages

# TLDR

**Reconfigure** packages

```dpkg-reconfigure [package1] [package2]```

Reconfigure **console font** setup

```dpkg-reconfigure console-setup```

Reconfigure **timezone**

```dpkg-reconfigure tzdata```

# SYNOPSIS

**dpkg-reconfigure** [_options_] _packages_

# DESCRIPTION

**dpkg-reconfigure** reconfigures already installed packages on Debian-based systems. It runs a package's post-installation configuration scripts again, presenting the same prompts shown during initial installation and allowing you to change previously configured settings.

The tool uses the debconf system to manage configuration questions and responses. It's particularly useful for system settings that are difficult to change manually, such as locales, keyboard layouts, timezones, and display manager configurations.

Different frontends (dialog, readline, noninteractive) control how questions are presented, making it suitable for both interactive terminal sessions and automated scripts.

# PARAMETERS

**-f, --frontend** _frontend_
> Use specified frontend (dialog, readline, noninteractive)

**-p, --priority** _priority_
> Priority of questions (low, medium, high, critical)

**-a, --all**
> Reconfigure all packages

**--default-priority**
> Use default priority

# CAVEATS

Debian/Ubuntu specific. Not all packages support reconfiguration. Some reconfigurations require root privileges.

# SEE ALSO

[dpkg](/man/dpkg)(1), [debconf](/man/debconf)(7)
