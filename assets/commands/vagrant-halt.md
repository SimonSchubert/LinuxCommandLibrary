# TAGLINE

Shut down a running Vagrant machine

# TLDR

**Stop VM**

```vagrant halt```

**Force stop**

```vagrant halt -f```

**Stop specific VM**

```vagrant halt [name|id]```

# SYNOPSIS

**vagrant** **halt** [_options_] [_name_|_id_]

# PARAMETERS

**-f**, **--force**
> Do not attempt a graceful shutdown; effectively pulls the power on the guest.

# DESCRIPTION

**vagrant halt** shuts down a running Vagrant machine. It first attempts a graceful shutdown through the guest OS (on Linux guests, **systemctl poweroff** where systemd is detected, otherwise **shutdown**). If that fails, or **--force** is given, Vagrant simply powers the machine off.

# CAVEATS

The guest is responsible for having the shutdown executables in its $PATH.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-suspend](/man/vagrant-suspend)(1), [vagrant-destroy](/man/vagrant-destroy)(1)

# RESOURCES

```[Source code](https://github.com/hashicorp/vagrant)```

```[Documentation](https://developer.hashicorp.com/vagrant/docs/cli/halt)```

<!-- verified: 2026-11-09 -->
