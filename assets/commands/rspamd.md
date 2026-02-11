# TAGLINE

Advanced spam filtering daemon

# TLDR

**Start Rspamd**

```rspamd```

**Start with config file**

```rspamd -c [/etc/rspamd/rspamd.conf]```

**Test mode**

```rspamd -t```

**Foreground mode**

```rspamd -f```

**Start via systemd**

```sudo systemctl start rspamd```

# SYNOPSIS

**rspamd** [_options_]

# PARAMETERS

**-c**, **--config** _file_
> Configuration file.

**-f**, **--no-fork**
> Run in foreground.

**-t**, **--test-config**
> Test configuration.

**-u**, **--user** _user_
> Run as user.

**-g**, **--group** _group_
> Run as group.

# DESCRIPTION

**Rspamd** is a fast, free spam filtering system written in C. It uses machine learning, neural networks, and various rules to identify spam with high accuracy and low resource usage.

# EXAMPLES

```bash
# Start daemon
rspamd

# Test configuration
rspamd -t

# Via systemctl
sudo systemctl start rspamd
sudo systemctl enable rspamd

# Check message
rspamc < message.eml

# Check message with details
rspamc -v < message.eml

# Web interface (default)
# http://localhost:11334/
```

# CONFIGURATION

**/etc/rspamd/rspamd.conf**
> Main configuration file defining workers, modules, and global settings.

**/etc/rspamd/local.d/**
> Directory for local configuration overrides that merge with default settings. Preferred location for custom rules.

**/etc/rspamd/override.d/**
> Directory for full configuration overrides that completely replace default settings for specified modules.

# PORTS

```
11333 - Worker (milter)
11334 - Web interface
11335 - Controller
```

# CAVEATS

Configure milter integration with MTA. Train Bayes for best results. Web UI password in worker-controller.inc.

# HISTORY

Rspamd was created by **Vsevolod Stakhov** starting in 2008 as a fast, extensible spam filtering system.

# SEE ALSO

[rspamadm](/man/rspamadm)(1), [rspamc](/man/rspamc)(1), [spamassassin](/man/spamassassin)(1)
