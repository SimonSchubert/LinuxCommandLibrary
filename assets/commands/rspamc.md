# TAGLINE

Rspamd spam filtering client

# TLDR

Train as **spam**

```rspamc learn_spam path/to/email```

Train as **ham** (not spam)

```rspamc learn_ham path/to/email```

Generate **report** on email

```rspamc symbols path/to/email```

Show server **statistics**

```rspamc stat```

**Scan** an email

```rspamc < path/to/email```

Check **fuzzy hash**

```rspamc fuzzy_check path/to/email```

# SYNOPSIS

**rspamc** [_options_] [_command_] [_arguments_]

# DESCRIPTION

**rspamc** is a command-line client for the rspamd spam filtering system. It can train the bayesian filter, scan emails, and query server statistics.

# PARAMETERS

**learn_spam FILE**
> Train the filter to recognize the email as spam

**learn_ham FILE**
> Train the filter to recognize the email as legitimate

**symbols FILE**
> Generate a detailed spam analysis report

**stat**
> Show server statistics

**fuzzy_add FILE**
> Add email to fuzzy hash storage

**fuzzy_check FILE**
> Check if email matches fuzzy hashes

**fuzzy_del FILE**
> Remove email from fuzzy hash storage

**-h, --host HOST**
> Connect to specified rspamd host

**-p, --port PORT**
> Connect on specified port

**-P, --pass PASSWORD**
> Use password for authentication

**-j, --json**
> Output results in JSON format

# CAVEATS

Requires a running rspamd server. Training effectiveness improves with more samples. Fuzzy hashes are used for matching similar spam patterns.

# HISTORY

**rspamc** is part of **rspamd**, a fast, free, and open-source spam filtering system designed for high-volume mail servers.

# SEE ALSO

[rspamd](/man/rspamd)(8), [rspamadm](/man/rspamadm)(1)
