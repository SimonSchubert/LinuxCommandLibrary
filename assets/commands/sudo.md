# TLDR

**Run a command as root**

```sudo [command]```

**Run a command as another user**

```sudo -u [username] [command]```

**Start a root shell**

```sudo -i```

**Start a shell as another user**

```sudo -u [username] -s```

**Run command with preserved environment**

```sudo -E [command]```

**Edit a file as root** (using sudoedit)

```sudo -e [/etc/hosts]```

**List allowed commands** for current user

```sudo -l```

**Invalidate cached credentials**

```sudo -k```

**Run command in background**

```sudo -b [command]```

# SYNOPSIS

**sudo** [_options_] [_command_]

**sudo** -u _user_ [_command_]

**sudo** -i | -s

# PARAMETERS

**-u** _USER_, **--user** _USER_
> Run command as specified user (default: root)

**-g** _GROUP_, **--group** _GROUP_
> Run command with specified primary group

**-i**, **--login**
> Run login shell as target user

**-s**, **--shell**
> Run shell (from $SHELL or user's default)

**-e**, **--edit**
> Edit files (sudoedit mode)

**-E**, **--preserve-env**
> Preserve user's environment variables

**-H**, **--set-home**
> Set HOME to target user's home directory

**-b**, **--background**
> Run command in background

**-l**, **--list**
> List allowed commands for user

**-v**, **--validate**
> Refresh credential cache without running command

**-k**, **--reset-timestamp**
> Invalidate cached credentials

**-K**, **--remove-timestamp**
> Remove cached credentials entirely

**-n**, **--non-interactive**
> Non-interactive mode; fail if password required

**-A**, **--askpass**
> Use askpass helper for password

**-S**, **--stdin**
> Read password from stdin

**-p** _PROMPT_, **--prompt** _PROMPT_
> Custom password prompt

**-T** _TIMEOUT_
> Command timeout in seconds

**-V**, **--version**
> Display version information

# DESCRIPTION

**sudo** (superuser do) executes commands with elevated privileges, typically as root. It provides controlled access to privileged operations based on rules defined in **/etc/sudoers**, allowing fine-grained permission management.

After successful authentication, sudo caches credentials for a grace period (typically 5 minutes), allowing subsequent commands without re-entering the password. Use **-k** to invalidate this cache.

The **sudoers** file controls who can run what commands on which hosts. Users can be granted full root access or restricted to specific commands. The **visudo** command should be used to edit sudoers safely.

# CAVEATS

Running commands as root is dangerous—mistakes can damage the system. The **-E** flag can expose sensitive environment variables. Some environment variables are filtered by default for security. Incorrect sudoers syntax can lock out administrative access; always use **visudo** to edit. Avoid using sudo in scripts that might be run by untrusted users.

# HISTORY

sudo was originally written by **Bob Coggeshall** and **Cliff Spencer** at SUNY Buffalo around **1980**. **Todd Miller** took over maintenance in **1994** and continues to lead development. The name is commonly understood as "superuser do" though it originally stood for "substitute user do" since it can run commands as any user. sudo has become the standard method for privilege escalation on Unix-like systems, replacing direct root login in most distributions.

# SEE ALSO

[su](/man/su)(1), [visudo](/man/visudo)(8), [sudoers](/man/sudoers)(5), [doas](/man/doas)(1)
