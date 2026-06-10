# TAGLINE

Terminal-based email and news client.

# TLDR

Open **alpine** email client

```alpine```

Open alpine directly to **compose** an email

```alpine [email@example.net]```

**Quit** alpine

```q y```

# SYNOPSIS

**alpine** [_options_] [_address_]

# DESCRIPTION

**alpine** is an email client and Usenet newsgroup program with a pico/nano-inspired interface. It supports most modern email services through IMAP and is designed for ease of use with a menu-driven interface.

Alpine is the successor to Pine and was developed by the University of Washington.

# PARAMETERS

**address**
> Open directly to message composition screen to send to specified address

**-i**
> Start up in the FOLDER INDEX screen instead of the main menu.

**-f** _folder_
> Open _folder_ instead of INBOX (in the first folder collection).

**-c** _number_
> Folder collection number for the **-f** argument.

**-d** _debug-level_
> Output diagnostic information at debug level 0 to 9.

**-p** _config-file_
> Use _config-file_ as the personal configuration file instead of ~/.pinerc.

**-n** _number_
> Start with the message numbered _number_ as the current message.

**-z**
> Enable use of suspend (Ctrl-Z) to put Alpine in the background.

# CONFIGURATION

Configuration is normally edited interactively with the **Setup** command (S) from the main menu, which writes changes back to the personal configuration file.

**~/.pinerc**
> Personal configuration file for Alpine. Stores mail server settings, folder collections, display preferences, and feature flags.

**~/.addressbook**
> Personal address book.

**/etc/pine.conf**
> System-wide default configuration.

**/etc/pine.conf.fixed**
> System-wide non-overridable configuration set by the administrator.

# CAVEATS

Configuration is stored in ~/.pinerc by default. Alpine may require additional setup for OAuth2 authentication with modern email providers like Gmail.

# HISTORY

Alpine was developed by the **University of Washington** as a successor to **Pine** (Program for Internet News & Email). First released in **2007**, it was designed to address licensing concerns with Pine.

# SEE ALSO

[mutt](/man/mutt)(1), [mail](/man/mail)(1), [pico](/man/pico)(1), [nano](/man/nano)(1), [pine](/man/pine)(1)

# RESOURCES

```[Source code](https://repo.or.cz/alpine.git)```

```[Homepage](https://alpineapp.email/)```

<!-- verified: 2026-06-11 -->
