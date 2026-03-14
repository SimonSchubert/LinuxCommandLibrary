# TAGLINE

X11 authorization credential management

# TLDR

**List all authorization entries**

```xauth list```

**Display authority file info**

```xauth info```

**Add an authorization entry**

```xauth add [display_name] [protocol_name] [hex_key]```

**Generate a new authorization entry via the server**

```xauth generate [display_name] [protocol_name]```

**Remove an authorization entry**

```xauth remove [display_name]```

**Extract entry for the current display to a file**

```xauth extract [path/to/file] $DISPLAY```

**Merge entries from a file**

```xauth merge [path/to/file]```

**Use a specific authority file**

```xauth -f [path/to/file] list```

# SYNOPSIS

**xauth** [_options_] [_command_ [_args_]]

# COMMANDS

**add** _DISPLAY_ _PROTOCOL_ _HEXKEY_
> Add an authorization entry for the indicated display.

**generate** _DISPLAY_ _PROTOCOL_ [_options_]
> Contact the server to generate and add an authorization entry.

**remove** _DISPLAY_
> Remove matching authorization entries.

**list** [_DISPLAY_]
> List authorization entries (all if no display specified).

**nlist** [_DISPLAY_]
> List entries in numeric format.

**extract** _FILE_ _DISPLAY_
> Write authorization entries to a file.

**nextract** _FILE_ _DISPLAY_
> Extract entries in numeric format for non-binary transmission.

**merge** _FILE_...
> Read and merge authorization entries from files.

**nmerge** _FILE_...
> Merge entries in numeric format.

**source** _FILE_
> Execute xauth commands from a script file.

**info**
> Display information about the authority file.

**exit**
> Save changes and exit.

**quit**
> Exit without saving changes.

**help**
> List available commands.

# PARAMETERS

**-f** _FILE_
> Use the specified authority file instead of ~/.Xauthority.

**-v**
> Verbose mode. Print status messages for operations.

**-q**
> Quiet mode. Suppress unsolicited status messages.

**-i**
> Ignore authority file locks.

**-b**
> Attempt to break stale authority file locks.

**-n**
> Do not resolve hostnames; display stored addresses directly.

**-V**
> Display the xauth version number.

# DESCRIPTION

**xauth** edits and displays the authorization information used for connecting to X servers. It manages the ~/.Xauthority file (or the file specified by the XAUTHORITY environment variable) which contains credentials for X11 authentication.

The tool is commonly used to extract authorization records from one machine and merge them on another for remote display access, X11 forwarding over SSH, and managing X security.

# CAVEATS

Authority files contain sensitive credentials and should have restrictive permissions (readable only by the owner). X11 forwarding with SSH requires proper xauth setup. The program does not contact the X server except when the `generate` command is used.

# SEE ALSO

[xhost](/man/xhost)(1), [ssh](/man/ssh)(1), [xdpyinfo](/man/xdpyinfo)(1)
