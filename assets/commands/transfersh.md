# TAGLINE

Self-hosted file sharing via command-line uploads

# TLDR

**Upload a file**

```curl --upload-file [file.txt] https://[transfer.example.com]/[file.txt]```

**Limit the number of downloads**

```curl --upload-file [file.txt] -H "Max-Downloads: [1]" https://[transfer.example.com]/[file.txt]```

**Set the number of days before deletion**

```curl --upload-file [file.txt] -H "Max-Days: [7]" https://[transfer.example.com]/[file.txt]```

**Show the delete URL for an upload**

```curl -sD - --upload-file [file.txt] https://[transfer.example.com]/[file.txt] | grep -i x-url-delete```

**Delete an upload**

```curl -X DELETE [x-url-delete-value]```

**Encrypt before uploading**

```gpg -c -o - [file] | curl --upload-file - https://[transfer.example.com]/[file.gpg]```

**Run a server with local storage**

```transfer.sh --provider local --basedir [/tmp/transfer]```

# SYNOPSIS

**curl** --upload-file _file_ [_-H header_] https://_host_/_name_

**transfer.sh** **--provider** _provider_ [_options_]

# PARAMETERS

**Max-Downloads:** _N_
> Request header: limit the number of downloads.

**Max-Days:** _N_
> Request header: days before deletion.

**X-Url-Delete**
> Response header containing the URL used to delete the upload.

**--provider** _NAME_
> Server option: storage provider (s3, storj, gdrive or local).

**--basedir** _PATH_
> Server option: storage path for the local and gdrive providers.

**--listener** _ADDR_
> Server option: address and port for HTTP.

**--max-upload-size** _KB_
> Server option: maximum upload size in kilobytes.

**--purge-days** _N_
> Server option: days after which uploads are purged automatically.

**--http-auth-user**, **--http-auth-pass**
> Server option: basic HTTP authentication for uploads.

# DESCRIPTION

**transfer.sh** is an open-source Go server for sharing files from the command line. Files are uploaded with standard HTTP PUT requests using curl, and the server returns a download URL.

Uploads can be limited with the **Max-Days** and **Max-Downloads** request headers, and each upload returns an **X-Url-Delete** response header for manual removal. Storage can be local disk, Amazon S3, Google Drive or Storj.

# CAVEATS

The project's maintainers say the repository is unrelated to any public instance and recommend running your own server, so availability of the transfer.sh website is not guaranteed. The README carries a security warning about an IP filter and HTTP auth bypass through a spoofed X-Forwarded-For header. Uploaded file URLs are public to anyone who has them, so encrypt sensitive data before uploading.

# HISTORY

**transfer.sh** was created by DutchCoders as a simple way to share files from the command line.

# SEE ALSO

[curl](/man/curl)(1), [wormhole](/man/wormhole)(1), [ffsend](/man/ffsend)(1)

# RESOURCES

```[Source code](https://github.com/dutchcoders/transfer.sh)```

<!-- verified: 2026-11-09 -->
