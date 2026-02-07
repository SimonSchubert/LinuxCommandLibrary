# TAGLINE

GNOME personal information management application

# TLDR

**Start Evolution**

```evolution```

**Start with specific component**

```evolution --component=[mail|calendar|contacts]```

**Compose new email**

```evolution mailto:[user@example.com]```

**Import file**

```evolution --import [file.ics]```

**Force offline mode**

```evolution --force-offline```

# SYNOPSIS

**evolution** [_options_] [_URI_]

# PARAMETERS

**--component** _name_
> Start with specific component: mail, calendar, contacts, tasks, memos.

**--import** _file_
> Import file (vCard, iCal, etc.).

**--force-online**
> Force online mode.

**--force-offline**
> Force offline mode.

**--quit**
> Request running instance to quit.

**--express**
> Start in express mode.

**--help**
> Display help.

# DESCRIPTION

**Evolution** is the GNOME personal information management application. It integrates email, calendar, contacts, tasks, and memos into a single application, similar to Microsoft Outlook.

Evolution supports multiple email protocols (IMAP, POP, SMTP, Exchange), calendar standards (CalDAV, ICS), and contact formats (CardDAV, LDAP). It includes features like encryption (GPG, S/MIME), spam filtering, and search folders.

# FEATURES

- Multiple email accounts
- CalDAV and Exchange calendars
- CardDAV and LDAP contacts
- Task and memo management
- GPG and S/MIME encryption
- Spam filtering

# CAVEATS

Heavy resource usage compared to simpler clients. Some Exchange features require additional packages. First-time setup wizard is mandatory. Background processes may continue after closing.

# HISTORY

Evolution was originally developed by **Ximian** starting in **1999**, acquired by Novell in 2003, and later became part of the GNOME project. It was one of the first Linux applications to offer comprehensive groupware functionality.

# SEE ALSO

[thunderbird](/man/thunderbird)(1), [gnome-contacts](/man/gnome-contacts)(1), [gnome-calendar](/man/gnome-calendar)(1)
