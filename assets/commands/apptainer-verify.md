# TLDR

**Verify** a container image using the default PGP keyring

```apptainer verify [path/to/image.sif]```

Verify a container image using a **specific public key** file

```apptainer verify --key [path/to/public.pem] [path/to/image.sif]```

Verify a container image using a **certificate** file

```apptainer verify --certificate [path/to/certificate.pem] [path/to/image.sif]```

Verify **all objects** in the image

```apptainer verify -a [path/to/image.sif]```

Verify a **specific object group** within the image

```apptainer verify -g [group_id] [path/to/image.sif]```

Verify a **specific object by ID** within the image

```apptainer verify -i [object_id] [path/to/image.sif]```

Output verification results in **JSON format**

```apptainer verify -j [path/to/image.sif]```

# SYNOPSIS

**apptainer verify** [_options_] _image.sif_

# DESCRIPTION

**apptainer verify** validates the cryptographic signatures on SIF container images. This confirms that the image has not been tampered with and was signed by a trusted party.

Verification can use PGP public keys, X.509 certificates, or keys fetched from a keyserver. The command exits with a non-zero status if verification fails.

# PARAMETERS

**--key** _file_
> Path to a public key file for verification

**--certificate** _file_
> Path to a certificate file for verification

**-a, --all**
> Verify all objects in the SIF image

**-g, --group-id** _id_
> Verify only a specific object group

**-i, --sif-id** _id_
> Verify only a specific object by ID

**-j, --json**
> Output results in JSON format

# CAVEATS

Verification requires the public key or certificate corresponding to the signing key. Unsigned containers will fail verification. Keys from untrusted sources should not be used for verification.

# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-sign](/man/apptainer-sign)(1), [gpg](/man/gpg)(1)
