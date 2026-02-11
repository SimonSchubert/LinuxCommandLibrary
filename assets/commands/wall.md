# TAGLINE

Broadcast messages to all logged-in users

# TLDR

**Send** a message to all logged-in users

```wall [message]```

**Send** a message to a specific group

```wall -g [group_name] [message]```

**Send** a message from a file

```wall [file]```

**Send** a message with timeout

```wall -t [seconds] [file]```

# SYNOPSIS

**wall** [_options_] [_message_ | _file_]

# PARAMETERS

**-g, --group _group_**
> Send only to members of the specified group

**-n, --nobanner**
> Suppress the banner

**-t, --timeout _seconds_**
> Timeout for writing to terminals (default 300)

# DESCRIPTION

**wall** (write all) displays a message or the contents of a file on the terminals of all currently logged-in users. This is typically used by system administrators for system-wide announcements like pending shutdowns.

Messages are preceded by a banner showing the sender and time.

# CAVEATS

Users can use **mesg n** to prevent receiving wall messages. Only root can override this. Messages may interrupt terminal sessions.

# SEE ALSO

[write](/man/write)(1), [mesg](/man/mesg)(1), [talk](/man/talk)(1)
