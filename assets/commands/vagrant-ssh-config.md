# TAGLINE

Output SSH configuration for Vagrant VMs

# TLDR

**Show SSH config**

```vagrant ssh-config```

**Show SSH config for a specific VM**

```vagrant ssh-config [name|id]```

**Use a custom Host name in the output**

```vagrant ssh-config --host [name]```

**Append to SSH config**

```vagrant ssh-config >> ~/.ssh/config```

# SYNOPSIS

**vagrant** **ssh-config** [_options_] [_name_|_id_]

# PARAMETERS

**--host** _name_
> Name of the Host entry in the generated config.

# DESCRIPTION

**vagrant ssh-config** outputs valid SSH configuration for connecting to a running Vagrant machine with **ssh** directly instead of **vagrant ssh**. Displays host, user, port, and identity file settings. Can be appended to ~/.ssh/config for direct ssh access.

# INSTALL

```apt: sudo apt install vagrant```

```dnf: sudo dnf install vagrant```

```nix: nix profile install nixpkgs#vagrant```

<!-- packages: 2026-11-09 -->

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-ssh](/man/vagrant-ssh)(1), [ssh](/man/ssh)(1)

# RESOURCES

```[Source code](https://github.com/hashicorp/vagrant)```

```[Documentation](https://developer.hashicorp.com/vagrant/docs/cli/ssh_config)```

<!-- verified: 2026-11-09 -->
