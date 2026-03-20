# TAGLINE

character-based email and news client

# TLDR

**Start Pine mail client**

```pine```

**Compose a message to a specific address**

```pine [user@example.com]```

**Open a specific folder instead of INBOX**

```pine -f [folder]```

**Start in the folder index instead of the main menu**

```pine -i```

**Output a fresh configuration to a file**

```pine -conf > [pinerc.new]```

# SYNOPSIS

**pine** [_options_] [_address ..._]

# PARAMETERS

**-f** _folder_
> Open folder instead of INBOX.

**-i**
> Start in the folder index screen instead of the main menu.

**-I** _keystrokes_
> Execute comma-separated initial keystrokes on startup (e.g., CR, SPACE, ^C).

**-conf**
> Output a fresh pinerc configuration to stdout.

**-p** _file_
> Use file as the personal configuration file instead of ~/.pinerc.

**-P** _file_
> Use file as the system-wide configuration file instead of /usr/local/lib/pine.conf.

**-r**
> Open first folder in read-only mode.

**-attach** _file_
> Send mail with file as an attachment.

**-d** _level_
> Set debug level (0-9) for diagnostic output.

**-h**
> Display help listing valid command-line options.

# DESCRIPTION

**pine** (Program for Internet News and Email) is a character-based email and news client. Developed at University of Washington, it was widely used for its user-friendly interface.

# MAIN MENU

```
?  HELP
C  COMPOSE MESSAGE
I  MESSAGE INDEX
L  FOLDER LIST
A  ADDRESS BOOK
S  SETUP
Q  QUIT
```

# CONFIGURATION

Configuration stored in ~/.pinerc. Use S (Setup) from main menu for interactive configuration. System-wide configuration in /usr/local/lib/pine.conf.

# CAVEATS

Pine is obsolete; use Alpine instead. Not all features work with modern mail servers. License issues led to Alpine fork.

# HISTORY

Pine was developed at the **University of Washington** starting in 1989 by **Mark Crispin** and later superseded by **Alpine** under Apache license.

# SEE ALSO

[alpine](/man/alpine)(1), [mutt](/man/mutt)(1), [mail](/man/mail)(1)
