# TLDR

**SSH with password**

```sshpass -p '[password]' ssh [user@host]```

**SSH with password from file**

```sshpass -f [password_file] ssh [user@host]```

**SSH with password from env var**

```SSHPASS='[password]' sshpass -e ssh [user@host]```

**SCP with password**

```sshpass -p '[password]' scp [file] [user@host:/path/]```

**Rsync with password**

```sshpass -p '[password]' rsync -avz [files] [user@host:/path/]```

# SYNOPSIS

**sshpass** [_-p password_] [_-f file_] [_-e_] [_options_] _command_ [_args_]

# PARAMETERS

**-p** _PASSWORD_
> Password on command line.

**-f** _FILE_
> Read password from file.

**-e**
> Read from SSHPASS env variable.

**-d** _FD_
> Read from file descriptor.

**-P** _PROMPT_
> Set password prompt pattern.

**-v**
> Verbose mode.

**-h**
> Show help.

**-V**
> Show version.

# DESCRIPTION

**sshpass** provides password authentication for SSH without interactive input. It enables automation where key-based auth isn't available.

Password sources include command line, files, and environment variables. File-based passwords are safer than command-line exposure.

The tool works with any program expecting SSH-style password prompts: ssh, scp, rsync, and others.

First-time connections need host key handling. Use -o StrictHostKeyChecking=no for automation, though this has security implications.

For most uses, SSH keys are preferred. sshpass fills gaps where key auth isn't possible or practical.

# CAVEATS

Command-line passwords visible in process list. Less secure than SSH keys. Not recommended for interactive use. May expose passwords in logs.

# HISTORY

**sshpass** was written by **Shachar Shemesh** to address the need for non-interactive SSH password entry in scripts and automation where key-based authentication wasn't feasible.

# SEE ALSO

[ssh](/man/ssh)(1), [ssh-keygen](/man/ssh-keygen)(1), [expect](/man/expect)(1), [ssh-agent](/man/ssh-agent)(1)
