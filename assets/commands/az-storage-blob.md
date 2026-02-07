# TAGLINE

Manage Azure Blob Storage objects

# TLDR

**Upload a file** to blob storage

```az storage blob upload -f [/path/to/file] -c [container-name] -n [blob-name] --account-name [account]```

**Download a blob** to local filesystem

```az storage blob download -f [/path/to/file] -c [container-name] -n [blob-name] --account-name [account]```

**List blobs** in a container

```az storage blob list -c [container-name] --account-name [account] -o table```

**Delete a blob**

```az storage blob delete -c [container-name] -n [blob-name] --account-name [account]```

**Upload multiple files** from a directory

```az storage blob upload-batch -d [container-name] -s [/path/to/directory] --account-name [account]```

**Download multiple blobs** matching a pattern

```az storage blob download-batch -d [./local-dir] -s [container-name] --pattern "*.txt" --account-name [account]```

**Generate a SAS token** for a blob

```az storage blob generate-sas -c [container-name] -n [blob-name] --permissions [r] --expiry [2024-12-31T00:00Z] --account-name [account]```

**Set blob access tier**

```az storage blob set-tier -c [container-name] -n [blob-name] --tier [Cool] --account-name [account]```

# SYNOPSIS

**az storage blob** _subcommand_ [_options_]

# DESCRIPTION

**az storage blob** manages object storage for unstructured data in Azure Blob Storage. Blobs can store any type of text or binary data including documents, media files, and application data.

The command group supports uploading, downloading, copying, and managing blob properties, metadata, access tiers, and security settings.

# SUBCOMMANDS

**Transfer Operations**
> upload, upload-batch, download, download-batch, copy start, copy cancel

**Blob Management**
> list, delete, delete-batch, exists, show, snapshot, restore

**Properties & Metadata**
> metadata show, metadata update, update, set-tier, tag list, tag set

**Security**
> generate-sas, lease acquire, lease break, lease release, lease renew

**Queries**
> query (SQL queries on blob data)

# PARAMETERS

**-c, --container-name** _value_
> Name of the blob container

**-n, --name** _value_
> Name of the blob

**-f, --file** _value_
> Path to the local file for upload/download

**--account-name** _value_
> Storage account name

**--account-key** _value_
> Storage account key

**--sas-token** _value_
> Shared Access Signature token

**--tier** _value_
> Access tier: Hot, Cool, Cold, Archive

**--pattern** _value_
> Glob pattern for batch operations

# CAVEATS

Authentication is required via **--account-key**, **--sas-token**, **--connection-string**, or **--auth-mode login**. Archive tier blobs must be rehydrated before access. Batch operations respect patterns but do not recursively traverse virtual directories by default. Delete operations mark blobs for deletion; soft-delete policies may allow recovery.

# SEE ALSO

[az-storage](/man/az-storage)(1), [az-storage-container](/man/az-storage-container)(1), [az-storage-account](/man/az-storage-account)(1)
