# TAGLINE

Encode and decode with multiple base encodings.

# TLDR

**Encode** with base64

```basenc --base64 [file]```

**Encode** with base32

```basenc --base32 [file]```

**Decode** base64

```basenc --base64 -d [file.b64]```

Use **base16** (hex)

```basenc --base16 [file]```

Use **base2** (binary)

```basenc --base2 [file]```

# SYNOPSIS

**basenc** [_options_] [_file_]

# DESCRIPTION

**basenc** is a unified encoding/decoding tool supporting multiple base encodings including base64, base32, base16 (hex), base2 (binary), z85, and others. It consolidates functionality previously split across multiple tools.

The tool is part of GNU coreutils and provides a single interface for various encoding schemes.

# PARAMETERS

**--base64**
> Base64 encoding

**--base64url**
> Base64 URL-safe encoding

**--base32**
> Base32 encoding

**--base32hex**
> Base32 with extended hex alphabet

**--base16**
> Base16 (hexadecimal)

**--base2lsbf**
> Base2 (binary) least significant bit first

**--base2msbf**
> Base2 (binary) most significant bit first

**--z85**
> Z85 encoding (ZeroMQ)

**-d**, **--decode**
> Decode data

**-w**, **--wrap=**_cols_
> Wrap lines at width

**-i**, **--ignore-garbage**
> Ignore non-alphabet characters

# WORKFLOW

```bash
# Base64 encode
basenc --base64 file.bin

# Base32 decode
basenc --base32 -d file.b32

# Hexadecimal
basenc --base16 file.bin

# Binary representation
echo "A" | basenc --base2msbf
```

# CAVEATS

Relatively new tool (not on older systems). Some encodings less common. Wrapping behavior varies by encoding. Not all systems have basenc (fall back to base64/base32).

# HISTORY

**basenc** was added to GNU coreutils in version **8.31** (2019) to provide a unified interface for multiple encoding schemes.

# SEE ALSO

[base64](/man/base64)(1), [base32](/man/base32)(1), [xxd](/man/xxd)(1)
