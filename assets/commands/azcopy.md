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

**Benchmark** throughput against a container

```azcopy bench "https://[account].blob.core.windows.net/[container]?[SAS_token]"```

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

**bench**
> Run a throughput benchmark against a storage target.

**make**
> Create a container or file share.

**--recursive**
> Include subdirectories (default false).

**--include-pattern** _pattern_
> Include files matching a semicolon-separated pattern list.

**--exclude-pattern** _pattern_
> Exclude files matching a semicolon-separated pattern list.

**--overwrite** _mode_
> true, false, prompt, or ifSourceNewer (default true).

**--put-md5**
> Compute and store an MD5 hash with each uploaded blob (default false).

**--check-md5** _mode_
> Verify MD5 on download: NoCheck, LogOnly, FailIfDifferent, or FailIfDifferentOrMissing (default FailIfDifferent).

**--from-to** _value_
> Force the transfer direction, for example LocalBlob or BlobLocal.

**--as-subdir**
> Place the source directory as a subdirectory at the destination (default true).

**--preserve-permissions**
> Preserve ACLs and permissions (SMB or POSIX).

**--block-size-mb** _size_
> Block size in MiB used for uploads and downloads (default 0, auto).

**--cap-mbps** _rate_
> Cap the transfer rate in megabits per second (default 0, uncapped).

**--dry-run**
> Show what would be transferred without performing it.

**--log-level** _level_
> Logging verbosity: DEBUG, INFO, WARNING, ERROR, or NONE (default INFO).

# CAVEATS

SAS tokens must have appropriate permissions (read, write, list, delete). URL must be quoted to prevent shell interpretation of special characters. Sync is one-way only and does not delete files at destination by default. Large files are automatically split into blocks. Performance depends on network bandwidth and storage account limits.

# HISTORY

**AzCopy v10** was released in **2018** as a complete rewrite from earlier versions, moving from .NET to Go for cross-platform support. It replaced the Windows-only AzCopy v8. The tool has gained features including Azure AD authentication, S3-to-Azure migration, benchmark command, and integration with Azure Storage lifecycle. It remains the recommended tool for bulk Azure storage operations.

# INSTALL

```pacman: sudo pacman -S azcopy```

```brew: brew install azcopy```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[az](/man/az)(1), [az-storage](/man/az-storage)(1), [rsync](/man/rsync)(1), [rclone](/man/rclone)(1)

# RESOURCES

```[Source code](https://github.com/Azure/azure-storage-azcopy)```

```[Documentation](https://learn.microsoft.com/en-us/azure/storage/common/storage-use-azcopy-v10)```

<!-- verified: 2026-06-19 -->
