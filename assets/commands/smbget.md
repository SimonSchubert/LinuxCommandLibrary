# TAGLINE

Download files from SMB/CIFS shares

# TLDR

**Download** a file from SMB server

```smbget smb://server/share/file```

Download **recursively**

```smbget --recursive smb://server/share/```

Download with **username and password**

```smbget -U username%password smb://server/share/file```

Download with **encryption**

```smbget -e smb://server/share/file```

**Resume** interrupted download

```smbget -r smb://server/share/file```

Download only **newer** files

```smbget -u smb://server/share/file```

Write to **stdout**

```smbget --stdout smb://server/share/file```

# SYNOPSIS

**smbget** [_options_] _smb://host/share/file_

# DESCRIPTION

**smbget** is a simple utility with wget-like semantics that can download files from SMB servers. Files are specified using SMB URL format.

# PARAMETERS

**-r, --resume**
> Automatically resume interrupted downloads

**--recursive**
> Download directories and their contents recursively

**-u, --update**
> Only download files newer than local copies

**-o, --outputfile FILE**
> Specify output filename

**--stdout**
> Write downloaded data to stdout

**-U, --user=[DOMAIN/]USERNAME%[PASSWORD]**
> Specify SMB credentials

**-a, --guest**
> Connect as guest user

**-e, --encrypt**
> Enable SMB encryption for transfer

**-N, --no-pass**
> Do not prompt for password

**-W, --workgroup=WORKGROUP**
> Specify SMB workgroup/domain

**-A, --authentication-file=FILE**
> Read credentials from file

**--limit-rate=INT**
> Limit download bandwidth in KB/s

**-q, --quiet**
> Suppress output messages

**-v, --verbose**
> Enable verbose output

**-D, --dots**
> Show progress dots

# CAVEATS

Including passwords on the command line is a security risk. Use interactive password entry, Kerberos authentication, or a credentials file for better security. SMB URLs use the format smb://[user@]host/share/path.

# HISTORY

**smbget** is part of the **Samba** suite, providing a wget-like interface for downloading files from Windows/SMB file shares.

# SEE ALSO

[smbclient](/man/smbclient)(1), [wget](/man/wget)(1), [curl](/man/curl)(1)
