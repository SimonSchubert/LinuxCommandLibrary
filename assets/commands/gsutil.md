# TLDR

**List buckets**

```gsutil ls```

**List bucket contents**

```gsutil ls gs://[bucket-name]```

**Copy file to bucket**

```gsutil cp [file.txt] gs://[bucket]/```

**Copy bucket to local**

```gsutil cp gs://[bucket]/[file] [./]```

**Sync directory to bucket**

```gsutil rsync -r [local_dir] gs://[bucket]/[path]```

**Make object public**

```gsutil acl ch -u AllUsers:R gs://[bucket]/[file]```

**Remove object**

```gsutil rm gs://[bucket]/[file]```

# SYNOPSIS

**gsutil** [_options_] _command_ [_args_]

# DESCRIPTION

**gsutil** is a command-line tool for Google Cloud Storage. It manages buckets and objects, handling uploads, downloads, synchronization, and access control.

The tool supports parallel operations, resumable transfers, and integrates with other Google Cloud services. It's the primary interface for Cloud Storage management.

# PARAMETERS

**ls**
> List buckets or objects.

**cp**
> Copy files/objects.

**mv**
> Move files/objects.

**rm**
> Remove objects.

**rsync**
> Synchronize directories.

**mb**
> Make bucket.

**rb**
> Remove bucket.

**acl**
> Manage access control.

**-m**
> Parallel operations.

**-r**
> Recursive operation.

**-n**
> Dry run (no changes).

# CAVEATS

Requires Google Cloud authentication. Large transfers may incur costs. ACL changes need careful consideration. Parallel operations use more resources.

# HISTORY

**gsutil** was developed by **Google** as part of the Google Cloud SDK. It evolved from early Cloud Storage access tools to become the standard CLI for Cloud Storage operations, supporting Python 2 initially and later Python 3.

# SEE ALSO

[gcloud](/man/gcloud)(1), [aws](/man/aws)(1), [azcopy](/man/azcopy)(1), [rclone](/man/rclone)(1)
