# TAGLINE

be obnoxious about how much mail you have

# TLDR

**Announce** how many messages are in your mailbox

```countmail```

# SYNOPSIS

**countmail**

# DESCRIPTION

**countmail** is a small shell script from the BSD games collection that counts your mail and tells you about it rather obnoxiously. It spells out the message count in capital letters, followed by a mocking **HAHAHAHAHA!**.

The count comes from the number of lines printed by **from**(1) for the current user. The command takes no options or arguments.

# CAVEATS

This is a joke program, not a mail utility: it cannot select a mailbox, read Maildir folders, or separate read from unread messages. Use **from**, **mail**, or a mail client for real work. On Linux it is usually packaged in **bsdgames** or **bsd-games**.

# HISTORY

**countmail** was first written by **Noah Friedman** in 1993. The BSD version was written by **Charles M. Hannum** and first appeared in **NetBSD 1.3**.

# SEE ALSO

[from](/man/from)(1), [wc](/man/wc)(1), [mail](/man/mail)(1), [mutt](/man/mutt)(1)

# RESOURCES

```[Source code](https://github.com/NetBSD/src/tree/trunk/games/countmail)```

```[Documentation](https://man.netbsd.org/countmail.6)```

<!-- verified: 2026-11-09 -->
