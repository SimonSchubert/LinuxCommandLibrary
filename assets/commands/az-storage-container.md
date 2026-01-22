# TLDR

**Create a container**

```az storage container create -n [container-name] --account-name [account]```

**Create with public blob access**

```az storage container create -n [container-name] --public-access blob --account-name [account]```

**List all containers**

```az storage container list --account-name [account] -o table```

**Check if a container exists**

```az storage container exists -n [container-name] --account-name [account]```

**Show container properties**

```az storage container show -n [container-name] --account-name [account]```

**Generate a SAS token** for a container

```az storage container generate-sas -n [container-name] --permissions [dlrw] --expiry [2024-12-31T00:00Z] --account-name [account]```

**Delete a container**

```az storage container delete -n [container-name] --account-name [account]```

**Restore a soft-deleted container**

```az storage container restore -n [container-name] --deleted-version [version] --account-name [account]```

# SYNOPSIS

**az storage container** _subcommand_ [_options_]

# DESCRIPTION

**az storage container** manages blob storage containers in Azure Storage accounts. Containers provide a grouping of blobs similar to directories in a file system.

Containers can have different access levels: private (default), blob (anonymous read for blobs), or container (anonymous read for container and blobs). All blobs must reside in a container.

# SUBCOMMANDS

**Container Lifecycle**
> create, delete, list, exists, show, restore

**Access Control**
> set-permission, show-permission, generate-sas

**Metadata**
> metadata show, metadata update

**Leases**
> lease acquire, lease break, lease release, lease renew, lease change

**Policies**
> policy create, policy delete, policy list, policy show, policy update

**Compliance**
> immutability-policy create, immutability-policy delete, legal-hold set, legal-hold clear

# PARAMETERS

**-n, --name** _value_
> Name of the container

**--account-name** _value_
> Storage account name

**--account-key** _value_
> Storage account key

**--public-access** _value_
> Public access level: off, blob, container

**--fail-on-exist**
> Fail if the container already exists

**--permissions** _value_
> SAS permissions: (a)dd, (c)reate, (d)elete, (l)ist, (r)ead, (w)rite

**--expiry** _value_
> SAS token expiration datetime (UTC)

# CAVEATS

Container names must be 3-63 characters, lowercase letters, numbers, and hyphens only. Deleting a container deletes all contained blobs. Soft-delete policies allow recovery within the retention period. Immutability policies and legal holds prevent deletion for compliance purposes.

# SEE ALSO

[az-storage](/man/az-storage)(1), [az-storage-blob](/man/az-storage-blob)(1), [az-storage-account](/man/az-storage-account)(1)
