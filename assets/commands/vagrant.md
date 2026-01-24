# TLDR

**Initialize new Vagrantfile**

```vagrant init [ubuntu/jammy64]```

**Start and provision VM**

```vagrant up```

**SSH into VM**

```vagrant ssh```

**Stop VM**

```vagrant halt```

**Destroy VM**

```vagrant destroy```

**Show VM status**

```vagrant status```

**Reload VM** (restart with new config)

```vagrant reload```

**List boxes**

```vagrant box list```

# SYNOPSIS

**vagrant** [_up_] [_ssh_] [_halt_] [_destroy_] [_status_] [_options_]

# PARAMETERS

**init** [_BOX_]
> Initialize Vagrantfile.

**up**
> Start and provision VM.

**ssh** [_NAME_]
> SSH into VM.

**halt**
> Stop VM.

**destroy**
> Remove VM.

**reload**
> Restart VM with config.

**provision**
> Run provisioners.

**status**
> Show VM status.

**global-status**
> All Vagrant VMs.

**box add** _BOX_
> Add box.

**box list**
> List boxes.

**box remove** _BOX_
> Remove box.

**--provider** _NAME_
> Provider (virtualbox, vmware, etc.).

**-f**, **--force**
> Force operation.

# DESCRIPTION

**vagrant** manages virtual development environments. It automates VM creation, configuration, and provisioning.

Vagrantfile defines the VM configuration. It specifies the base box, network settings, shared folders, and provisioning scripts.

Boxes are base images. Many are available from Vagrant Cloud. Custom boxes can be created and shared.

Providers handle virtualization. VirtualBox is default, with support for VMware, Hyper-V, Docker, and cloud providers.

Provisioners configure VMs after boot. Shell scripts, Ansible, Puppet, and Chef are supported.

Multi-machine setups define several VMs in one Vagrantfile. They can model complex environments like clusters.

# CAVEATS

Requires virtualization software. Large boxes need download time and disk space. Provider-specific features may vary.

# HISTORY

**Vagrant** was created by **Mitchell Hashimoto** in **2010** and later developed by **HashiCorp**. It revolutionized development environment management, enabling reproducible setups.

# SEE ALSO

[virtualbox](/man/virtualbox)(1), [docker](/man/docker)(1), [ansible](/man/ansible)(1), [packer](/man/packer)(1)
