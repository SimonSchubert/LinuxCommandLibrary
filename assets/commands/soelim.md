# TAGLINE

Resolve file inclusions in roff documents

# TLDR

**Process a file** and replace .so requests with included file contents

```soelim [path/to/file]```

**Process with additional include directories**

```soelim -I [path/to/includes] [path/to/file]```

**Process without emitting .lf requests**

```soelim -r [path/to/file]```

**Output for TeX processing** with TeX-style comments

```soelim -t [path/to/file]```

**Process multiple files**

```soelim [file1] [file2] [file3]```

# SYNOPSIS

**soelim** [**-Crtv**] [**-I** _dir_] [_file_...]

# PARAMETERS

**-C**
> Recognize .so requests even if characters other than space or newline follow.

**-I** _dir_
> Add directory to the search path for included files. Can be specified multiple times.

**-r**
> Do not emit **.lf** line number requests. Useful for non-groff files.

**-t**
> Emit TeX-style comment lines (**%**) instead of **.lf** requests for file and line tracking.

**-v**
> Print version number and exit.

# DESCRIPTION

**soelim** is a preprocessor for the groff document formatting system. It processes roff input files and replaces **.so** (source) requests with the actual contents of the referenced files, recursively flattening a tree of included documents.

The **.so** request in roff documents is used to include other files, similar to **#include** in C. However, these inclusions are normally processed by troff (the formatter) rather than preprocessors. soelim allows included files to be preprocessed before formatting, which is necessary when included files contain preprocessor directives.

soelim is typically invoked automatically by groff when the **-s** option is used. It reads from standard input if no files are specified.

# CAVEATS

The **.so** request must have no whitespace between the dot and "so" for soelim to recognize it. If whitespace is present, only groff/troff will process the request, and soelim will ignore it. The included file path is relative to the current directory unless **-I** paths are specified.

# HISTORY

**soelim** is part of the GNU **groff** (GNU troff) package, which is the GNU implementation of the traditional Unix document formatting system troff. The groff system has been developed since the late 1980s as a free software replacement for the proprietary Unix troff. soelim provides compatibility with traditional troff preprocessing workflows.

# SEE ALSO

[groff](/man/groff)(1), [troff](/man/troff)(1), [nroff](/man/nroff)(1), [man](/man/man)(1)
