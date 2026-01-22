# TLDR

**Enable anonymous FTP auth**

```auth sufficient pam_ftp.so```

**With custom users**

```auth sufficient pam_ftp.so users=ftp,anonymous```

**Ignore anonymous users**

```auth sufficient pam_ftp.so ignore```

# SYNOPSIS

**pam_ftp.so** [_options_]

# PARAMETERS

**users=**_LIST_
> Comma-separated user list.

**ignore**
> Ignore for non-anonymous.

# DESCRIPTION

**pam_ftp** provides anonymous FTP authentication. Uses email as password.

The module validates email format passwords. For FTP services.

pam_ftp handles FTP auth.

# CAVEATS

FTP specific. Email validation only. Security considerations.

# HISTORY

pam_ftp enables **anonymous FTP authentication** with email validation.

# SEE ALSO

[pam](/man/pam)(8), [vsftpd](/man/vsftpd)(8)

