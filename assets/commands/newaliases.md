# TLDR

**Rebuild aliases database**

```sudo newaliases```

**Specify aliases file**

```sudo newaliases -oA[/etc/mail/aliases]```

# SYNOPSIS

**newaliases** [_options_]

# PARAMETERS

**-oA** _file_
> Specify aliases file.

**-v**
> Verbose output.

# DESCRIPTION

**newaliases** rebuilds the aliases database from /etc/aliases (or equivalent). The database is used by the mail transfer agent (MTA) to expand email aliases.

This command must be run after editing the aliases file for changes to take effect.

# ALIASES FILE FORMAT

```
# /etc/aliases
postmaster: root
webmaster: admin@example.com
support: user1, user2, user3
noreply: /dev/null
archive: |/usr/bin/archive-mail
```

# WORKFLOW

```bash
# Edit aliases
sudo nano /etc/aliases

# Rebuild database
sudo newaliases

# Verify
sendmail -bv aliasname
```

# CAVEATS

MTA-dependent (sendmail, postfix, etc.). File location varies by system. Root privileges required.

# HISTORY

newaliases has been part of Unix mail systems since the early days of sendmail, developed at UC Berkeley in the **1980s**.

# SEE ALSO

[aliases](/man/aliases)(5), [sendmail](/man/sendmail)(8), [postfix](/man/postfix)(1), [postalias](/man/postalias)(1)
