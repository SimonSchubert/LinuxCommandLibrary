# TAGLINE

LibreOffice extension package manager

# TLDR

**Add** extension

```unopkg add [path/to/extension]```

**Remove** extension

```unopkg remove [extension_id]```

**List** extensions

```unopkg list```

Open **GUI** dialog

```unopkg gui```

**Reinstall** all extensions

```unopkg reinstall```

# SYNOPSIS

**unopkg** _COMMAND_ [_OPTIONS_] [_EXTENSION_]

# COMMANDS

**add**
> Add and deploy an extension

**remove**
> Remove an extension

**list**
> List deployed extensions

**gui**
> Open extensions dialog

**reinstall**
> Reinstall all deployed extensions

# PARAMETERS

**-h, --help**
> Display help information

# DESCRIPTION

**unopkg** is the LibreOffice extensions manager. It allows installing, removing, and managing extensions from the command line. Extensions add functionality to LibreOffice applications.

Extensions can be downloaded from the official LibreOffice Extensions website and installed using this tool.

# CAVEATS

Some extensions require LibreOffice restart. Extension IDs are needed for removal. GUI mode requires display server.

# SEE ALSO

[libreoffice](/man/libreoffice)(1)
