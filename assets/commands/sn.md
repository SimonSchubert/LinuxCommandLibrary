# TAGLINE

.NET strong name key management tool

# TLDR

**Create key pair**

```sn -k [keypair.snk]```

**Extract public key**

```sn -p [keypair.snk] [public.snk]```

**Display token**

```sn -t [assembly.dll]```

**Display public key**

```sn -tp [keypair.snk]```

**Verify signature**

```sn -v [assembly.dll]```

# SYNOPSIS

**sn** [_-k file_] [_-p input output_] [_-t file_] [_options_]

# PARAMETERS

**-k** _FILE_
> Generate key pair.

**-p** _IN OUT_
> Extract public key.

**-t** _FILE_
> Show token.

**-tp** _FILE_
> Show public key.

**-v** _FILE_
> Verify assembly.

**-R** _FILE KEY_
> Re-sign assembly.

# DESCRIPTION

**sn** (Strong Name tool) creates and manages cryptographic key pairs used for signing .NET assemblies. Strong naming gives an assembly a unique identity by combining its name, version number, culture information, and a public key, preventing conflicts between assemblies with the same simple name.

The tool generates RSA key pairs for signing, extracts public keys for distribution without exposing the private key, and displays public key tokens (a short hash used as a compact identifier). It can also verify that an assembly's strong name signature is valid and re-sign assemblies with a different key pair.

Strong naming is part of the .NET Framework and Mono runtime. While still supported, Microsoft now recommends NuGet package signing for most scenarios, and strong naming is primarily used for legacy compatibility and Global Assembly Cache (GAC) registration.

# CAVEATS

.NET specific. Windows tool via Mono. Strong naming deprecated.

# HISTORY

**sn** (Strong Name tool) is part of the **.NET SDK** for creating and managing cryptographic keys for assembly signing.

# SEE ALSO

[mono](/man/mono)(1), [gacutil](/man/gacutil)(1), [mcs](/man/mcs)(1)
