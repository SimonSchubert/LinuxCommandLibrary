# TAGLINE

Hide data within image and audio files

# TLDR

**Embed** data in an image

```steghide embed -cf [path/to/image.jpg] -ef [path/to/data.txt]```

**Extract** data from a file

```steghide extract -sf [path/to/image.jpg]```

Display **file information**

```steghide info [path/to/file.jpg]```

Embed with **maximum compression**

```steghide embed -cf [path/to/image.jpg] -ef [path/to/data.txt] -z 9```

List **encryption algorithms**

```steghide encinfo```

Embed with **specific encryption**

```steghide embed -cf [path/to/image.jpg] -ef [path/to/data.txt] -e blowfish cbc```

Extract to **specific file**

```steghide extract -sf [path/to/image.jpg] -xf [path/to/output.txt]```

# SYNOPSIS

**steghide** _command_ [_arguments_]

# COMMANDS

**embed**
> Hide data in a cover file

**extract**
> Retrieve hidden data from stego file

**info**
> Display file information and detect embedded data

**encinfo**
> List available encryption algorithms and modes

# PARAMETERS

**-cf, --coverfile** _file_
> Cover file for embedding

**-ef, --embedfile** _file_
> File to embed (stdin if omitted)

**-sf, --stegofile** _file_
> Stego file (input for extract, output for embed)

**-xf, --extractfile** _file_
> Output filename for extracted data

**-e, --encryption** _algo_ [_mode_]
> Encryption algorithm and mode (default: rijndael-128 cbc)

**-z, --compress** _level_
> Compression level 1-9

**-Z, --dontcompress**
> Skip compression

**-p, --passphrase** _pass_
> Supply passphrase

**-K, --nochecksum**
> Omit CRC32 checksum

**-N, --dontembedname**
> Don't embed original filename

**-f, --force**
> Overwrite existing files

**-v, --verbose**
> Detailed output

**-q, --quiet**
> Suppress messages

# DESCRIPTION

**steghide** is a steganography tool that hides data within JPEG, BMP, WAV, and AU files. It compresses and encrypts the secret data before embedding it in positions that preserve the cover file's statistical properties, making detection difficult.

The tool uses a graph-theoretic approach to find optimal embedding positions. Default encryption is AES-128 in CBC mode with a user-provided passphrase. The embedded data's integrity is verified using CRC32 checksums.

# CAVEATS

Cover file capacity depends on file size and content; **info** command shows available space. Heavily compressed images have less embedding capacity. Strong passphrases are essential for security. The cover file is modified in place unless **-sf** specifies output.

# HISTORY

**steghide** was created by **Stefan Hetzl** and first released in **2003**. It remains one of the most widely used open-source steganography tools, commonly used in CTF competitions, security research, and privacy applications. The tool is available in most Linux distribution repositories.

# SEE ALSO

[stegsnow](/man/stegsnow)(1), [outguess](/man/outguess)(1), [openstego](/man/openstego)(1)
