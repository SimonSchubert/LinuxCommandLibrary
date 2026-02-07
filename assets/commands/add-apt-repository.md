# TAGLINE

Manage APT repository sources

# TLDR

**Add** a new apt repository

```add-apt-repository [repository_spec]```

**Remove** an apt repository

```add-apt-repository -r [repository_spec]```

**Update** the package cache after adding a repository

```add-apt-repository --update [repository_spec]```

Allow **source packages** to be downloaded from the repository

```add-apt-repository -s [repository_spec]```

Add a **PPA** (Personal Package Archive)

```add-apt-repository ppa:[user]/[ppa-name]```

**List** currently configured repositories

```add-apt-repository -L```

# SYNOPSIS

**add-apt-repository** [_OPTIONS_] [_LINE_]

# DESCRIPTION

**add-apt-repository** is a Debian/Ubuntu utility that manages third-party APT repository sources. It can add entries to /etc/apt/sources.list or create individual files in /etc/apt/sources.list.d/, and can also remove previously added repositories.

The tool is most commonly used to add PPAs (Personal Package Archives) from Launchpad, handling both the source list entry and the associated GPG key import automatically. It can optionally update the package cache after modifying sources.

# PARAMETERS

**-r, --remove**
> Remove specified repository (disables matching lines; deletes empty source files)

**-y, --yes**
> Assume affirmative responses to prompts

**-n, --no-update**
> Skip package cache updates after adding repository

**-s, --enable-source**
> Allow downloading of source packages from the repository

**-c, --component**
> Specify repository component(s); defaults to 'main' if unspecified

**-p, --pocket**
> Define pocket type (defaults to release pocket)

**-P, --ppa**
> Add Ubuntu Launchpad Personal Package Archive (format: ppa:USER/PPA)

**-C, --cloud**
> Add Ubuntu Cloud Archive (format: cloud-archive:CANAME)

**-U, --uri**
> Add archive via single URI

**-S, --sourceslist**
> Add archive using full sources.list format line

**-L, --list**
> List currently configured repositories

**-l, --login**
> Authenticate to Launchpad for private PPA access

**--dry-run**
> Preview changes without executing them

**-d, --debug**
> Output debug information

# CAVEATS

This utility is **Debian/Ubuntu specific** and not available on other Linux distributions. Adding third-party repositories may introduce security risks.

# HISTORY

Developed for **Ubuntu** to simplify the process of adding PPAs (Personal Package Archives) and other third-party repositories.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [sources.list](/man/sources.list)(5), [apt-key](/man/apt-key)(8)
