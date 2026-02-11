# TAGLINE

Resume a suspended Vagrant machine

# TLDR

**Resume suspended VM**

```vagrant resume```

**Resume specific VM**

```vagrant resume [name]```

**Resume with provisioning**

```vagrant resume --provision```

# SYNOPSIS

**vagrant** **resume** [_options_] [_name_]

# PARAMETERS

**--provision**
> Run provisioners.

**--no-provision**
> Skip provisioners.

# DESCRIPTION

**vagrant resume** brings a suspended Vagrant machine back online. Restores VM state from when it was suspended. Faster than full boot from halt.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-suspend](/man/vagrant-suspend)(1)

