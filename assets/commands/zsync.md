# TAGLINE

Partial differential file downloader over HTTP

# TLDR

**Download** file

```zsync [path/to/url.zsync]```

Use **local seed** file

```zsync -i [path/to/existing_file] [path/to/url.zsync]```

**Save** with specific name

```zsync -i [path/to/existing_file] -o [path/to/new_file] [path/to/url.zsync]```

**Keep** partial download

```zsync -k [path/to/url.zsync]```

**Quiet** mode

```zsync -q [path/to/url.zsync]```

# SYNOPSIS

**zsync** [_OPTIONS_] _URL_

# PARAMETERS

**-i** _FILE_
> Use local file as seed for differential download

**-o** _FILE_
> Save downloaded file with specified name

**-k**
> Keep partial download files

**-q**
> Quiet mode (no progress)

**-u** _URL_
> Override URL in .zsync file

# DESCRIPTION

**zsync** is a partial/differential file downloader. It downloads only the changed parts of files using .zsync control files, similar to rsync but over HTTP.

Useful for updating large files like ISO images when only small parts have changed.

# CAVEATS

HTTPS not supported - use HTTP URLs only. Requires .zsync control file from server. Server must support range requests.

# SEE ALSO

[rsync](/man/rsync)(1), [wget](/man/wget)(1), [curl](/man/curl)(1)
