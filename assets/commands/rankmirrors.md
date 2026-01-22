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

**rankmirrors** tests Arch Linux package mirrors for connection speed and response time, then outputs a sorted mirrorlist. Faster mirrors appear first in the output.

The tool is useful for optimizing package download speeds by selecting the fastest mirrors for your location. Output can be redirected to update the system mirrorlist.

# CAVEATS

Testing takes time as each mirror is contacted. Network conditions may vary. Part of pacman-contrib, not pacman itself. Consider reflector for automated updates.

# HISTORY

**rankmirrors** has been part of Arch Linux tooling to help users optimize their mirror selection. While still functional, many users now prefer reflector for automated mirror management.

# SEE ALSO

[pacman](/man/pacman)(8), [reflector](/man/reflector)(1), [pacman-mirrors](/man/pacman-mirrors)(1)
