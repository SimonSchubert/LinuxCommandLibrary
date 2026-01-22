# TLDR

**Sign container image (keyless)**

```cosign sign [registry/image@sha256:digest]```

**Sign with local key**

```cosign sign --key [cosign.key] [registry/image@sha256:digest]```

**Verify image signature (keyless)**

```cosign verify --certificate-identity=[email] --certificate-oidc-issuer=[issuer] [image]```

**Verify with public key**

```cosign verify --key [cosign.pub] [registry/image@sha256:digest]```

**Generate key pair**

```cosign generate-key-pair```

**Sign with annotation**

```cosign sign -a [key=value] [registry/image@sha256:digest]```

**Attach SBOM to image**

```cosign attach sbom --sbom [sbom.json] [registry/image@sha256:digest]```

# SYNOPSIS

**cosign** _command_ [_options_] [_arguments_]

# DESCRIPTION

**cosign** is Sigstore's tool for signing and verifying container images and software artifacts. It supports keyless signing using OIDC identity or traditional key-based signing.

# COMMANDS

**sign**
> Sign container image

**verify**
> Verify image signature

**generate-key-pair**
> Generate signing key pair

**attach**
> Attach artifacts (SBOM, attestation) to image

**download**
> Download signatures/artifacts

**triangulate**
> Find signature location for image

**copy**
> Copy signatures between images

**clean**
> Remove signatures from image

# PARAMETERS

**--key** _path|uri_
> Key for signing/verification

**--certificate** _path_
> Certificate for signing

**--certificate-chain** _path_
> Certificate chain

**--certificate-identity** _identity_
> Expected identity in certificate

**--certificate-oidc-issuer** _issuer_
> Expected OIDC issuer

**-a** _key=value_
> Add annotation to signature

# KEYLESS SIGNING

Uses OIDC identity (GitHub, Google, etc.) with short-lived keys. Signatures recorded in transparency log.

# KMS SUPPORT

Supports AWS KMS, GCP KMS, Azure Key Vault, HashiCorp Vault via URI format.

# CAVEATS

Always sign by digest (@sha256:...) not tag. Multiple signatures can be attached to one image. Keyless requires internet for OIDC flow.

# SEE ALSO

[docker](/man/docker)(1), [podman](/man/podman)(1), [notation](/man/notation)(1)
