# TLDR

Synchronize repositories set to **auto-sync**

```sudo emaint sync [-a|--auto]```

Synchronize a **specific** repository

```sudo emaint sync [-r|--repo] [repository]```

Synchronize **all** repositories

```sudo emaint sync [-A|--allrepos]```

**Clear** the Portage resume list

```sudo emaint cleanresume [-f|--fix]```

**Clean** Portage logs

```sudo emaint logs [-C|--clean]```

# SYNOPSIS

**emaint** _module_ [_options_]

# DESCRIPTION

**emaint** performs Portage maintenance tasks on Gentoo systems. It handles repository synchronization, database cleanup, log management, and other administrative functions.

Preferred over deprecated `emerge --sync` for repository updates.

# PARAMETERS

**sync**
> Synchronize repositories

**-a, --auto**
> Sync auto-sync enabled repos

**-r, --repo** _name_
> Sync specific repository

**-A, --allrepos**
> Sync all repositories

**cleanresume**
> Clear resume list

**logs**
> Manage log files

**-C, --clean**
> Clean old entries

**-f, --fix**
> Apply fixes

# CAVEATS

Gentoo Linux specific. Requires root privileges. Part of the Portage package management system.

# SEE ALSO

[emerge](/man/emerge)(1), [eselect](/man/eselect)(1)
