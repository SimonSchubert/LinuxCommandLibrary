# TAGLINE

Verify cryptographic signatures on container images

# TLDR

Check an image's signature against the **local keyring**

```apptainer verify [path/to/image.sif]```

Check it against **one public key** file

```apptainer verify --key [path/to/public.pem] [path/to/image.sif]```

Check an **X.509 certificate** signature instead of PGP

```apptainer verify --certificate [path/to/certificate.pem] [path/to/image.sif]```

Supply the **root certificates** the chain must lead back to

```apptainer verify --certificate [path/to/cert.pem] --certificate-roots [path/to/roots.pem] [path/to/image.sif]```

Ask the CA whether the certificate has been **revoked**

```apptainer verify --certificate [path/to/cert.pem] --ocsp-verify [path/to/image.sif]```

Check **every signed object**, not just the primary one

```apptainer verify --all [path/to/image.sif]```

Check one **object group**

```apptainer verify --group-id [1] [path/to/image.sif]```

Check a **single object** by its SIF id

```apptainer verify --sif-id [3] [path/to/image.sif]```

Report the result as **JSON**

```apptainer verify --json [path/to/image.sif]```

Use **only local keys**, never contacting a keyserver

```apptainer verify --local [path/to/image.sif]```

Accept the **old signature format**, which is not secure

```apptainer verify --legacy-insecure [path/to/image.sif]```

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

**-l, --local**
> Only verify with local key(s) in keyring

**-u, --url** _string_
> Specify a URL for a key server

**--legacy-insecure**
> Enable verification of (insecure) legacy signatures

**--certificate-intermediates** _file_
> Path to pool of intermediate certificates

**--certificate-roots** _file_
> Path to pool of root certificates

**--ocsp-verify**
> Enable online revocation check for certificates

# CAVEATS

Verification requires the public key or certificate corresponding to the signing key. Unsigned containers will fail verification. Keys from untrusted sources should not be used for verification.

# INSTALL

```dnf: sudo dnf install apptainer```

```pacman: sudo pacman -S apptainer```

```apk: sudo apk add apptainer```

```zypper: sudo zypper install apptainer```

```brew: brew install apptainer```

```nix: nix profile install nixpkgs#apptainer```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-sign](/man/apptainer-sign)(1), [gpg](/man/gpg)(1)
