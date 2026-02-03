# TLDR

**List buckets**

```linode-cli object-storage buckets-list```

**Create bucket**

```linode-cli object-storage buckets-create --cluster [us-east-1] --label [my-bucket]```

**Delete bucket**

```linode-cli object-storage buckets-delete [cluster] [bucket]```

**List access keys**

```linode-cli object-storage keys-list```

**Create access key**

```linode-cli object-storage keys-create --label [my-key]```

# SYNOPSIS

**linode-cli object-storage** _command_ [_options_]

# PARAMETERS

**buckets-list**
> List all buckets.

**buckets-create**
> Create bucket.

**buckets-delete** _cluster_ _bucket_
> Delete bucket.

**keys-list**
> List access keys.

**keys-create**
> Create access key.

**--cluster** _id_
> Cluster/region ID.

**--label** _name_
> Bucket or key label.

# DESCRIPTION

**linode-cli object-storage** manages Linode Object Storage (S3-compatible). Create buckets, manage access keys, and configure storage. Part of Linode CLI.

# SEE ALSO

[linode-cli](/man/linode-cli)(1), [s3cmd](/man/s3cmd)(1)

