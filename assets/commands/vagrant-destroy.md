# TAGLINE

Delete Vagrant virtual machines

# TLDR

**Destroy VM**

```vagrant destroy```

**Force destroy without confirmation**

```vagrant destroy -f```

**Destroy specific VM**

```vagrant destroy [name]```

# SYNOPSIS

**vagrant** **destroy** [_options_] [_name_]

# PARAMETERS

**-f**, **--force**
> Destroy without confirmation.

**--parallel**
> Destroy in parallel.

**--graceful**
> Graceful shutdown before destroy.

# DESCRIPTION

**vagrant destroy** stops and deletes all resources for a Vagrant machine. Removes the virtual machine and associated storage. The Vagrantfile and provisioning remain intact.

# CAVEATS

This permanently destroys VM data. Shared folders and host files are not affected.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-halt](/man/vagrant-halt)(1), [vagrant-up](/man/vagrant-up)(1)

