# TAGLINE

Real-time terminal text communication

# TLDR

**Talk** to local user

```talk [username]```

Talk to user on specific **TTY**

```talk [username] [tty3]```

Talk to **remote** user

```talk [username]@[hostname]```

**Clear** both screens

```Ctrl+d```

**Exit** session

```Ctrl+c```

# SYNOPSIS

**talk** _user_ [_ttyname_]

**talk** _user@host_ [_ttyname_]

# DESCRIPTION

**talk** is a visual communication program that copies text between terminals of two users in real-time. The screen is split into two halves: the top shows what you type, the bottom shows the other user's text.

The target user receives a message inviting them to talk, which they must accept by running `talk` back to you.

# CAVEATS

Both users must be logged in. Requires the talk daemon (talkd) to be running. The mesg command controls whether users can receive talk requests. Largely obsolete, replaced by instant messaging.

# HISTORY

**talk** originated in BSD Unix in the **1980s** as an early form of instant messaging. It was part of the standard Unix networking tools and is now included in GNU inetutils.

# SEE ALSO

[write](/man/write)(1), [wall](/man/wall)(1), [mesg](/man/mesg)(1)
