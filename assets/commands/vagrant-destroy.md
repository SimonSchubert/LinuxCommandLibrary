# TAGLINE

Delete Vagrant virtual machines

# TLDR

**Destroy VM**

```vagrant destroy```

**Force destroy without confirmation**

```vagrant destroy -f```

**Destroy specific VM**

```vagrant destroy [name]```

**Gracefully shut down** before destroying

```vagrant destroy --graceful```

# SYNOPSIS

**vagrant** **destroy** [_options_] [_name_]

# PARAMETERS

**-f**, **--force**
> Destroy without confirmation prompt.

**-g**, **--graceful**
> Gracefully shut down the machine before destroying it.

**--[no-]parallel**
> Enable or disable parallel destruction of multiple machines. Enabled by default if the provider supports it.

# DESCRIPTION

**vagrant destroy** stops and deletes all resources for a Vagrant machine. Removes the virtual machine and associated storage. The Vagrantfile and provisioning remain intact.

# CAVEATS

This permanently destroys VM data. Shared folders and host files are not affected. The destroy command does not remove the box that was downloaded during `vagrant up`. Use `vagrant box remove` to reclaim that disk space.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-halt](/man/vagrant-halt)(1), [vagrant-box](/man/vagrant-box)(1), [vagrant-status](/man/vagrant-status)(1)

