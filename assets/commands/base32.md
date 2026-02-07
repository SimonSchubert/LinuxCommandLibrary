# TAGLINE

Encode and decode base32 data.

# TLDR

**Encode** to base32

```base32 [file]```

**Decode** base32

```base32 -d [file.b32]```

Encode **string**

```echo [text] | base32```

Decode **string**

```echo [ENCODED] | base32 -d```

# SYNOPSIS

**base32** [_options_] [_file_]

# DESCRIPTION

**base32** encodes and decodes data using base32 encoding. Base32 represents binary data using 32 ASCII characters (A-Z and 2-7), making it suitable for case-insensitive systems and human-readable tokens.

The tool is part of GNU coreutils and useful for encoding data in URLs, filenames, or other contexts where base64's case sensitivity or special characters are problematic.

# PARAMETERS

**-d**, **--decode**
> Decode base32 data

**-i**, **--ignore-garbage**
> Ignore non-alphabet characters when decoding

**-w**, **--wrap=**_cols_
> Wrap lines at specified width (default: 76, 0 = no wrap)

# FEATURES

- Case-insensitive encoding
- No special characters (URL-safe)
- Standard RFC 4648 implementation
- Padding with = characters

# WORKFLOW

```bash
# Encode file
base32 file.bin > file.b32

# Decode file
base32 -d file.b32 > file.bin

# Encode string
echo "Hello World" | base32

# Decode string
echo "JBSWY3DPEBLW64TMMQ======" | base32 -d
```

# CAVEATS

20% larger than base64 encoding. Less common than base64. Padding characters may need escaping in some contexts. Case-insensitive but output is uppercase.

# HISTORY

**base32** was added to GNU coreutils in version **8.25** (2016), implementing the base32 encoding specified in RFC 4648.

# SEE ALSO

[base64](/man/base64)(1), [basenc](/man/basenc)(1), [uuencode](/man/uuencode)(1)
