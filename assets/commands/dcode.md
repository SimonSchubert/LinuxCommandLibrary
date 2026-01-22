# TLDR

**Decode base64** encoded text

```dcode base64 "[encoded_text]"```

**Decode URL** encoding

```dcode url "[encoded%20text]"```

**Decode hex** to text

```dcode hex "[48656c6c6f]"```

**Decode ROT13** cipher

```dcode rot13 "[encoded_text]"```

**Decode from file**

```dcode base64 -f [encoded.txt]```

**Auto-detect** encoding and decode

```dcode auto "[unknown_encoding]"```

# SYNOPSIS

**dcode** _encoding_ [_options_] [_text_]

# PARAMETERS

_ENCODING_
> Encoding type: base64, url, hex, rot13, binary, etc.

_TEXT_
> Text to decode.

**-f**, **--file** _FILE_
> Read input from file.

**auto**
> Auto-detect encoding type.

**-o**, **--output** _FILE_
> Write decoded output to file.

**--help**
> Display help information.

# DESCRIPTION

**dcode** is a command-line utility for decoding text from various encoding schemes. It supports common encodings like Base64, URL encoding, hexadecimal, and simple ciphers like ROT13.

The tool is useful for quickly decoding strings encountered in logs, URLs, configuration files, or CTF challenges. The auto-detect feature attempts to identify the encoding automatically when the type is unknown.

dcode simplifies the workflow of decoding text that would otherwise require multiple tools or online services.

# CAVEATS

Auto-detection is heuristic and may misidentify encodings. Binary data may not display correctly in terminal. Some encodings have multiple variants that may decode differently.

# HISTORY

dcode is a utility tool designed to consolidate various decoding operations into a single command. Similar tools exist across different platforms, addressing the common need for quick text decoding in development and security workflows.

# SEE ALSO

[base64](/man/base64)(1), [xxd](/man/xxd)(1), [uudecode](/man/uudecode)(1)
