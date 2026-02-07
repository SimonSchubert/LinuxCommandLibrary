# TAGLINE

Encode and decode base64 data.

# TLDR

**Encode** to base64

```base64 [file]```

**Decode** base64

```base64 -d [file.b64]```

Encode **string**

```echo [text] | base64```

Decode **string**

```echo [ENCODED] | base64 -d```

**No wrapping**

```base64 -w 0 [file]```

# SYNOPSIS

**base64** [_options_] [_file_]

# DESCRIPTION

**base64** encodes and decodes data using base64 encoding. Base64 represents binary data using 64 printable ASCII characters, making it suitable for transmitting binary data over text-only channels like email or JSON.

The tool is part of GNU coreutils and widely used for encoding credentials, certificates, and binary data in configuration files.

# PARAMETERS

**-d**, **--decode**
> Decode base64 data

**-i**, **--ignore-garbage**
> Ignore non-alphabet characters when decoding

**-w**, **--wrap=**_cols_
> Wrap lines at specified width (default: 76, 0 = no wrap)

# FEATURES

- Standard RFC 4648 encoding
- 33% size increase from binary
- URL and filename safe variant
- Padding with = characters

# WORKFLOW

```bash
# Encode file
base64 file.bin > file.b64

# Decode file
base64 -d file.b64 > file.bin

# Encode for use in JSON (no wrapping)
cat image.png | base64 -w 0

# Decode string
echo "SGVsbG8gV29ybGQ=" | base64 -d
```

# COMMON USES

- **HTTP Basic Auth** - `Authorization: Basic <base64-encoded-credentials>`
- **Data URLs** - `data:image/png;base64,iVBORw0KG...`
- **Kubernetes secrets** - Encoded in YAML manifests
- **JWT tokens** - Header and payload sections

# CAVEATS

Not encryption (easily reversible). Increases size by ~33%. Line wrapping can cause issues in some contexts. URL-safe variant needs different characters.

# HISTORY

**base64** has been part of GNU coreutils since version **6.0** (2006), implementing the base64 encoding standardized in RFC 4648 (2006).

# SEE ALSO

[base32](/man/base32)(1), [basenc](/man/basenc)(1), [openssl](/man/openssl)(1)
