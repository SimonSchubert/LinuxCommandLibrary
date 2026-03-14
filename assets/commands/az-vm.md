# TAGLINE

Manage Azure virtual machines

# TLDR

**Create** virtual machine

```az vm create --resource-group [MyRG] --name [MyVM] --image [Ubuntu2204]```

**List** VMs

```az vm list```

**Start** VM

```az vm start --resource-group [MyRG] --name [MyVM]```

**Stop** VM

```az vm stop --resource-group [MyRG] --name [MyVM]```

**Delete** VM

```az vm delete --resource-group [MyRG] --name [MyVM]```

**Get** VM details

```az vm show --resource-group [MyRG] --name [MyVM]```

# SYNOPSIS

**az vm** _command_ [_options_]

# DESCRIPTION

**az vm** manages Azure virtual machines. It provides commands for creating, starting, stopping, configuring, and deleting VMs, as well as managing disks, network interfaces, and extensions.

The command group enables full lifecycle management of Azure compute resources.

# PARAMETERS

**create**
> Create new virtual machine

**list**
> List virtual machines

**start**
> Start VM

**stop**
> Stop VM (still incurs compute charges)

**deallocate**
> Deallocate VM (stops billing for compute)

**restart**
> Restart VM

**delete**
> Delete VM

**show**
> Get VM details

**--resource-group**, **-g** _name_
> Resource group name

**--name**, **-n** _name_
> VM name

**--image**
> OS image (Ubuntu2204, Win2022Datacenter, etc.)

**--size**
> VM size (Standard_B2s, Standard_D2s_v3, etc.)

**--admin-username**
> Admin username

**--admin-password**
> Admin password

**--ssh-key-values**
> SSH public key(s)

# COMMON OPERATIONS

```bash
# Create Ubuntu VM with SSH key
az vm create -g MyRG -n MyVM --image Ubuntu2204 --ssh-key-values ~/.ssh/id_rsa.pub

# Get VM IP address
az vm show -g MyRG -n MyVM -d --query publicIps -o tsv

# Resize VM
az vm resize -g MyRG -n MyVM --size Standard_D4s_v3

# Run command on VM
az vm run-command invoke -g MyRG -n MyVM --command-id RunShellScript --scripts "apt-get update"
```

# CAVEATS

Creating VMs incurs costs. **az vm stop** does not deallocate -- use **az vm deallocate** to stop billing for compute. Some VM sizes are not available in all regions. Deleting a VM does not delete associated resources (disks, NICs) by default. The **UbuntuLTS** image alias was deprecated in 2023; use **Ubuntu2204** or similar instead.

# HISTORY

**az vm** has been part of Azure CLI since version 2.0 in **2017**, providing comprehensive VM management capabilities.

# SEE ALSO

[az](/man/az)(1), [az-group](/man/az-group)(1), [az-network](/man/az-network)(1)
