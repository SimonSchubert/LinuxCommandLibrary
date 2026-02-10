# TAGLINE

displays information about previously executed commands from process

# TLDR

**Show recent commands**

```lastcomm```

**Show commands by user**

```lastcomm [username]```

**Show specific command**

```lastcomm --command [vim]```

**Show from specific file**

```lastcomm -f [/var/account/pacct]```

**Show commands by terminal**

```lastcomm --tty [pts/0]```

# SYNOPSIS

**lastcomm** [_options_] [_user_] [_command_] [_terminal_]

# PARAMETERS

**--command** _name_
> Filter by command name.

**--user** _name_
> Filter by user.

**--tty** _name_
> Filter by terminal.

**-f** _file_
> Use specific accounting file.

**--forwards**
> Show oldest first.

**--strict-match**
> Exact match only.

**--debug**
> Debug output.

# DESCRIPTION

**lastcomm** displays information about previously executed commands from process accounting data. It shows command name, flags, user, terminal, and execution time.

Process accounting must be enabled for lastcomm to have data. The accounting file is typically /var/account/pacct.

# OUTPUT FLAGS

```
S - Superuser (root) executed
F - Forked but didn't exec
D - Dumped core
X - Killed by signal
```

# ENABLING ACCOUNTING

```bash
# Enable accounting
sudo accton /var/account/pacct

# Disable accounting
sudo accton off
```

# CAVEATS

Requires process accounting enabled. Accounting adds system overhead. File grows continuously (rotate with sa). Not available on all systems.

# HISTORY

lastcomm is part of the Unix process accounting system, dating back to early Unix. It provides historical tracking of executed commands, useful for auditing and troubleshooting.

# SEE ALSO

[sa](/man/sa)(8), [accton](/man/accton)(8), [last](/man/last)(1), [ac](/man/ac)(1)
