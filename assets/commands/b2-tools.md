# TAGLINE

Official Backblaze B2 cloud storage command-line tool

# TLDR

**Authorize account**

```b2 account authorize [applicationKeyId] [applicationKey]```

**Upload a file to a bucket**

```b2 file upload [bucketName] [localFile] [remoteName]```

**Download a file from a bucket**

```b2 file download [b2://bucketName/fileName] [localPath]```

**List files in a bucket**

```b2 ls [bucketName]```

**Create a new bucket**

```b2 bucket create [bucketName] [allPrivate]```

**Sync a local directory to B2**

```b2 sync [localDir] b2://[bucketName]/[prefix]```

# SYNOPSIS

**b2** _command_ [_options_]

# PARAMETERS

**account authorize** _keyID_ _key_
> Authorize with B2 using application key.

**file upload** _bucket_ _local_ _remote_
> Upload a file to a bucket.

**file download** _uri_ _local_
> Download a file from B2.

**ls** _bucket_
> List files in a bucket.

**bucket create** _name_ _type_
> Create a bucket (allPrivate or allPublic).

**bucket delete** _name_
> Delete a bucket.

**sync** _source_ _destination_
> Synchronize files between local and B2 or between B2 buckets.

**file hide** _bucket_ _file_
> Hide a file (soft delete).

# DESCRIPTION

**b2-tools** (invoked as **b2**) is the official command-line tool for Backblaze B2 Cloud Storage. It provides file upload, download, sync, and bucket management operations for B2's S3-compatible object storage.

The sync command efficiently mirrors local directories to B2, uploading only changed files. B2 provides affordable cloud storage with free egress through Cloudflare's bandwidth alliance.

# CAVEATS

Requires application key authorization before use. Large file uploads are automatically split into parts. The sync command compares by SHA1 hash, so the first sync of large directories can be slow. B2-native URIs use the `b2://` prefix.

# HISTORY

**b2-tools** is the official CLI developed by **Backblaze** for their B2 Cloud Storage service. It was open-sourced on GitHub and is installable via pip as `b2`.

# SEE ALSO

[b2](/man/b2)(1), [rclone](/man/rclone)(1), [duplicity](/man/duplicity)(1)
