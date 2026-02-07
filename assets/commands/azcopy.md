# TAGLINE

High-performance data transfer for Azure Storage

# TLDR

**Copy a local file** to Azure Blob Storage

```azcopy copy [path/to/file] "https://[account].blob.core.windows.net/[container]/[blob]?[SAS_token]"```

**Download a blob** to local filesystem

```azcopy copy "https://[account].blob.core.windows.net/[container]/[blob]?[SAS_token]" [path/to/destination]```

**Sync a local directory** to a container

```azcopy sync [path/to/directory] "https://[account].blob.core.windows.net/[container]?[SAS_token]"```

**Copy between storage accounts**

```azcopy copy "https://[source].blob.core.windows.net/[container]?[SAS]" "https://[dest].blob.core.windows.net/[container]?[SAS]" --recursive```

**Copy with pattern matching**

```azcopy copy "https://[account].blob.core.windows.net/[container]/*.txt?[SAS]" [path/to/destination]```

**List blobs** in a container

```azcopy list "https://[account].blob.core.windows.net/[container]?[SAS_token]"```

**Login with Azure AD**

```azcopy login```

**Show transfer jobs**

```azcopy jobs list```

# SYNOPSIS

**azcopy** _command_ [_options_]

# DESCRIPTION

**AzCopy** is a command-line utility for high-performance data transfer to and from Azure Blob Storage, Azure Files, and Azure Data Lake Storage. It uses parallel connections and automatic retry logic for reliable transfers.

AzCopy supports copying between local filesystems and Azure storage, between Azure storage accounts, and to/from AWS S3. Authentication can use SAS tokens, Azure AD, or service principals.

The sync command provides one-way synchronization, copying only new or modified files. Copy operations can preserve metadata, access tiers, and handle recursive directory structures.

# PARAMETERS

**copy**
> Copy files or blobs between locations.

**sync**
> Synchronize source to destination.

**list**
> List blobs or files.

**login**
> Authenticate with Azure AD.

**logout**
> Clear cached credentials.

**jobs list**
> Show transfer jobs.

**jobs show**
> Get details of a specific job.

**jobs resume**
> Resume a failed transfer.

**remove**
> Delete blobs or files.

**--recursive**
> Include subdirectories.

**--include-pattern** _pattern_
> Include files matching pattern.

**--exclude-pattern** _pattern_
> Exclude files matching pattern.

**--overwrite** _mode_
> true, false, prompt, or ifSourceNewer.

**--preserve-smb-permissions**
> Preserve Windows ACLs.

**--block-size-mb** _size_
> Block size for uploads.

**--cap-mbps** _rate_
> Limit transfer rate.

**--dry-run**
> Show what would be transferred.

**--log-level** _level_
> Logging verbosity.

# CAVEATS

SAS tokens must have appropriate permissions (read, write, list, delete). URL must be quoted to prevent shell interpretation of special characters. Sync is one-way only and does not delete files at destination by default. Large files are automatically split into blocks. Performance depends on network bandwidth and storage account limits.

# HISTORY

**AzCopy v10** was released in **2018** as a complete rewrite from earlier versions, moving from .NET to Go for cross-platform support. It replaced the Windows-only AzCopy v8. The tool has gained features including Azure AD authentication, S3-to-Azure migration, benchmark command, and integration with Azure Storage lifecycle. It remains the recommended tool for bulk Azure storage operations.

# SEE ALSO

[az](/man/az)(1), [az-storage](/man/az-storage)(1), [rsync](/man/rsync)(1), [rclone](/man/rclone)(1)
