# TAGLINE

character-based email and news client

# TLDR

**Start Pine mail client**

```pine```

**Compose a message to a specific address**

```pine [user@example.com]```

**Open a specific folder instead of INBOX**

```pine -f [folder]```

**Open the first folder read-only**

```pine -o```

**Start in the folder index instead of the main menu**

```pine -i```

**Send mail with a file attached**

```pine -attach [path/to/file] [user@example.com]```

**Print a sample system-wide configuration**

```pine -conf > [pine.conf]```

# SYNOPSIS

**pine** [_options_] [_address ..._]

# PARAMETERS

**-f** _folder_
> Open folder instead of INBOX.

**-F** _file_
> View a text file in Pine's browser.

**-i**
> Start in the folder index screen instead of the main menu.

**-I** _keystrokes_
> Execute comma-separated initial keystrokes on startup (e.g., CR, SPACE, ^C).

**-n** _number_
> Set the starting message number.

**-o**
> Open the first folder read-only.

**-r**
> Run in restricted (demo) mode.

**-sort** _order_
> Set the sort order of the folder index, optionally reversed.

**-conf**
> Print a sample system-wide pine.conf to stdout.

**-pinerc** _file_
> Write a fresh pinerc to file, keeping existing user settings.

**-p** _file_
> Use file as the personal configuration file instead of ~/.pinerc.

**-P** _file_
> Use file as the system-wide configuration file.

**-attach** _file_
> Send mail with file as an attachment.

**-attachlist** _files_
> Send mail with a list of files as attachments.

**-url** _url_
> Open the given URL.

**-k**
> Use function keys for commands.

**-z**
> Allow suspending Pine with Ctrl-Z.

**-_option_=_value_**
> Set any configuration option from the command line.

**-d** _level_
> Set debug level for diagnostic output.

**-h**
> Display help listing valid command-line options.

**-v**
> Print version information.

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

Configuration stored in ~/.pinerc. Use S (Setup) from main menu for interactive configuration. The system-wide file is pine.conf, in /etc on most Linux builds or /usr/local/lib on others, and pine.conf.fixed holds settings users cannot override. The address book is kept in ~/.addressbook.

# CAVEATS

Pine is obsolete and no longer developed; use **Alpine** instead. It lacks Unicode support, and not all features work with modern mail servers. Its license restricts distribution of modified versions, so few distributions still package it.

# HISTORY

Pine was written at the **University of Washington** in **1989**, with Laurence Lundblade among its original authors, and announced publicly in March 1992. The project later credited Mike Seibel as lead, while Mark Crispin wrote the c-client library and IMAP server it relied on. The final release was **4.64** in September 2005. The university replaced it with **Alpine**, a rewrite under the Apache License 2.0 first released in full in December 2007.

# SEE ALSO

[alpine](/man/alpine)(1), [pico](/man/pico)(1), [mutt](/man/mutt)(1), [neomutt](/man/neomutt)(1), [mail](/man/mail)(1)
