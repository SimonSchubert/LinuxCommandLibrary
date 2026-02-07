# TAGLINE

Manage Azure Cloud Storage resources

# TLDR

**Copy a local file** to blob storage

```az storage copy -s [/path/to/file.txt] -d https://[account].blob.core.windows.net/[container]/[blob]```

**Download a blob** to local filesystem

```az storage copy -s https://[account].blob.core.windows.net/[container]/[blob] -d [/path/to/file.txt]```

**Upload a directory recursively**

```az storage copy -s [/path/to/dir] -d https://[account].blob.core.windows.net/[container]/[path/] --recursive```

**Copy between storage accounts**

```az storage copy -s https://[src].blob.core.windows.net/[container]/[blob] -d https://[dest].blob.core.windows.net/[container]/[blob]```

**Delete a blob**

```az storage remove -c [container-name] -n [blob-name] --account-name [account]```

**Delete a directory** recursively

```az storage remove -c [container-name] -n [path/to/directory] --recursive --account-name [account]```

**Copy from AWS S3** to Azure Blob

```az storage copy -s https://s3.amazonaws.com/[bucket]/[object] -d https://[account].blob.core.windows.net/[container]/[blob]```

# SYNOPSIS

**az storage** _subcommand_ [_options_]

# DESCRIPTION

**az storage** manages Azure Cloud Storage resources including storage accounts, blob containers, file shares, queues, and tables. It provides commands for uploading, downloading, copying, and managing stored data.

Azure Storage offers multiple storage types: Blob storage for unstructured data, File storage for SMB file shares, Queue storage for messaging, and Table storage for NoSQL data.

# SUBCOMMANDS

**Account Management**
> account create, account delete, account list, account show, account keys list

**Blob Storage**
> blob upload, blob download, blob delete, blob list, blob copy

**Containers**
> container create, container delete, container list, container lease

**File Shares**
> share create, share delete, share list, file upload, file download

**Copy Operations**
> copy, remove

**Data Lake Gen2**
> fs create, fs file upload, fs directory create

**Queue & Table**
> queue create, queue list, message put, table create, entity insert

# PARAMETERS

**--account-name** _value_
> Storage account name

**--account-key** _value_
> Storage account access key

**--connection-string** _value_
> Storage account connection string

**-c, --container** _value_
> Blob container name

**-s, --source** _value_
> Source path (local or URL)

**-d, --destination** _value_
> Destination path (local or URL)

**--recursive** _value_
> Process subdirectories recursively

**--auth-mode** _value_
> Authentication mode: key or login

# CAVEATS

Commands support multiple authentication methods: account key, SAS token, Azure AD login, or connection string. The **copy** command uses AzCopy under the hood and supports S3-to-Azure transfers. Wildcard patterns work differently than shell globbing; use **--include-pattern** and **--exclude-pattern**.

# SEE ALSO

[az](/man/az)(1), [az-storage-account](/man/az-storage-account)(1), [az-storage-blob](/man/az-storage-blob)(1), [azcopy](/man/azcopy)(1)
