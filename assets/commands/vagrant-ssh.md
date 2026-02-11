# TAGLINE

SSH into Vagrant virtual machines

# TLDR

**SSH into VM**

```vagrant ssh```

**SSH into specific VM**

```vagrant ssh [name]```

**Run command via SSH**

```vagrant ssh -c "[command]"```

**SSH without TTY**

```vagrant ssh -- -T```

# SYNOPSIS

**vagrant** **ssh** [_options_] [_name_] [-- _ssh_args_]

# PARAMETERS

**-c**, **--command** _cmd_
> Execute command.

**-p**, **--plain**
> Plain SSH without extras.

**--**
> Pass args to ssh.

# DESCRIPTION

**vagrant ssh** opens an SSH session to a Vagrant machine. Automatically handles authentication using generated keys. The primary way to access Vagrant VMs interactively.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-ssh-config](/man/vagrant-ssh-config)(1), [ssh](/man/ssh)(1)

