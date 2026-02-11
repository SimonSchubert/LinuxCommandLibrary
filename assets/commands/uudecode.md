# TAGLINE

Decode uuencoded binary files

# TLDR

**Decode a uuencoded file**

```uudecode [encoded.txt]```

**Decode to a specific output file**

```uudecode -o [output] [encoded.txt]```

**Decode from stdin**

```cat [encoded.txt] | uudecode```

**Decode multiple files**

```uudecode [file1.txt] [file2.txt]```

# SYNOPSIS

**uudecode** [_-o outfile_] [_file ..._]

# PARAMETERS

**-o** _outfile_
> Write output to specified file instead of the name in the encoded data.

_file_
> Input file(s) to decode (uses stdin if omitted).

# DESCRIPTION

**uudecode** transforms uuencoded files back to their original binary form. It automatically detects whether the input uses traditional UU encoding or base64 encoding and handles both formats.

By default, the output filename is taken from the encoded file's header line. The **-o** option overrides this. File permissions are restored from the encoded header, except that setuid and execute bits are not retained for security.

When multiple files are specified, each is decoded separately.

# CAVEATS

Setuid and execute bits from the original file are stripped for security. The output filename in the encoded header can be a security risk if decoding untrusted files; use **-o** to specify a safe output path. Ensure the encoded file was created with the same encoding method (UU or base64).

# HISTORY

uudecode was developed at Bell Labs and first appeared in **BSD 4.0** in the early 1980s as the counterpart to uuencode. Together they enabled binary file transfer over text-only UUCP networks. While largely superseded by MIME for email attachments, the commands remain available on Unix-like systems for backward compatibility and simple encoding tasks.

# SEE ALSO

[uuencode](/man/uuencode)(1), [base64](/man/base64)(1), [mail](/man/mail)(1)
