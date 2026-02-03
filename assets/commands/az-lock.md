# TLDR

**Create a read-only lock** on a resource group

```az lock create --name [MyLock] --resource-group [MyResourceGroup] --lock-type ReadOnly```

**Create a delete lock** to prevent accidental deletion

```az lock create --name [MyLock] --resource-group [MyResourceGroup] --lock-type CanNotDelete```

**List all locks** in a resource group

```az lock list --resource-group [MyResourceGroup]```

**Show details** of a lock

```az lock show --name [MyLock] --resource-group [MyResourceGroup]```

**Delete a lock**

```az lock delete --name [MyLock] --resource-group [MyResourceGroup]```

**Create a lock** on a specific resource

```az lock create --name [MyLock] --resource-group [MyResourceGroup] --resource-name [MyResource] --resource-type [Microsoft.Storage/storageAccounts] --lock-type CanNotDelete```

# SYNOPSIS

**az** **lock** _subcommand_ [_options_]

# SUBCOMMANDS

**create**
> Create a lock.

**delete**
> Delete a lock.

**list**
> List locks.

**show**
> Show details of a lock.

**update**
> Update a lock.

# PARAMETERS

**--name** **-n**
> Name of the lock.

**--lock-type** **-t**
> Type of lock: CanNotDelete or ReadOnly.

**--resource-group** **-g**
> Name of resource group.

**--resource-name**
> Name of the resource being locked.

**--resource-type**
> The type of the resource being locked.

**--notes**
> Notes about the lock.

# DESCRIPTION

**az lock** manages Azure resource locks. Locks prevent accidental deletion or modification of critical resources. Two lock types are available: **CanNotDelete** allows read and modify operations but prevents deletion, while **ReadOnly** allows only read operations.

Locks can be applied at subscription, resource group, or individual resource level. Child resources inherit locks from parent resources.

# CAVEATS

Requires Azure CLI and appropriate RBAC permissions (Owner or User Access Administrator). Locks do not restrict actions performed by the Azure platform itself. A ReadOnly lock on a resource group affects all resources within it.

# SEE ALSO

[az](/man/az)(1), [az-tag](/man/az-tag)(1), [az-provider](/man/az-provider)(1)
