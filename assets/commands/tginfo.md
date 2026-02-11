# TAGLINE

Display TigerGraph system information

# TLDR

**Show system info**

```tginfo```

**Show version**

```tginfo --version```

**Show graph stats**

```tginfo stats```

**Show license info**

```tginfo license```

# SYNOPSIS

**tginfo** [_command_] [_options_]

# PARAMETERS

**stats**
> Graph statistics.

**license**
> License information.

**--version**
> Version info.

**--help**
> Show help.

# DESCRIPTION

**tginfo** displays diagnostic information about a local TigerGraph graph database installation. It reports system details including version numbers, configuration settings, graph statistics such as vertex and edge counts, and license information including expiration dates and enabled features.

The tool is primarily used for troubleshooting and monitoring TigerGraph deployments, providing a quick overview of the database system's state from the command line.

# CAVEATS

TigerGraph installation needed. Local access. Admin privileges may be needed.

# HISTORY

**tginfo** is a utility for displaying information about TigerGraph graph database installations.

# SEE ALSO

[gsql](/man/gsql)(1), [tgcloud](/man/tgcloud)(1)
