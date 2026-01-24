# TLDR

**Encode a binary file** for transmission

```uuencode [file] [encoded_name] > [output.txt]```

**Encode using base64** instead of UU encoding

```uuencode -m [file] [encoded_name]```

**Encode from stdin**

```cat [file] | uuencode [encoded_name]```

**Encode and email a file**

```uuencode [file] [file] | mail -s "Subject" [user@example.com]```

**Compress and encode** for transmission

```gzip -c [file] | uuencode [file.gz]```

# SYNOPSIS

**uuencode** [_-m_] [_file_] _name_

# PARAMETERS

**-m**
> Use base64 encoding instead of traditional UU encoding.

_file_
> Input file to encode (uses stdin if omitted).

_name_
> Name to store in the encoded output for uudecode to use.

# DESCRIPTION

**uuencode** encodes binary files into ASCII text for transmission over channels that only support text, such as email or older network protocols. The encoded output includes the file mode and name for reconstruction by uudecode.

By default, uuencode uses traditional UU encoding (Unix-to-Unix encoding). The **-m** option enables base64 encoding, which is more widely used in modern systems. UU encoding expands file size by approximately 37%, while base64 expands by 35%.

The output format includes a header line with file permissions and name, encoded data lines, and a termination line.

# CAVEATS

uuencode is largely obsolete for email, having been replaced by MIME base64 encoding. Modern systems typically use **base64** command directly. Ensure the same encoding method is used for encode and decode operations.

# HISTORY

uuencode was developed at Bell Labs and first appeared in **BSD 4.0** in the early 1980s. It was created to solve the problem of transmitting binary files over UUCP (Unix-to-Unix Copy Protocol) networks, which could only handle 7-bit ASCII. The "uu" prefix stands for "Unix-to-Unix". While largely superseded by MIME for email, it remains useful for simple binary-to-text encoding tasks.

# SEE ALSO

[uudecode](/man/uudecode)(1), [base64](/man/base64)(1), [mail](/man/mail)(1)
