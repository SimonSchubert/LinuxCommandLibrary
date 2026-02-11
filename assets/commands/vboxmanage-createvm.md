# TAGLINE

Create new VirtualBox virtual machines

# TLDR

**Create VM**

```vboxmanage createvm --name [vmname] --register```

**Create with OS type**

```vboxmanage createvm --name [vmname] --ostype [Ubuntu_64] --register```

**Create in folder**

```vboxmanage createvm --name [vmname] --basefolder [path] --register```

# SYNOPSIS

**vboxmanage** **createvm** [_options_]

# PARAMETERS

**--name** _name_
> VM name.

**--ostype** _type_
> Guest OS type.

**--register**
> Register with VirtualBox.

**--basefolder** _path_
> VM files location.

**--uuid** _uuid_
> Specify UUID.

**--groups** _groups_
> VM groups.

# DESCRIPTION

**vboxmanage createvm** creates a new virtual machine definition. Creates VM configuration without hardware. Use modifyvm to configure CPU, memory, and storage.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-modifyvm](/man/vboxmanage-modifyvm)(1)

