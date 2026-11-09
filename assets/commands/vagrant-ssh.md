# TAGLINE

SSH into Vagrant virtual machines

# TLDR

**SSH into VM**

```vagrant ssh```

**SSH into specific VM**

```vagrant ssh [name|id]```

**Run command via SSH**

```vagrant ssh -c "[command]"```

**Run command without allocating a TTY**

```vagrant ssh -c "[command]" --no-tty```

**SSH without TTY**

```vagrant ssh -- -T```

**Forward a local port via extra ssh arguments**

```vagrant ssh -- -L [8080]:localhost:[80]```

# SYNOPSIS

**vagrant** **ssh** [_options_] [_name_|_id_] [-- _extra_ssh_args_]

# PARAMETERS

**-c**, **--command** _command_
> Execute a single command over SSH, print its output, and exit.

**-p**, **--plain**
> SSH without authentication, leaving authentication up to the user.

**-t**, **--[no-]tty**
> Enable or disable a TTY when executing a command (enabled by default).

**--**
> Pass all following arguments directly to the ssh executable.

# DESCRIPTION

**vagrant ssh** opens an SSH session to a running Vagrant machine. Automatically handles authentication using generated keys. The primary way to access Vagrant VMs interactively.

Vagrant uses the SSH client installed on the host. On POSIX systems one must be available in the PATH.

# CAVEATS

A command started in the background (for example with a trailing **&**) is terminated almost immediately, because child processes exit with the shell. Detach it, for example with **nohup**.

# INSTALL

```apt: sudo apt install vagrant```

```dnf: sudo dnf install vagrant```

```nix: nix profile install nixpkgs#vagrant```

<!-- packages: 2026-11-09 -->

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-ssh-config](/man/vagrant-ssh-config)(1), [ssh](/man/ssh)(1)

# RESOURCES

```[Source code](https://github.com/hashicorp/vagrant)```

```[Documentation](https://developer.hashicorp.com/vagrant/docs/cli/ssh)```

<!-- verified: 2026-11-09 -->
