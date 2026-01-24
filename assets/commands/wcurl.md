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

**wcurl** is a curl wrapper. It simplifies downloads.

Sensible defaults. Good for downloading.

Progress bar. Visual feedback.

Resume support. Continue partial.

Simpler than curl. Fewer options needed.

# CAVEATS

Wrapper around curl. Less flexible. Download-focused.

# HISTORY

**wcurl** provides a simpler interface to curl for the common case of downloading files.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [aria2c](/man/aria2c)(1)
