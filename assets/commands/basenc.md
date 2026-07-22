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

**basenc** _encoding_ [_options_] [_file_]

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

**--base58**
> Base58 encoding (avoids visually similar characters; useful for transcription)

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
> Wrap encoded lines after _cols_ characters (default: 76, 0 = no wrap)

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

Exactly one encoding option is required. With **--z85**, encoding input length must be a multiple of 4 bytes and decoding input a multiple of 5. Relatively new tool (not on older systems); fall back to base64/base32 where basenc is unavailable.

# HISTORY

**basenc** was added to GNU coreutils in version **8.31** (2019) to provide a unified interface for multiple encoding schemes.

# INSTALL

```apt: sudo apt install coreutils```

```dnf: sudo dnf install coreutils```

```pacman: sudo pacman -S coreutils```

```apk: sudo apk add coreutils```

```zypper: sudo zypper install coreutils```

```brew: brew install coreutils```

```nix: nix profile install nixpkgs#coreutils```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[base64](/man/base64)(1), [base32](/man/base32)(1), [b2sum](/man/b2sum)(1), [xxd](/man/xxd)(1)

# RESOURCES

```[Source code](https://github.com/coreutils/coreutils)```

```[Documentation](https://www.gnu.org/software/coreutils/manual/html_node/basenc-invocation.html)```

<!-- verified: 2026-06-19 -->
