# TAGLINE

manages Linode Object Storage

# TLDR

**List access keys**

```linode-cli object-storage keys-list```

**Create access key**

```linode-cli object-storage keys-create --label [my-key]```

**Delete access key**

```linode-cli object-storage keys-delete [key_id]```

**List S3 endpoints** by region

```linode-cli object-storage endpoints```

**List buckets** with the obj plugin

```linode-cli obj ls```

**Create bucket** with the obj plugin

```linode-cli obj mb [my-bucket] --cluster [us-east-1]```

**Upload a file** to a bucket

```linode-cli obj put [file] [my-bucket]```

**Delete a bucket** and its contents

```linode-cli obj rb [my-bucket] --recursive```

# SYNOPSIS

**linode-cli object-storage** _action_ [_options_]

**linode-cli obj** _command_ [_options_]

# PARAMETERS

**keys-list**, **keys-view** _keyId_
> List access keys or show one.

**keys-create**
> Create access key. Takes **--label**, and optionally **--regions** or bucket-limited access.

**keys-update** _keyId_
> Update an access key.

**keys-delete** _keyId_
> Revoke an access key.

**clusters-list**, **clusters-view** _clusterId_
> List clusters or show one.

**endpoints**
> List Object Storage endpoints.

**quotas-list**
> List Object Storage quotas.

**transfer-view**
> Show outbound data transfer usage.

**types**
> List Object Storage types and prices.

**cancel**
> Cancel Object Storage on the account.

**obj ls**, **obj la**, **obj du**
> List buckets or objects, list all objects, or show usage.

**obj mb** _name_, **obj rb** _name_ [**--recursive**]
> Create or remove a bucket.

**obj put** _file_ ... _bucket_, **obj get** _bucket_ _object_, **obj rm** _bucket_ _object_
> Upload, download, or delete objects.

**obj signurl** _bucket_ _object_ _expiry_
> Generate a signed URL.

**obj setacl**, **obj ws-create**, **obj ws-info**, **obj ws-delete**
> Set an ACL or manage static website hosting.

**--cluster** _id_
> Cluster for **obj** plugin commands.

# DESCRIPTION

**linode-cli object-storage** manages Linode Object Storage (S3-compatible) access keys and account settings through the Linode API. Bucket and object operations are provided by the separate **linode-cli obj** plugin. Part of Linode CLI.

# CAVEATS

The API bucket operations are excluded from the generated CLI, so **buckets-list**, **buckets-create**, and **buckets-delete** are not available; use **linode-cli obj** instead. The **cancel** action cancels the service for the whole account and removes its buckets.

# SEE ALSO

[linode-cli](/man/linode-cli)(1), [s3cmd](/man/s3cmd)(1)

# RESOURCES

```[Source code](https://github.com/linode/linode-cli)```

```[Documentation](https://techdocs.akamai.com/cloud-computing/docs/getting-started-with-the-linode-cli)```

<!-- verified: 2026-11-09 -->
