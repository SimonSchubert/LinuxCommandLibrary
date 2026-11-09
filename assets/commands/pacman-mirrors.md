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

Use mirrors from specific **countries**

```sudo pacman-mirrors --country [Germany,France]```

List available **countries**

```pacman-mirrors --country-list```

# SYNOPSIS

**pacman-mirrors** [_OPTIONS_]

# DESCRIPTION

**pacman-mirrors** generates and manages the pacman mirrorlist for Manjaro Linux. It tests mirror speeds, selects the fastest mirrors, and can switch between stable, testing, and unstable branches.

# PARAMETERS

**-f, --fasttrack** [_number_]
> Generate mirrorlist with a number of up-to-date mirrors, ranked by access time

**--status**
> Display the status of current mirrors

**--geoip**
> Use geolocation to select mirrors from your country

**--continent**
> Use mirrors from the geolocated continent

**-i, --interactive**
> Generate a custom mirrorlist interactively

**-G, --get-branch**
> Display the current branch

**-a, --api**
> Activate processing of API arguments such as --set-branch

**-S, -B, --set-branch** _branch_
> API: replace the branch in the configuration (stable, stable-staging, testing, unstable)

**-P, --proto, --protocols** _proto_ ...
> API: replace protocols in the configuration (all, http, https, ftp, ftps)

**-c, --country** _country_
> Limit mirrors to specific countries

**-l, --list, --country-list**
> List available countries

**-m, --method** _method_
> Generation method (rank, random)

**-t, --timeout** _seconds_
> Maximum waiting time for a server response

**-q, --quiet**
> Less verbose output

# CAVEATS

After generating a new mirrorlist, synchronize and upgrade with **sudo pacman -Syyu**. Switching branches (stable → testing → unstable) may introduce instability. The unstable branch tracks Arch Linux repositories more closely. Manjaro-specific; not available on Arch Linux (use **reflector** instead).

# HISTORY

**pacman-mirrors** is specific to **Manjaro Linux**, providing mirror management features not found in upstream Arch Linux.

# SEE ALSO

[pacman](/man/pacman)(8), [pacman-sync](/man/pacman-sync)(8)

# RESOURCES

```[Documentation](https://wiki.manjaro.org/index.php?title=Pacman-mirrors)```

<!-- verified: 2026-11-09 -->
