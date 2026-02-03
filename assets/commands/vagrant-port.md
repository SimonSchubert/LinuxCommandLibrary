# TLDR

**Show port mappings**

```vagrant port```

**Show for specific VM**

```vagrant port [name]```

# SYNOPSIS

**vagrant** **port** [_options_] [_name_]

# PARAMETERS

**--guest** _port_
> Show mapping for specific guest port.

**--machine-readable**
> Machine-readable output.

# DESCRIPTION

**vagrant port** displays guest to host port mappings. Shows forwarded ports configured for the VM. Useful for finding the host port to access services in the guest.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-status](/man/vagrant-status)(1)

