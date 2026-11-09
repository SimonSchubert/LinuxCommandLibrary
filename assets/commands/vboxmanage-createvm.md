# TAGLINE

Create new VirtualBox virtual machines

# TLDR

**Create VM**

```vboxmanage createvm --name=[vmname] --register```

**Create with OS type**

```vboxmanage createvm --name=[vmname] --ostype=[Ubuntu_64] --register```

**Create with default hardware for the guest OS**

```vboxmanage createvm --name=[vmname] --ostype=[Ubuntu_64] --default --register```

**Create in folder**

```vboxmanage createvm --name=[vmname] --basefolder=[path] --register```

**Create an Arm VM**

```vboxmanage createvm --name=[vmname] --platform-architecture=arm --register```

# SYNOPSIS

**vboxmanage** **createvm** **--name**=_name_ [_options_]

# PARAMETERS

**--name**=_name_
> VM name, also used for the settings file and machine folder.

**--platform-architecture**=**x86**|**arm**
> Target platform. If omitted, it is taken from **--ostype** or else the host.

**--ostype**=_type_
> Guest OS type; see **vboxmanage list ostypes**.

**--register**
> Register with VirtualBox. Without it, only the XML settings file is created.

**--default**
> Apply a default hardware configuration for the guest OS. Otherwise the VM has minimal hardware.

**--basefolder**=_path_
> Folder for the machine configuration file.

**--uuid**=_uuid_
> Specify UUID (default: generated).

**--groups**=_group_,...
> VM groups. Group IDs start with **/**.

**--cipher**=_cipher_
> Encrypt the VM with **AES-128** or **AES-256**.

**--password-id**=_id_
> Password identifier for an encrypted VM.

**--password**=_file_
> Encryption password file, or **-** to prompt.

# DESCRIPTION

**vboxmanage createvm** creates a new virtual machine definition as an XML **.vbox** file, by default in a subfolder of **$HOME/VirtualBox VMs**. Creates VM configuration without hardware unless **--default** is given. Use modifyvm to configure CPU and memory, and **storagectl** and **storageattach** to add disks.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-modifyvm](/man/vboxmanage-modifyvm)(1), [vboxmanage-registervm](/man/vboxmanage-registervm)(1)

# RESOURCES

```[Source code](https://github.com/VirtualBox/virtualbox)```

```[Homepage](https://www.virtualbox.org/)```

```[Documentation](https://www.virtualbox.org/manual/topics/vboxmanage.html#vboxmanage-createvm)```

<!-- verified: 2026-11-09 -->
