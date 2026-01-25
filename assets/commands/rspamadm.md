# TLDR

**Check configuration**

```rspamadm configtest```

**Dump configuration**

```rspamadm configdump```

**Train spam filter**

```rspamadm learn_spam [spam_folder/]```

**Train ham filter**

```rspamadm learn_ham [ham_folder/]```

**Control daemon**

```rspamadm control stat```

# SYNOPSIS

**rspamadm** _command_ [_options_]

# COMMANDS

**configtest**
> Test configuration.

**configdump**
> Dump configuration.

**control** _action_
> Control daemon.

**learn_spam** _path_
> Learn spam messages.

**learn_ham** _path_
> Learn ham messages.

**statconvert**
> Convert statistics.

**pw**
> Password hash.

# DESCRIPTION

**rspamadm** is the administration utility for Rspamd, a fast spam filtering system. It manages configuration, training, and daemon control.

# EXAMPLES

```bash
# Test configuration
rspamadm configtest

# Dump current config
rspamadm configdump

# Learn spam directory
rspamadm learn_spam /var/mail/spam/

# Learn ham
rspamadm learn_ham /var/mail/ham/

# Check daemon status
rspamadm control stat

# Reload daemon
rspamadm control reload

# Generate password hash
rspamadm pw --encrypt
```

# CAVEATS

Requires Rspamd installation. Some commands need root. Training improves accuracy.

# HISTORY

rspamadm is part of **Rspamd** by **Vsevolod Stakhov**, an advanced spam filtering system.

# SEE ALSO

[rspamd](/man/rspamd)(8), [rspamc](/man/rspamc)(1), [spamassassin](/man/spamassassin)(1)
