# TAGLINE

Manage Azure Storage accounts

# TLDR

**Create a storage account**

```az storage account create -n [account-name] -g [resource-group] -l [westus] --sku [Standard_LRS]```

**List all storage accounts**

```az storage account list -o table```

**Show storage account details**

```az storage account show -n [account-name] -g [resource-group]```

**Get the connection string**

```az storage account show-connection-string -n [account-name] -g [resource-group]```

**List storage account keys**

```az storage account keys list -n [account-name] -g [resource-group]```

**Generate a SAS token**

```az storage account generate-sas --permissions [rwdlac] --account-name [account-name] --services [bfqt] --resource-types [sco] --expiry [2024-12-31T00:00Z]```

**Check name availability**

```az storage account check-name --name [proposed-name]```

**Delete a storage account**

```az storage account delete -n [account-name] -g [resource-group] --yes```

# SYNOPSIS

**az storage account** _subcommand_ [_options_]

# DESCRIPTION

**az storage account** manages Azure storage accounts, which provide a unique namespace for storing and accessing Azure Storage data objects. Storage accounts support blobs, files, queues, tables, and disks.

Different account types and SKUs offer varying performance tiers, redundancy options, and access patterns. StorageV2 (general-purpose v2) accounts support all storage services and features.

# SUBCOMMANDS

**Account Lifecycle**
> create, delete, list, show, update, check-name

**Access**
> keys list, keys renew, generate-sas, show-connection-string

**Network Security**
> network-rule add, network-rule list, network-rule remove, private-endpoint-connection

**Blob Service**
> blob-service-properties show, blob-service-properties update, blob-inventory-policy

**File Service**
> file-service-properties show, file-service-properties update

**Advanced**
> management-policy create, encryption-scope create, failover, local-user

# PARAMETERS

**-n, --name** _value_
> Storage account name (globally unique, 3-24 chars, lowercase/numbers only)

**-g, --resource-group** _value_
> Name of the resource group

**-l, --location** _value_
> Azure region for the storage account

**--sku** _value_
> Storage SKU: Standard_LRS, Standard_GRS, Standard_RAGRS, Standard_ZRS, Premium_LRS, Premium_ZRS

**--kind** _value_
> Account kind: StorageV2, Storage, BlobStorage, FileStorage, BlockBlobStorage

**--access-tier** _value_
> Access tier for blob data: Hot, Cool, Cold, Premium

# CAVEATS

Storage account names must be globally unique across all Azure customers. Changing redundancy options (GRS to LRS) may require data migration. Deleting a storage account is irreversible and removes all contained data. Premium accounts have different pricing and performance characteristics.

# HISTORY

Azure Storage was one of the first Azure services, available since the platform's launch in **2010**. StorageV2 accounts became the recommended default in **2018**, unifying previously separate storage types and enabling new features like access tiers.

# SEE ALSO

[az](/man/az)(1), [az-storage](/man/az-storage)(1), [az-storage-blob](/man/az-storage-blob)(1), [az-storage-container](/man/az-storage-container)(1)
