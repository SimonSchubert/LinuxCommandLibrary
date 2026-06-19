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

**Generate an account-level SAS token**

```az storage account generate-sas --account-name [account-name] --services [bfqt] --resource-types [sco] --permissions [racwdl] --expiry [2026-12-31T00:00Z]```

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
> keys list, keys renew, generate-sas, show-connection-string, revoke-delegation-keys

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
> Storage SKU. Default **Standard_RAGRS**. Values include Standard_LRS, Standard_GRS, Standard_RAGRS, Standard_ZRS, Standard_GZRS, Standard_RAGZRS, Premium_LRS, Premium_ZRS.

**--kind** _value_
> Account kind. Default **StorageV2**. Values: StorageV2, Storage, BlobStorage, FileStorage, BlockBlobStorage.

**--access-tier** _value_
> Access tier for blob data: Hot, Cool, Cold, Premium.

**--https-only** _value_
> Require HTTPS for requests. Default **true**.

**--min-tls-version** _value_
> Minimum TLS version allowed: TLS1_0, TLS1_1, TLS1_2, TLS1_3.

**--allow-blob-public-access** _value_
> Allow anonymous public access to blobs. Default **false** for new accounts.

**--hns**, **--enable-hierarchical-namespace** _value_
> Enable hierarchical namespace (Azure Data Lake Storage Gen2).

# CAVEATS

Storage account names must be globally unique across all Azure customers. Changing redundancy options (GRS to LRS) may require data migration. Deleting a storage account is irreversible and removes all contained data. Premium accounts have different pricing and performance characteristics.

# HISTORY

Azure Storage was one of the first Azure services, available since the platform's launch in **2010**. StorageV2 accounts became the recommended default in **2018**, unifying previously separate storage types and enabling new features like access tiers.

# SEE ALSO

[az](/man/az)(1), [azure-cli](/man/azure-cli)(1), [az-storage](/man/az-storage)(1), [az-storage-blob](/man/az-storage-blob)(1), [az-storage-container](/man/az-storage-container)(1), [azcopy](/man/azcopy)(1)

# RESOURCES

```[Documentation](https://learn.microsoft.com/en-us/cli/azure/storage/account)```

```[Homepage](https://learn.microsoft.com/en-us/cli/azure/)```

```[Source code](https://github.com/Azure/azure-cli)```

<!-- verified: 2026-06-19 -->
