# TAGLINE

Simplified curl wrapper for downloading

# TLDR

**Download file**

```wcurl [https://example.com/file.zip]```

**Download multiple**

```wcurl [url1] [url2]```

**Resume download**

```wcurl -c [url]```

**With output name**

```wcurl -o [filename] [url]```

# SYNOPSIS

**wcurl** [_-c_] [_-o file_] [_options_] _urls_

# PARAMETERS

**-c**
> Continue/resume.

**-o** _FILE_
> Output filename.

**--help**
> Show help.

# DESCRIPTION

**wcurl** is a thin wrapper around curl that provides sensible defaults for the common task of downloading files. It automatically enables a progress bar, follows redirects, and uses the remote filename for output, eliminating the need to specify common curl flags for simple downloads.

Resume support allows continuing interrupted downloads without manually configuring curl's range options. Multiple URLs can be specified to download several files in sequence, and a custom output filename can be provided when the remote name is not suitable.

The tool is designed for users who frequently use curl for downloads but find its default behavior (outputting to stdout with no progress indicator) inconvenient for that use case.

# CAVEATS

Wrapper around curl. Less flexible. Download-focused.

# HISTORY

**wcurl** provides a simpler interface to curl for the common case of downloading files.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [aria2c](/man/aria2c)(1)
