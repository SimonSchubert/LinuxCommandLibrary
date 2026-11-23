# TAGLINE

Command-line client for Tigris S3-compatible object storage

# TLDR

**Log in** via the browser (OAuth device flow)

```tigris login```

**Save access-key credentials** for non-interactive use

```tigris configure --access-key [tid_...] --access-secret [tsec_...]```

**Show** the currently logged-in user and organization

```tigris whoami```

**Create** a new bucket

```tigris mk [bucket_name]```

**List** all buckets, or objects under a bucket/prefix

```tigris ls [t3://bucket_name/prefix/]```

**Upload** a local file into a bucket

```tigris cp [path/to/file] t3://[bucket_name]/[key]```

**Recursively upload** a directory, skipping existing keys

```tigris cp -r --no-overwrite [path/to/dir/] t3://[bucket_name]/[prefix]/```

**Download** an object to a local path

```tigris cp t3://[bucket_name]/[key] [path/to/file]```

**Recursively delete** a prefix without confirmation

```tigris rm -rf t3://[bucket_name]/[prefix]/```

**Generate** a presigned download URL valid for two hours

```tigris presign t3://[bucket_name]/[key] --expires-in [7200]```

# SYNOPSIS

**tigris** _command_ [_subcommand_] [_arguments_] [_flags_]

**t3** _command_ [_subcommand_] [_arguments_] [_flags_]

# PARAMETERS

**login** [**oauth**|**credentials**|**select**]
> Start a session via OAuth in the browser (default) or with temporary access-key credentials. Cleared by **logout**.

**logout**
> End the current session. Credentials saved with **configure** are kept.

**configure** [**--access-key** _id_] [**--access-secret** _secret_] [**-e** _endpoint_]
> Save access-key credentials to _~/.tigris/config.json_ for persistent use.

**whoami**
> Print the authenticated user, organization, and auth method.

**credentials test** [**-b** _bucket_]
> Verify the current credentials, optionally against a bucket.

**ls** [_path_] [**--format** _fmt_] [**--limit** _n_]
> List buckets when given no argument, or objects under a bucket / prefix. Accepts bare names or **t3://** URIs.

**mk** _path_ [**--public**] [**-s**] [**-l** _location_] [**--fork-of** _bucket_]
> Create a bucket (bare name) or a folder inside a bucket (trailing slash). **-s** enables snapshots; **--fork-of** creates a copy-on-write fork.

**cp** [**-r**] [**-a** _access_] [**--cache-control** _value_] [**--no-overwrite**] _src_ _dst_
> Copy between local paths and **t3://** URIs or within Tigris. At least one side must be remote.

**mv** [**-r**] [**-f**] _src_ _dst_
> Move (rename) objects within Tigris.

**rm** [**-r**] [**-f**] _path_
> Remove an object, folder (with **-r**), or a bucket (bare name). Wildcards are supported.

**touch** _path_
> Create a zero-byte object at the given key.

**stat** [_path_]
> Show storage stats, bucket info, or object metadata.

**presign** _path_ [**-m** _method_] [**-e** _seconds_]
> Generate a presigned URL (default method _get_, default expiry _3600_ seconds).

**bundle**
> Download many objects as a single streaming tar archive.

**buckets**, **objects**, **snapshots**, **access-keys**, **iam**, **organizations**
> Lower-level management command groups (e.g. **buckets create**, **objects put**, **snapshots take**, **access-keys create**).

**update**
> Update the CLI to the latest version.

**-y**, **-f**, **--force**
> Skip confirmation prompts (for **rm**, **mv** and delete operations).

**--format** _format_
> Output format such as _table_ (default) or _json_.

**help**, **--help**
> Show help for any command (**tigris** _command_ **help**).

# DESCRIPTION

**tigris** is the official command-line client for **Tigris**, a globally distributed, S3-compatible object storage service. It presents a **UNIX-flavoured** interface modelled after **ls**, **cp**, **mv**, **rm**, **touch** and **stat**, with **t3://**_bucket_/_key_ URIs (or bare _bucket/key_ paths) identifying remote objects. Higher-level features include bucket snapshots and forks, lifecycle rules, CORS, notifications, access keys and IAM policies.

Because Tigris is S3-compatible, the same buckets are reachable with the **AWS CLI** by pointing **--endpoint-url** at _https://t3.storage.dev_; the dedicated CLI mainly improves ergonomics, login flow, and Tigris-specific features. The binary is also installed as **t3** for terser one-liners.

# CONFIGURATION

Login state and credentials saved with **tigris configure** live in _~/.tigris/config.json_ (mode 600, managed by the CLI).

Environment variables override stored login state, in this priority order:

```
AWS_PROFILE                       # with ~/.aws/credentials
AWS_ACCESS_KEY_ID
AWS_SECRET_ACCESS_KEY
AWS_ENDPOINT_URL_S3               # default https://t3.storage.dev
TIGRIS_STORAGE_ACCESS_KEY_ID
TIGRIS_STORAGE_SECRET_ACCESS_KEY
TIGRIS_STORAGE_ENDPOINT
TIGRIS_FORCE_PATH_STYLE           # use path-style addressing
```

When both **AWS_*** and **TIGRIS_*** variables are set, the **AWS_*** ones win, so existing S3 tooling configuration can target Tigris unchanged.

# CAVEATS

Requires **Node.js 20.19** or later when installed via npm. **rm** on a bare bucket name deletes the bucket itself. Bucket names are **globally unique**, similar to S3. Private objects can be shared for a limited time with **presign**. The current CLI targets **Tigris Object Storage** and is distinct from the CLI of Tigris Data's earlier, discontinued database product.

# HISTORY

**Tigris** is operated by **Tigris Data** and is closely integrated with **Fly.io**, where buckets can also be provisioned with **fly storage create**. The CLI is published on npm as **@tigrisdata/cli** and developed in the **tigrisdata/storage** monorepo (the separate **tigrisdata/cli** repository points there).

# SEE ALSO

[aws](/man/aws)(1), [s3cmd](/man/s3cmd)(1), [rclone](/man/rclone)(1), [flyctl](/man/flyctl)(1), [mc](/man/mc)(1)

# RESOURCES

```[Source code](https://github.com/tigrisdata/storage/tree/main/packages/cli)```

```[Homepage](https://www.tigrisdata.com)```

```[Documentation](https://www.tigrisdata.com/docs/cli/)```

<!-- verified: 2026-11-23 -->
