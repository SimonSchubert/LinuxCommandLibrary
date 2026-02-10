# TAGLINE

extracts files from MIME-encoded messages

# TLDR

**Extract MIME attachments**

```munpack [message.mime]```

**Extract from stdin**

```cat [email.eml] | munpack```

**Extract to specific directory**

```munpack -C [output_dir] [message.mime]```

**Quiet mode**

```munpack -q [message.mime]```

**Force overwrite**

```munpack -f [message.mime]```

# SYNOPSIS

**munpack** [_options_] [_files_...]

# PARAMETERS

**-f**
> Force overwrite existing files.

**-q**
> Quiet mode.

**-t**
> Text mode (convert newlines).

**-C** _dir_
> Extract to directory.

# DESCRIPTION

**munpack** extracts files from MIME-encoded messages. It decodes base64 and quoted-printable content and saves attachments as separate files.

munpack is the companion to mpack and handles multipart MIME messages.

# EXAMPLE

```bash
# Extract from email
munpack saved_email.eml

# Extract from mailbox
formail -s munpack < mbox

# Extract to specific folder
munpack -C ~/attachments email.mime
```

# SUPPORTED ENCODINGS

```
- Base64
- Quoted-printable
- Uuencode (legacy)
- BinHex (legacy)
```

# CAVEATS

Filenames may be sanitized. Nested MIME may need multiple passes. Some legacy encodings not fully supported.

# HISTORY

munpack was written by **John G. Myers** at Carnegie Mellon University as part of the MIME utilities for handling email attachments.

# SEE ALSO

[mpack](/man/mpack)(1), [uudecode](/man/uudecode)(1), [base64](/man/base64)(1), [ripmime](/man/ripmime)(1)
