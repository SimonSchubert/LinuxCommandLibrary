# TAGLINE

Manage SSH public key resources in Azure

# TLDR

**Create an SSH key resource** (auto-generates a key pair)

```az sshkey create --name [MySSHKey] --resource-group [MyResourceGroup]```

**Create an SSH key from an existing public key**

```az sshkey create --name [MySSHKey] --resource-group [MyResourceGroup] --public-key "@[~/.ssh/id_rsa.pub]"```

**Create an Ed25519 SSH key resource**

```az sshkey create --name [MySSHKey] --resource-group [MyResourceGroup] --encryption-type [Ed25519]```

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

**--name** **--ssh-public-key-name** **-n**
> Name of the SSH public key resource.

**--resource-group** **-g**
> Name of the resource group.

**--public-key**
> SSH public key content, or `@filename` to read from a file. If omitted on create, a key pair is generated. A provided key must be at least 2048-bit and in ssh-rsa format.

**--encryption-type**
> Algorithm for a generated key. Accepts **RSA** (default) or **Ed25519**.

**--location** **-l**
> Azure region for the resource.

# DESCRIPTION

**az sshkey** manages Azure SSH public key resources, which store SSH public keys in Azure for reuse when creating VMs. This simplifies deployment by referencing a stored key rather than providing the key each time.

When **--public-key** is omitted on **create**, Azure generates a new key pair and returns the private key in the command output. Save it immediately, as it cannot be retrieved later.

# CAVEATS

Requires Azure CLI to be installed and authenticated; this is a core command, so no extension is needed. Only the public key is stored in Azure. When a key is auto-generated, capture the returned private key right away.

# SEE ALSO

[azure-cli](/man/azure-cli)(1), [az-vm](/man/az-vm)(1), [ssh-keygen](/man/ssh-keygen)(1)

# RESOURCES

```[Source code](https://github.com/Azure/azure-cli)```

```[Documentation](https://learn.microsoft.com/en-us/cli/azure/sshkey)```

```[Homepage](https://learn.microsoft.com/en-us/cli/azure/)```

<!-- verified: 2026-06-19 -->
