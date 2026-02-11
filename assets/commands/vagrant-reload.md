# TAGLINE

Restart Vagrant machine with updated config

# TLDR

**Reload VM**

```vagrant reload```

**Reload with provisioning**

```vagrant reload --provision```

**Reload specific VM**

```vagrant reload [name]```

# SYNOPSIS

**vagrant** **reload** [_options_] [_name_]

# PARAMETERS

**--provision**
> Run provisioners.

**--no-provision**
> Skip provisioners.

**-f**, **--force**
> Force reload.

# DESCRIPTION

**vagrant reload** halts and restarts a Vagrant machine. Applies Vagrantfile changes that require a restart. Equivalent to vagrant halt followed by vagrant up.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-halt](/man/vagrant-halt)(1), [vagrant-up](/man/vagrant-up)(1)

