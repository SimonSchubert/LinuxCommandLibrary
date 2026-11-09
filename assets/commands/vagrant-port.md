# TAGLINE

Display Vagrant VM port forwarding mappings

# TLDR

**Show port mappings**

```vagrant port```

**Show for specific VM**

```vagrant port [name]```

**Show host port for a specific guest port**

```vagrant port --guest [80]```

**SSH using the forwarded port**

```ssh -p $(vagrant port --guest 22) vagrant@localhost```

# SYNOPSIS

**vagrant** **port** [_options_] [_name_|_id_]

# PARAMETERS

**--guest** _port_
> Show only the host port that maps to the specified guest port. Returns an error if the port is not forwarded. Useful for scripting.

**--machine-readable**
> Machine-readable output format for automation.

# DESCRIPTION

**vagrant port** displays guest to host port mappings. Shows forwarded ports configured for the VM. Useful for finding the host port to access services in the guest.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-status](/man/vagrant-status)(1), [vagrant-ssh](/man/vagrant-ssh)(1), [vagrant-ssh-config](/man/vagrant-ssh-config)(1)

# RESOURCES

```[Source code](https://github.com/hashicorp/vagrant)```

```[Homepage](https://developer.hashicorp.com/vagrant)```

```[Documentation](https://developer.hashicorp.com/vagrant/docs/cli/port)```

<!-- verified: 2026-11-09 -->
