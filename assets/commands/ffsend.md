# TLDR

**Upload file**

```ffsend upload [file.zip]```

**Upload with password**

```ffsend upload -p [password] [file.zip]```

**Set download limit**

```ffsend upload -d [5] [file.zip]```

**Download file**

```ffsend download [url]```

**Delete uploaded file**

```ffsend delete [url]```

# SYNOPSIS

**ffsend** _command_ [_options_] [_file_|_url_]

# PARAMETERS

_COMMAND_
> Operation: upload, download, delete, info, history.

**upload** _FILE_
> Upload file and get share link.

**download** _URL_
> Download from share link.

**delete** _URL_
> Delete uploaded file.

**-p** _PASSWORD_, **--password** _PASSWORD_
> Protect with password.

**-d** _N_, **--downloads** _N_
> Maximum download count.

**-e** _TIME_, **--expiry** _TIME_
> Expiry time (e.g., 1h, 7d).

**--help**
> Display help information.

# DESCRIPTION

**ffsend** is a command-line client for Firefox Send, enabling secure file sharing through encrypted uploads. Files are end-to-end encrypted before upload and can be password protected.

The tool generates shareable links that expire after a set number of downloads or time period. Encryption happens client-side, ensuring the server never has access to unencrypted content.

ffsend works with official and self-hosted Send instances for private file sharing.

# CAVEATS

Official Firefox Send service was discontinued. Requires compatible Send server. Large files may take time to encrypt.

# HISTORY

ffsend was created as a CLI client for **Firefox Send**, Mozilla's encrypted file sharing service. While Mozilla discontinued the official service in 2020, self-hosted Send instances and ffsend remain usable.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [magic-wormhole](/man/magic-wormhole)(1)
