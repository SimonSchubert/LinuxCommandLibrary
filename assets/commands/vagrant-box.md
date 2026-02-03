# TLDR

**List boxes**

```vagrant box list```

**Add box**

```vagrant box add [name]```

**Remove box**

```vagrant box remove [name]```

**Update boxes**

```vagrant box update```

**Prune old versions**

```vagrant box prune```

# SYNOPSIS

**vagrant** **box** _command_ [_options_]

# PARAMETERS

**list**
> List installed boxes.

**add** _name_
> Download and add box.

**remove** _name_
> Remove box.

**update**
> Update boxes.

**prune**
> Remove old box versions.

**outdated**
> Check for updates.

**--provider** _name_
> Specify provider.

**--box-version** _version_
> Specify version.

# DESCRIPTION

**vagrant box** manages Vagrant boxes. Boxes are base images used to create virtual machines. Download from Vagrant Cloud or import from local files.

# SEE ALSO

[vagrant](/man/vagrant)(1), [vagrant-init](/man/vagrant-init)(1)

