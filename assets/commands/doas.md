# TAGLINE

minimal privilege escalation tool

# TLDR

**Run a command as root**

```doas [command]```

**Run a command as another user**

```doas -u [username] [command]```

**Start a root shell**

```doas -s```

**Start a shell as another user**

```doas -u [username] -s```

**Run without requiring password** (if configured)

```doas -n [command]```

**Check if doas.conf** allows the command

```doas -C [/etc/doas.conf] [command]```

**Clear cached credentials**

```doas -L```

# SYNOPSIS

**doas** [_-nLs_] [_-a style_] [_-C config_] [_-u user_] _command_ [_args_]

# PARAMETERS

**-n**
> Non-interactive mode; fail if password is required.

**-L**
> Clear any persisted authentication credentials.

**-s**
> Execute the shell from SHELL environment variable or from /etc/passwd.

**-u** _user_
> Run the command as the specified user (default: root).

**-a** _style_
> Use the specified authentication style.

**-C** _config_
> Parse and check the specified config file and exit.

_command_
> The command to execute with elevated privileges.

# DESCRIPTION

**doas** (dedicated openbsd application subexecutor) is a minimal program for running commands as another user, typically root. It originated in OpenBSD as a simpler, more secure alternative to sudo with a significantly smaller codebase and attack surface.

Configuration is done through **/etc/doas.conf** with simple rules specifying who can run what. A basic rule might be: **permit persist :wheel** to allow members of the wheel group to execute commands as root with credential caching.

The configuration syntax is straightforward: each line is a rule with **permit** or **deny**, optional keywords like **nopass** (no password), **persist** (cache credentials), **keepenv** (preserve environment), and specifications for user, group, and allowed commands.

Unlike sudo's extensive feature set, doas focuses on the core use case of privilege escalation with minimal complexity. This makes it easier to audit and reduces potential security vulnerabilities. Many Linux distributions now package doas as a sudo alternative.

# CONFIGURATION

**/etc/doas.conf**
> Main configuration file specifying authorization rules. Each line contains a rule with permit/deny, optional keywords (nopass, persist, keepenv), and user/group/command specifications.

# CAVEATS

Configuration syntax differs from sudo; migration requires rewriting rules. Fewer features than sudo (no fine-grained command logging, no complex per-command options). Some software may expect sudo specifically. Must be configured before use (no default permissive configuration).

# HISTORY

**doas** was created by Ted Unangst and introduced in **OpenBSD 5.8** in **2015** as a replacement for sudo in the base system. The design goal was to provide necessary functionality with minimal code (around 1000 lines versus sudo's 100,000+). It has been ported to Linux and other systems, gaining popularity among security-conscious users.

# SEE ALSO

[doas.conf](/man/doas.conf)(5), [sudo](/man/sudo)(8), [su](/man/su)(1), [sudoers](/man/sudoers)(5)
