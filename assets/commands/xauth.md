# TAGLINE

X11 authorization credential management

# TLDR

Use specific **authority** file

```xauth -f [path/to/file]```

Display **info**

```xauth info```

**List** all entries

```xauth list```

**Add** authorization

```xauth add [display_name] [protocol_name] [key]```

**Remove** authorization

```xauth remove [display_name]```

**Extract** current display

```xauth extract - $DISPLAY```

**Merge** from file

```cat [path/to/file] | xauth merge -```

# SYNOPSIS

**xauth** [_OPTIONS_] [_COMMAND_]

# COMMANDS

**info**
> Display authority file information

**list**
> List authorization entries

**add** _DISPLAY_ _PROTOCOL_ _KEY_
> Add authorization entry

**remove** _DISPLAY_
> Remove authorization entry

**extract** _FILE_ _DISPLAY_
> Extract entry to file

**merge** _FILE_
> Merge entries from file

# PARAMETERS

**-f** _FILE_
> Use specified authority file

# DESCRIPTION

**xauth** edits and displays the authorization information used for connecting to X servers. It manages the ~/.Xauthority file which contains credentials for X11 authentication.

The tool is used for X11 forwarding, remote display access, and managing X security.

# CAVEATS

Authority files contain sensitive credentials. X11 forwarding requires proper xauth setup. File permissions should be restrictive.

# SEE ALSO

[xhost](/man/xhost)(1), [ssh](/man/ssh)(1)
