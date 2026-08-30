# TAGLINE

determines the MIME type of files using the shared-mime-info database

# TLDR

Show a file's **MIME type**

```mimetype [path/to/file]```

Check **several files** at once

```mimetype [path/to/file1] [path/to/file2]```

Print **only the type**, which is what scripts want

```mimetype --brief [path/to/file]```

Print a **human-readable description** instead of the type

```mimetype --describe --brief [path/to/file]```

Show **every rule that matched**, with debugging detail

```mimetype --debug --all [path/to/file]```

Classify data arriving on **standard input**

```[command] | mimetype --stdin --brief```

Judge by **content only**, ignoring the filename

```mimetype --magic-only [path/to/file]```

Follow a **symlink** instead of reporting the link itself

```mimetype --dereference [path/to/symlink]```

Print the description in **another language**

```mimetype --language [de] --describe [path/to/file]```

Read the list of files to check **from a file**

```mimetype --namefile [path/to/list.txt]```

# SYNOPSIS

**mimetype** [_options_] _files_...

# PARAMETERS

**-a, --all**
> Show the output of every rule that matches the file

**-b, --brief**
> Output only the MIME type, without the filename

**-d, --describe**
> Output a human-readable description instead of the MIME type

**-D, --debug**
> Show debugging information about how the type was determined

**--stdin**
> Read the data from standard input instead of a file

**-f, --namefile=**_file_
> Read the list of filenames to check from _file_

**-i, --mimetype**
> Print the MIME type in **file**(1) compatible output

**-L, --dereference**
> Follow symlinks and report on the target

**-l, --language=**_code_
> Set the output language using a 2-letter code

**-M, --magic-only**
> Determine the type from content only, ignoring the filename

**-N, --noalign**
> Do not pad the output into aligned columns

**-F, --separator=**_string_
> Use _string_ between the filename and the type

**--database=**_dirs_
> Use an alternative colon-separated list of MIME directories

# DESCRIPTION

**mimetype** determines the MIME type of files using the shared-mime-info database. It examines file contents (magic bytes) and filename patterns to identify the type, similar to the **file** command but outputting standard MIME types.

The tool is part of the File::MimeInfo Perl module and uses the freedesktop.org shared MIME database. It can detect thousands of file types including documents, images, audio, video, and application-specific formats.

Unlike simple extension-based detection, mimetype examines actual file contents, making it more reliable for files with incorrect or missing extensions.

# CAVEATS

Requires the shared-mime-info database to be installed. Detection accuracy depends on the quality and completeness of magic patterns in the database. Some proprietary formats may not be recognized.

# INSTALL

```pacman: sudo pacman -S perl-file-mimeinfo```

```apk: sudo apk add perl-file-mimeinfo```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[file](/man/file)(1), [xdg-mime](/man/xdg-mime)(1)
