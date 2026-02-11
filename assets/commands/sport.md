# TAGLINE

SlackBuilds package management tool

# TLDR

**Update** the slackbuilds tree via rsync

```sudo sport rsync```

**Search** for a package by name

```sport search "[keyword]"```

**Check** if a package is installed

```sport check [package]```

Display **README and info** files

```sport cat [package]```

**Install** a package

```sudo sport install [package]```

Install packages from a **list file**

```sudo sport install $(< [path/to/list])```

# SYNOPSIS

**sport** _command_ [_arguments_]

# COMMANDS

**rsync**
> Update the local SlackBuilds tree from slackbuilds.org

**search** _keyword_
> Search for packages by name

**check** _package_
> Check if a package is installed

**cat** _package_
> Display README and .info files for a package

**install** _package_
> Build and install a SlackBuild package

# DESCRIPTION

**sport** is a SlackBuilds package management tool for Slackware Linux. It provides a simple interface to search, view information about, and install packages from the SlackBuilds.org repository.

The tool maintains a local copy of the SlackBuilds tree in **/usr/ports**, synced via rsync. Before first use, the tree must be initialized. Dependencies must be resolved manually before installation.

# INITIAL SETUP

To set up sport for first use:

```
sudo mkdir -p /usr/ports
sudo rsync -av rsync://slackbuilds.org/slackbuilds/$(awk '{print $2}' /etc/slackware-version)/ /usr/ports/
```

# CAVEATS

Dependencies are not automatically resolved; check .info files for requirements. Builds compile from source, requiring development tools. The SlackBuilds tree must be kept updated with **sport rsync**. Specific to Slackware-based distributions.

# HISTORY

**sport** was created for Slackware Linux to simplify working with SlackBuilds.org, the community repository of build scripts for Slackware. SlackBuilds.org was established in **2006** to provide a standardized way of building third-party software for Slackware.

# SEE ALSO

[sbopkg](/man/sbopkg)(8), [slackpkg](/man/slackpkg)(8), [slapt-src](/man/slapt-src)(8)
