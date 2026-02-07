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

**minimize-manual**
> Mark all packages as auto except those with no auto-installed reverse depends

**-f, --file**
> Read/write package stats from the filename specified

**-v, --verbose**
> Verbose output

# CAVEATS

Holding packages may cause dependency issues during system upgrades. Use sparingly.

# HISTORY

Part of the **APT** (Advanced Package Tool) suite developed for Debian-based systems.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [dpkg](/man/dpkg)(1)
