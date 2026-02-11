# TAGLINE

Shut down a running Vagrant machine

# TLDR

**Stop VM**

```vagrant halt```

**Force stop**

```vagrant halt -f```

**Stop specific VM**

```vagrant halt [name]```

# SYNOPSIS

**vagrant** **halt** [_options_] [_name_]

# PARAMETERS

**-f**, **--force**
> Force shutdown (power off).

# DESCRIPTION

**vagrant halt** shuts down a running Vagrant machine. Sends a shutdown signal to the guest OS. Use --force to power off immediately without graceful shutdown.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-suspend](/man/vagrant-suspend)(1), [vagrant-destroy](/man/vagrant-destroy)(1)

