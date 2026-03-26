# TAGLINE

Safely remove outdated kernel packages

# TLDR

**Remove old kernels, keeping the default 2 most recent**

```sudo purge-old-kernels```

**Keep a specific number of old kernels**

```sudo purge-old-kernels --keep [3]```

**Simulate removal without making changes**

```sudo purge-old-kernels -s```

**Remove old kernels without prompting for confirmation**

```sudo purge-old-kernels -y```

# SYNOPSIS

**purge-old-kernels** [_--keep N_] [_apt-get options..._]

# PARAMETERS

**--keep** _N_
> Number of old kernels to keep. Defaults to **2**.

_apt-get options_
> Any additional arguments are passed directly to **apt-get**(8). Common examples: **-y** (assume yes), **-s** (simulate/dry-run), **-q** (quiet).

# DESCRIPTION

**purge-old-kernels** removes old Linux kernel and header packages from Ubuntu and Debian systems to reclaim disk space, particularly in the **/boot** partition. Over time, kernel upgrades accumulate previous versions that are no longer needed, and this utility automates their safe removal. It will never remove the currently running kernel.

By default the tool keeps the **2** most recent kernels, configurable with the **--keep** option. Any additional arguments are passed directly to **apt-get**(8), so **-s** can be used for dry-run simulation and **-y** to skip confirmation. The command is part of the **byobu** package on Ubuntu/Debian systems and requires root privileges.

**Note:** This utility is now deprecated. Its functionality is expected to be integrated into **apt**(8).

# CAVEATS

Ubuntu/Debian specific. Requires root. The currently running kernel is never removed. Now deprecated in favor of apt(8) integration.

# HISTORY

purge-old-kernels was created for **Ubuntu** kernel package cleanup.

# SEE ALSO

[apt](/man/apt)(8), [dpkg](/man/dpkg)(1), [uname](/man/uname)(1)

