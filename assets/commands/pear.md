# TAGLINE

PHP Extension and Application Repository manager

# TLDR

**Install a package**

```pear install [package]```

**Upgrade a package**

```pear upgrade [package]```

**List installed packages**

```pear list```

**Search for packages**

```pear search [keyword]```

**Uninstall a package**

```pear uninstall [package]```

# SYNOPSIS

**pear** [_options_] _command_ [_command-options_] _args_

# PARAMETERS

**install**
> Install packages.

**upgrade**
> Upgrade packages.

**uninstall**
> Remove packages.

**list**
> List installed packages.

**search**
> Search for packages.

**info**
> Package information.

**channel-discover**
> Add new channel.

# DESCRIPTION

**pear** is the PHP Extension and Application Repository manager. It installs, upgrades, and manages PHP packages and extensions, predating Composer as PHP's primary package manager.
# Install package
pear install Mail

# Install from specific channel
pear channel-discover pear.phpunit.de
pear install phpunit/PHPUnit

# List outdated packages
pear list-upgrades

# Get package info
pear info DB
```

# CHANNELS

```bash
# Add channel
pear channel-discover pear.example.com

# List channels
pear list-channels
```

# CAVEATS

Being superseded by Composer for most use cases. Still used for PHP extensions. Requires root for system-wide installs.

# HISTORY

PEAR was started in 1999 by **Stig Bakken** as part of the PHP project to provide a standard package system.

# SEE ALSO

[pecl](/man/pecl)(1), [composer](/man/composer)(1), [php](/man/php)(1)
