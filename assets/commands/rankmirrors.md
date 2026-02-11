# TAGLINE

Rank Arch Linux pacman mirrors by speed

# TLDR

**Rank** mirrorlist

```rankmirrors [/etc/pacman.d/mirrorlist]```

Output top **N** mirrors

```rankmirrors -n [5] [/etc/pacman.d/mirrorlist]```

**Verbose** output

```rankmirrors -v [/etc/pacman.d/mirrorlist]```

Test **specific URL**

```rankmirrors -u [url]```

Show **response times** only

```rankmirrors -t [/etc/pacman.d/mirrorlist]```

# SYNOPSIS

**rankmirrors** [**-n** _number_] [**-v**] [**-t**] [**-u** _url_] _mirrorlist_

# PARAMETERS

**-n _number_**
> Output only top N mirrors

**-v, --verbose**
> Verbose output during ranking

**-t, --times**
> Output response times instead of mirrorlist

**-u, --url _url_**
> Test specific URL only

**-r, --repo _repo_**
> Specify repository for testing

# DESCRIPTION

**rankmirrors** tests Arch Linux pacman package mirrors by measuring connection speed and response time, then outputs a sorted mirrorlist with the fastest mirrors first. It connects to each mirror in the input file, downloads a small test file, and ranks results by transfer rate, helping users optimize package download performance for their geographic location.

The output follows the standard mirrorlist format and can be redirected to replace **/etc/pacman.d/mirrorlist** directly. The **-n** flag limits output to only the top N fastest mirrors, and **-t** displays raw response times for comparison without generating a new mirrorlist.

# CAVEATS

Testing takes time as each mirror is contacted. Network conditions may vary. Part of pacman-contrib, not pacman itself. Consider reflector for automated updates.

# HISTORY

**rankmirrors** has been part of Arch Linux tooling to help users optimize their mirror selection. While still functional, many users now prefer reflector for automated mirror management.

# SEE ALSO

[pacman](/man/pacman)(8), [reflector](/man/reflector)(1), [pacman-mirrors](/man/pacman-mirrors)(1)
