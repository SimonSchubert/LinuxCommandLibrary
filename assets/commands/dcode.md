# TAGLINE

recursively detect and decode encoded strings

# TLDR

**Detect and decode** a string recursively

```dcode "[NjM3YTQyNzQ1YTQ0NGUzMg==]"```

**Decode a Caesar cipher** with a known offset

```dcode -rot [11] "[spwwz hzcwo]"```

**Try all 26 offsets** of a Caesar cipher

```dcode -rot all "[bpgkta xh qtiitg iwpc sr]"```

**Reverse** a string

```dcode -rev "[hello world]"```

**Decode without third-party services** (skip online hash lookups)

```dcode -s "[string]"```

# SYNOPSIS

**dcode** [_options_] "_string_"

# PARAMETERS

**-rot** _offset_|**all**
> Decode a Caesar cipher with the given offset, or try all 26 offsets.

**-rev**
> Reverse the supplied string.

**-s**
> Safe mode: do not query third-party web services for hash lookups.

# DESCRIPTION

**dcode** is the command provided by **Decodify**, a tool that detects the encoding of a string and decodes it, recursively. If a decoded result is itself encoded, Decodify keeps going until it reaches plain text.

Supported encodings and ciphers include Base64, hexadecimal, decimal, binary, URL encoding, FromChar, and Caesar ciphers. It can also identify MD5, SHA1, and SHA2 hashes and attempt to resolve them via online hash lookup services.

The tool is popular for CTF challenges and security analysis, where layered or unknown encodings are common and manually chaining base64, xxd, and similar tools is tedious.

# CAVEATS

Hash "decoding" relies on third-party web lookup services; use -s to keep sensitive data offline. Encoding detection is heuristic and can misidentify short or ambiguous strings. Written in Python and installed from source (git clone, then make install).

# HISTORY

Decodify was created by security researcher Somdev Sangwan (s0md3v), also known for tools like XSStrike and Photon.

# SEE ALSO

[base64](/man/base64)(1), [xxd](/man/xxd)(1), [uudecode](/man/uudecode)(1)

# RESOURCES

```[Source code](https://github.com/s0md3v/Decodify)```

<!-- verified: 2026-07-11 -->
