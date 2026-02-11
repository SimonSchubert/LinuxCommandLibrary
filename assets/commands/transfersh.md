# TAGLINE

Share files via command-line uploads

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

**transfer.sh** is a file sharing service designed for easy command-line use. Files are uploaded via standard HTTP PUT requests using curl, and the service returns a unique download URL that can be shared with others. No account or registration is required for basic uploads.

Uploads can be configured with expiration times and download limits through HTTP headers, giving control over how long files remain available and how many times they can be downloaded. Files are automatically deleted after the specified expiration period. The service also supports encryption by piping files through GPG before uploading.

Transfer.sh can be self-hosted as an open-source Go application or used through the public instance at transfer.sh. It supports uploads up to several gigabytes and provides delete URLs for manual removal of uploaded files.

# CAVEATS

External service. Size limits. Public URLs.

# HISTORY

**transfer.sh** was created as a simple file sharing service using the command line via curl.

# SEE ALSO

[curl](/man/curl)(1), [wormhole](/man/wormhole)(1), [ffsend](/man/ffsend)(1)
