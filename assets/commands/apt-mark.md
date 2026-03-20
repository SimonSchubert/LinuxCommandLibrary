# TAGLINE

Change the install state of packages.

# TLDR

Mark a package as **automatically installed**

```sudo apt-mark auto [package]```

Mark a package as **manually installed**

```sudo apt-mark manual [package]```

**Hold** a package at its current version

```sudo apt-mark hold [package]```

**Allow** a package to be updated again

```sudo apt-mark unhold [package]```

Show **manually installed** packages

```apt-mark showmanual```

Show **automatically installed** packages

```apt-mark showauto```

Show **held** packages

```apt-mark showhold```

# SYNOPSIS

**apt-mark** [_options_] _command_ _package_...

# DESCRIPTION

**apt-mark** is a utility to change the status of installed packages. It can mark packages as automatically installed (making them candidates for autoremove), manually installed, or held at their current version.

# PARAMETERS

**auto package**
> Mark package as automatically installed

**manual package**
> Mark package as manually installed

**hold package**
> Hold package at current version, preventing upgrades

**unhold package**
> Remove hold, allowing package to be upgraded

**showmanual**
> Show list of manually installed packages

**showauto**
> Show list of automatically installed packages

**showhold**
> Show list of held packages

**showinstall**
> Show list of packages marked as install

**showremove**
> Show list of packages marked for removal

**showpurge**
> Show list of packages marked for purge

**minimize-manual**
> Mark all dependency packages as auto, keeping only directly needed packages as manual

**-f, --file filename**
> Read/write package stats from the specified filename instead of default location

**-v, --verbose**
> Verbose output

**-c, --config-file**
> Specify a configuration file to use

**-o, --option**
> Set a configuration option (syntax: -o Foo::Bar=bar)

# CAVEATS

Holding packages may cause dependency issues during system upgrades. Use sparingly.

# HISTORY

Part of the **APT** (Advanced Package Tool) suite developed for Debian-based systems.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [dpkg](/man/dpkg)(1)
