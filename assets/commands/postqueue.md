# TLDR

**List mail queue**

```postqueue -p```

**Flush mail queue**

```postqueue -f```

**Flush specific site**

```postqueue -s [example.com]```

**List in JSON format**

```postqueue -j```

# SYNOPSIS

**postqueue** [_options_]

# PARAMETERS

**-p**
> Print queue contents.

**-f**
> Flush queue (retry delivery).

**-s** _site_
> Flush specific site.

**-j**
> JSON output format.

**-c** _dir_
> Configuration directory.

# DESCRIPTION

**postqueue** manages the Postfix mail queue. It displays queue contents and triggers delivery attempts. Unlike postsuper, it can be run by regular users.

# EXAMPLES

```bash
# View queue
postqueue -p

# Flush all queued mail
postqueue -f

# Retry specific domain
postqueue -s gmail.com

# JSON output for scripting
postqueue -j

# Count queued messages
postqueue -p | tail -1
```

# QUEUE OUTPUT

```
-Queue ID-  --Size-- ----Arrival Time---- -Sender/Recipient-------
ABC123DEF     1234 Mon Jan 01 12:00:00  sender@example.com
                                         recipient@dest.com
```

# QUEUE LOCATIONS

```
/var/spool/postfix/incoming  - New mail
/var/spool/postfix/active    - Being delivered
/var/spool/postfix/deferred  - Temporary failures
/var/spool/postfix/hold      - Manually held
```

# CAVEATS

Flushing may not help permanent failures. Use postsuper for advanced queue management.

# HISTORY

postqueue is part of **Postfix** by **Wietse Venema**, providing safe queue management for unprivileged users.

# SEE ALSO

[postsuper](/man/postsuper)(1), [mailq](/man/mailq)(1), [postfix](/man/postfix)(1), [sendmail](/man/sendmail)(1)
