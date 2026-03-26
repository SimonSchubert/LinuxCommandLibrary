# TAGLINE

Partial differential file downloader over HTTP

# TLDR

**Download a file using a .zsync URL**

```zsync [http://example.com/path/to/file.zsync]```

**Use a local file as seed for differential download**

```zsync -i [path/to/existing_file] [http://example.com/path/to/file.zsync]```

**Save downloaded file with a specific name**

```zsync -o [path/to/output_file] [http://example.com/path/to/file.zsync]```

**Save the .zsync file locally for future conditional requests**

```zsync -k [path/to/saved.zsync] [http://example.com/path/to/file.zsync]```

**Download in quiet mode without progress bar**

```zsync -q [http://example.com/path/to/file.zsync]```

**Authenticate with a server**

```zsync -A [hostname]=[user]:[password] [http://hostname/path/to/file.zsync]```

# SYNOPSIS

**zsync** [_OPTIONS_] _URL_

# PARAMETERS

**-i** _FILE_
> Use local file as seed for differential download. Can be specified multiple times.

**-o** _FILE_
> Save downloaded file with specified name instead of the default

**-k** _FILE_
> Save the downloaded .zsync file with the given filename. If the file already exists, makes a conditional request to only download if the server's copy is newer.

**-q**
> Quiet mode, suppress progress bar, download rate, and ETA display

**-s**
> Deprecated synonym for -q

**-u** _URL_
> Specify referring URL. Required when using a local .zsync file that contains relative URLs.

**-A** _hostname=username:password_
> Provide authentication credentials for the given hostname. Can be used multiple times for different servers.

**-V**
> Print version information

# DESCRIPTION

**zsync** is a partial/differential file downloader. It downloads only the changed parts of files using .zsync control files, similar to rsync but over HTTP.

Useful for updating large files like ISO images when only small parts have changed.

# CAVEATS

Requires a .zsync control file generated on the server side. The server must support HTTP range requests. HTTPS support depends on the build.

# SEE ALSO

[rsync](/man/rsync)(1), [wget](/man/wget)(1), [curl](/man/curl)(1)
