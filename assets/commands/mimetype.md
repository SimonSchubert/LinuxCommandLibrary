# TLDR

Print the **MIME type** of a given file

```mimetype [path/to/file]```

Display only the MIME type, **not the filename**

```mimetype --brief [path/to/file]```

Display a **description** of the MIME type

```mimetype --describe [path/to/file]```

Determine the MIME type of **stdin**

```[command] | mimetype --stdin```

Display **debug information** about how the MIME type was determined

```mimetype --debug [path/to/file]```

Display **all possible MIME types** in confidence order

```mimetype --all [path/to/file]```

Specify the **language code** of the output

```mimetype --language [path/to/file]```

# SYNOPSIS

**mimetype** [_options_] _files_...

# PARAMETERS

**--brief, -b**
> Output only the MIME type without the filename

**--describe, -d**
> Output a human-readable description of the MIME type

**--stdin, -i**
> Read data from standard input instead of a file

**--debug, -D**
> Show debugging information about type detection

**--all, -a**
> List all possible MIME types with confidence scores

**--language _code_**
> Set the output language using a 2-letter code

# DESCRIPTION

**mimetype** determines the MIME type of files using the shared-mime-info database. It examines file contents (magic bytes) and filename patterns to identify the type, similar to the **file** command but outputting standard MIME types.

The tool is part of the File::MimeInfo Perl module and uses the freedesktop.org shared MIME database. It can detect thousands of file types including documents, images, audio, video, and application-specific formats.

Unlike simple extension-based detection, mimetype examines actual file contents, making it more reliable for files with incorrect or missing extensions.

# CAVEATS

Requires the shared-mime-info database to be installed. Detection accuracy depends on the quality and completeness of magic patterns in the database. Some proprietary formats may not be recognized.

# SEE ALSO

[file](/man/file)(1), [xdg-mime](/man/xdg-mime)(1), [mimeopen](/man/mimeopen)(1)
