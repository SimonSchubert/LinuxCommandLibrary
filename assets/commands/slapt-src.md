# TLDR

**Update** the list of available slackbuilds

```slapt-src -u```

**List** all available slackbuilds

```slapt-src -l```

**Install** a slackbuild (fetch, build, install)

```slapt-src -i [slackbuild_name]```

**Search** for slackbuilds by name or description

```slapt-src -s [search_term]```

**Show** information about a slackbuild

```slapt-src -w [slackbuild_name]```

# SYNOPSIS

**slapt-src** [_OPTIONS_] [_slackbuild_name_...]

# PARAMETERS

**-u, --update**
> Update the list of available slackbuilds from configured sources

**-l, --list**
> List all available slackbuilds

**-i, --install** _name_
> Fetch, build, and install the specified slackbuild(s)

**-s, --search** _term_
> Search for slackbuilds by name or description

**-w, --show** _name_
> Display detailed information about a slackbuild

**-b, --build** _name_
> Build slackbuild without installing

**-f, --fetch** _name_
> Download slackbuild sources only

**--yes**
> Assume yes to all prompts

**--no**
> Assume no to all prompts

**-c, --config** _file_
> Use alternate configuration file

**-h, --help**
> Display help information

# DESCRIPTION

**slapt-src** automates building packages from SlackBuilds, providing a workflow similar to binary package management with **slapt-get**. It handles querying, retrieving, building, and installing SlackBuild packages from configured repositories.

SlackBuild sources are configured in the **slapt-srcrc** configuration file, which specifies repository locations (SOURCE), build directory (BUILDDIR), package extension (PKGEXT), and package tag (PKGTAG).

# CAVEATS

Requires **slapt-get** and **curl** as dependencies. SlackBuilds are source packages that compile on your system, which can be time-consuming for large packages. Build dependencies must be satisfied before compilation. Configuration must point to valid SlackBuild repositories.

# HISTORY

**slapt-src** was created by **Jason Woodward** (jaos) as a companion to **slapt-get** for Slackware Linux. The project began around **2010** to provide an apt-like experience for SlackBuild management. It is released under the GPL-2.0 license and remains actively maintained.

# SEE ALSO

[slapt-get](/man/slapt-get)(8), [sbopkg](/man/sbopkg)(8), [slackpkg](/man/slackpkg)(8)
