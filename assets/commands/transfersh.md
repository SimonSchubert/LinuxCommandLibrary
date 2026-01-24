# TLDR

**Upload file**

```curl --upload-file [file.txt] https://transfer.sh/[filename]```

**Upload with max downloads**

```curl --upload-file [file.txt] -H "Max-Downloads: [1]" https://transfer.sh/```

**Upload with expiry**

```curl --upload-file [file.txt] -H "Max-Days: [7]" https://transfer.sh/```

**Delete upload**

```curl -X DELETE [delete-url]```

**Encrypt upload**

```cat [file] | gpg -c | curl --upload-file - https://transfer.sh/[file.gpg]```

# SYNOPSIS

**curl** --upload-file _file_ [_-H headers_] https://transfer.sh/[_name_]

# PARAMETERS

**--upload-file**
> File to upload.

**Max-Downloads:** _N_
> Download limit.

**Max-Days:** _N_
> Days until expiry.

**-X DELETE**
> Delete file.

# DESCRIPTION

**transfer.sh** shares files. It's a file sharing service.

Simple uploading. curl compatible.

Expiration support. Auto-delete.

Download limits. Control access.

No registration. Anonymous uploads.

# CAVEATS

External service. Size limits. Public URLs.

# HISTORY

**transfer.sh** was created as a simple file sharing service using the command line via curl.

# SEE ALSO

[curl](/man/curl)(1), [wormhole](/man/wormhole)(1), [ffsend](/man/ffsend)(1)
