# TAGLINE

Manage SSH public key resources in Azure

# TLDR

**Create an SSH key resource**

```az sshkey create --name [MySSHKey] --resource-group [MyResourceGroup]```

**Create SSH key from existing public key**

```az sshkey create --name [MySSHKey] --resource-group [MyResourceGroup] --public-key @[~/.ssh/id_rsa.pub]```

**List all SSH key resources**

```az sshkey list --resource-group [MyResourceGroup]```

**Show SSH key details**

```az sshkey show --name [MySSHKey] --resource-group [MyResourceGroup]```

**Delete an SSH key resource**

```az sshkey delete --name [MySSHKey] --resource-group [MyResourceGroup]```

# SYNOPSIS

**az** **sshkey** _subcommand_ [_options_]

# SUBCOMMANDS

**create**
> Create a new SSH public key resource.

**delete**
> Delete an SSH public key resource.

**list**
> List SSH public key resources.

**show**
> Get information about an SSH public key resource.

**update**
> Update an SSH public key resource.

# PARAMETERS

**--name** **-n**
> Name of the SSH key resource.

**--resource-group** **-g**
> Name of resource group.

**--public-key**
> SSH public key content or path to a file containing the key.

# DESCRIPTION

**az sshkey** manages Azure SSH public key resources, which allow storing SSH public keys in Azure for use when creating VMs. This simplifies VM deployment by referencing stored keys rather than providing them each time.

When creating without --public-key, a new key pair is generated and the private key is saved locally.

# CAVEATS

Requires Azure CLI to be installed and authenticated. SSH keys are stored as public keys only; private keys remain local. Keys can only be used by VMs in the same region.

# SEE ALSO

[az](/man/az)(1), [az-vm](/man/az-vm)(1), [ssh-keygen](/man/ssh-keygen)(1)
