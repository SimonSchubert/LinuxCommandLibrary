# TAGLINE

detect character encoding of text files

# TLDR

**Detect encoding** of a file

```chardet [file.txt]```

**Detect encoding** of multiple files

```chardet [file1.txt] [file2.txt] [file3.txt]```

**Read from stdin**

```cat [file.txt] | chardet```

**Detect with verbose output**

```chardetect [file.txt]```

# SYNOPSIS

**chardet** [_file_...]

**chardetect** [_file_...]

# DESCRIPTION

**chardet** (or chardetect) is a command-line tool that detects the character encoding of text files. It uses the chardet library, which is a port of Mozilla's character encoding auto-detection algorithm.

The tool analyzes byte patterns in the file to determine the most likely encoding (UTF-8, ISO-8859-1, Windows-1252, etc.) and provides a confidence score. This is useful when dealing with files of unknown encoding or when preparing data for processing.

chardet is part of the Python chardet package and is commonly used in text processing pipelines where encoding must be determined before conversion.

# PARAMETERS

**file**
> One or more files to analyze.

**--help**
> Display help information.

**--version**
> Show version information.

# CAVEATS

Detection is heuristic and not 100% accurate, especially for short texts or ambiguous encodings. ASCII is a subset of many encodings, making detection difficult. The confidence score indicates reliability of the detection. Binary files may produce incorrect or low-confidence results.

# HISTORY

**chardet** is a Python implementation of the character encoding detection algorithm used in **Mozilla Firefox**. The original algorithm was developed by **Netscape/Mozilla** to handle the diversity of character encodings on the web. The Python port was created by **Mark Pilgrim** in **2006** and is now maintained by **Dan Blanchard** and the community.

# SEE ALSO

[file](/man/file)(1), [iconv](/man/iconv)(1), [uchardet](/man/uchardet)(1), [enca](/man/enca)(1)
