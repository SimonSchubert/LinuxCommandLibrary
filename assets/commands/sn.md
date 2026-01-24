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

**sn** manages strong names. It's for .NET assemblies.

Key pair generation. Signing assemblies.

Public key extraction. Distribution without private.

Token display. Short form identifier.

Part of .NET SDK. Assembly management.

# CAVEATS

.NET specific. Windows tool via Mono. Strong naming deprecated.

# HISTORY

**sn** (Strong Name tool) is part of the **.NET SDK** for creating and managing cryptographic keys for assembly signing.

# SEE ALSO

[mono](/man/mono)(1), [gacutil](/man/gacutil)(1), [mcs](/man/mcs)(1)
