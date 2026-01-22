# TLDR

**Sign** a container image using the default PGP key

```apptainer sign [path/to/image.sif]```

Sign a container image using a **specific private key** file

```apptainer sign --key [path/to/private.pem] [path/to/image.sif]```

Sign a container image using a **specific PGP key index**

```apptainer sign -k [key_index] [path/to/image.sif]```

Sign a **specific object group** within the image

```apptainer sign -g [group_id] [path/to/image.sif]```

Sign a **specific object by ID** within the image

```apptainer sign -i [object_id] [path/to/image.sif]```

# SYNOPSIS

**apptainer sign** [_options_] _image.sif_

# DESCRIPTION

**apptainer sign** adds digital signatures to SIF container images, enabling verification of image integrity and authenticity. Signatures can use PGP keys or X.509 certificates.

Signing containers is essential for establishing trust in shared container images and meeting security requirements in production environments.

# PARAMETERS

**--key** _file_
> Path to a private key file for signing

**-k, --keyidx** _index_
> Index of the PGP key to use from the keyring

**-g, --group-id** _id_
> Sign only a specific object group within the SIF

**-i, --sif-id** _id_
> Sign only a specific object by ID within the SIF

# CAVEATS

A PGP key pair or X.509 certificate must be configured before signing. The private key must be kept secure; compromised keys should be revoked immediately.

# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-verify](/man/apptainer-verify)(1), [gpg](/man/gpg)(1)
