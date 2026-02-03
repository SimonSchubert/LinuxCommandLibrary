# TLDR

**Login to Pulumi Cloud**

```pulumi login```

**Login to local backend**

```pulumi login --local```

**Login to specific cloud**

```pulumi login [url]```

**Login to S3 backend**

```pulumi login s3://[bucket]```

# SYNOPSIS

**pulumi** **login** [_options_] [_url_]

# PARAMETERS

**--local**
> Use local file backend.

**--cloud-url** _url_
> Specify backend URL.

**-c**, **--cloud**
> Login to Pulumi Cloud.

# DESCRIPTION

**pulumi login** authenticates with a Pulumi backend. Supports Pulumi Cloud, self-hosted backends, and cloud storage backends (S3, Azure Blob, GCS). Backend stores stack state and history.

# SEE ALSO

[pulumi](/man/pulumi)(1), [pulumi-logout](/man/pulumi-logout)(1), [pulumi-whoami](/man/pulumi-whoami)(1)

