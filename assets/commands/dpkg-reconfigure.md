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

**dpkg-reconfigure** reconfigures already installed packages. It runs the package's configuration scripts again, allowing you to change settings made during installation.

Useful for reconfiguring locales, keyboard layout, timezone, and other system settings.

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
