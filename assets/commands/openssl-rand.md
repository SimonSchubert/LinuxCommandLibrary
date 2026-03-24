# TAGLINE

Generate pseudo-random bytes

# TLDR

**Generate 32 random bytes** as hexadecimal

```openssl rand -hex [32]```

**Generate 24 random bytes** as Base64

```openssl rand -base64 [24]```

**Write 256 random bytes** to a file

```openssl rand -out [path/to/file] [256]```

**Generate a random password** (16 bytes, Base64 encoded)

```openssl rand -base64 [16]```

# SYNOPSIS

**openssl** **rand** [**-help**] [**-out** _file_] [**-base64**] [**-hex**] [**-engine** _id_] [**-rand** _files_] [**-writerand** _file_] [**-provider** _name_] [**-provider-path** _path_] [**-propquery** _propq_] _num_

# PARAMETERS

**-help**
> Print usage message and exit.

**-out** _file_
> Write output to _file_ instead of standard output.

**-base64**
> Encode the output using Base64.

**-hex**
> Display the output as a hexadecimal string.

**-engine** _id_
> Specify an engine for random generation (deprecated in OpenSSL 3.0).

**-rand** _files_
> Specify additional random data source files.

**-writerand** _file_
> Write random state to _file_ on exit.

**-provider** _name_
> Specify the provider to use for random generation.

**-provider-path** _path_
> Path to search for providers.

**-propquery** _propq_
> Property query for provider selection.

**_num_**
> The number of random bytes to generate (required).

# DESCRIPTION

**openssl rand** generates a specified number of pseudo-random bytes using a cryptographically secure pseudo-random number generator (CSPRNG). It calls **RAND_bytes(3)** internally, which provides **256-bit security strength** when properly seeded from the operating system's entropy source.

The output can be written as raw binary, Base64-encoded, or hexadecimal. Common uses include generating random passwords, encryption keys, initialization vectors, and nonces for cryptographic operations.

# CAVEATS

The command fails with a nonzero exit code if the CSPRNG cannot be properly seeded from the operating system's entropy source. When using **-base64**, the actual output is larger than _num_ bytes due to Base64 encoding expansion (roughly 4/3 ratio plus line breaks). The **-engine** option is deprecated as of OpenSSL 3.0 in favor of the provider-based architecture.

# HISTORY

**openssl rand** has been part of OpenSSL since at least **version 0.9.x** (circa **2000**). The **-engine** option was deprecated in **OpenSSL 3.0** (released **2021**), which introduced the provider-based architecture as a replacement. OpenSSL itself was started in **1998** as a fork of SSLeay.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-dgst](/man/openssl-dgst)(1)
