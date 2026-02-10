# TAGLINE

generates and manages the pacman mirrorlist for Manjaro Linux

# TLDR

Generate **fastest** mirrorlist

```sudo pacman-mirrors --fasttrack```

Check mirror **status**

```pacman-mirrors --status```

Display current **branch**

```pacman-mirrors --get-branch```

**Switch** branch

```sudo pacman-mirrors --api --set-branch stable```

Use **geoip** mirrors

```sudo pacman-mirrors --geoip```

# SYNOPSIS

**pacman-mirrors** [_OPTIONS_]

# DESCRIPTION

**pacman-mirrors** generates and manages the pacman mirrorlist for Manjaro Linux. It tests mirror speeds, selects the fastest mirrors, and can switch between stable, testing, and unstable branches.

# PARAMETERS

**-f, --fasttrack** [_number_]
> Generate mirrorlist with the fastest mirrors

**--status**
> Display the status of current mirrors

**-g, --geoip**
> Use geolocation to select mirrors from your country

**--get-branch**
> Display the current branch

**--api**
> Use the API for branch switching

**--set-branch** _branch_
> Set the branch (stable, testing, unstable)

**-c, --country** _country_
> Limit mirrors to specific countries

**-l, --list**
> List available countries

# CAVEATS

After running pacman-mirrors, always synchronize and upgrade with **sudo pacman -Syyu**. Switching branches may introduce instability. The unstable branch tracks Arch Linux more closely.

# HISTORY

**pacman-mirrors** is specific to **Manjaro Linux**, providing mirror management features not found in upstream Arch Linux.

# SEE ALSO

[pacman](/man/pacman)(8), [pacman-sync](/man/pacman-sync)(8)
